package demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/3/24.
 */

public class Dijkstra {
   // private int mEdgNum;		// 边的数量
   // private char[] mVexs;	   // 顶点集合
  //  private int[][] mMatrix;	// 邻接矩阵
    private static final int INF = Integer.MAX_VALUE;   // 最大值
    /*
     * Dijkstra最短路径。
     * 即，统计图中"顶点vs"到其它各个顶点的最短路径。
     *
     * 参数说明：
     *	   vs -- 起始顶点(start vertex)。即计算"顶点vs"到其它顶点的最短路径。
     *	 prev -- 前驱顶点数组。即，prev[i]的值是"顶点vs"到"顶点i"的最短路径所经历的全部顶点中，位于"顶点i"之前的那个顶点。
     *	 dist -- 长度数组。即，dist[i]是"顶点vs"到"顶点i"的最短路径的长度。
     */
    public List<String> calc(int start,int vs, int[] prev, int[] dist) {
        // flag[i]=true表示"顶点vs"到"顶点i"的最短路径已成功获取
        boolean[] flag = new boolean[BuildMap.mVexs.length];

        // 初始化
        for (int i = 0; i < BuildMap.mVexs.length; i++) {
            flag[i] = false;          // 顶点i的最短路径还没获取到。
            prev[i] = vs;              // 顶点i的前驱顶点为0。
            dist[i] = BuildMap.map[vs][i];  // 顶点i的最短路径为"顶点vs"到"顶点i"的权。
        }

        // 对"顶点vs"自身进行初始化
        flag[vs] = true;
        dist[vs] = 0;

        // 遍历mVexs.length-1次；每次找出一个顶点的最短路径。
        int k = 0;
        for (int i = 1; i < BuildMap.mVexs.length; i++) {
            // 寻找当前最小的路径；
            // 即，在未获取最短路径的顶点中，找到离vs最近的顶点(k)。
            int min = INF;
            for (int j = 0; j < BuildMap.mVexs.length; j++) {
                if (flag[j] == false && dist[j] < min) {
                    min = dist[j];
                    k = j;
                }
            }
            // 标记"顶点k"为已经获取到最短路径
            flag[k] = true;

            // 修正当前最短路径和前驱顶点
            // 即，当已经"顶点k的最短路径"之后，更新"未获取最短路径的顶点的最短路径和前驱顶点"。
            for (int j = 0; j < BuildMap.mVexs.length; j++) {
                int tmp = (BuildMap.map[k][j] == INF ? INF : (min + BuildMap.map[k][j]));
                if (flag[j] == false && (tmp < dist[j])) {
                    dist[j] = tmp;
                    prev[j] = k;
                }
            }
        }

        // 打印dijkstra最短路径的结果
        int   i = vs;
        int j = 0;
        if (start==-1) {

            if (dist[0] <= dist[1] && dist[0] <= dist[2] && dist[0] <= dist[3]) j = 0;
            else if (dist[1] <= dist[0] && dist[1] <= dist[2] && dist[1] <= dist[3]) j = 1;
            else if (dist[2] <= dist[0] && dist[2] <= dist[1] && dist[2] <= dist[3]) j = 2;
            else if (dist[3] <= dist[0] && dist[3] <= dist[1] && dist[3] <= dist[2]) j = 3;
            //System.out.println(dist[0] + " " + dist[1] + " " + dist[2] + " " + dist[3]);
        } else j = start;
        //System.out.println(j);
        List<String>  str = new ArrayList<String>();
        //String [] str = new String[] ;
        //int len = 0;
        str.add(BuildMap.room.get(j));
     //   System.out.print(BuildMap.room.get(j));
        if (BuildMap.buliding[j] == prev[j]&&BuildMap.stair.containsKey(j)||BuildMap.bulidingDown[j] == prev[j]&&BuildMap.stair.containsKey(j)) {
         //   System.out.print("---->" + BuildMap.stair.get(j));
            str.add(BuildMap.stair.get(j));
        }
        while (j != i) {
         //  System.out.print("---->"+BuildMap.room.get(prev[j]) );
            str.add(BuildMap.room.get(prev[j]));
           j = prev[j];
           if (BuildMap.buliding[j] == prev[j]&&BuildMap.stair.containsKey(j)||BuildMap.bulidingDown[j] == prev[j]&&BuildMap.stair.containsKey(j)){
               //System.out.print("---->"+BuildMap.stair.get(j));
               str.add(BuildMap.stair.get(j));
           }
        }
       // System.out.println();


        return str;
    }

}

