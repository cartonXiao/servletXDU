package demo;

import java.util.*;

/**
 * Created by Administrator on 2016/3/24.
 */
public class BuildMap {
    final static int MAPSIZE = 82;
   // List<List<Integer>> mylist = new ArrayList<ArrayList<Integer>>()
   //       mylist.
    public static int[] mVexs = new int [MAPSIZE];
    public static int [][] map = new int[MAPSIZE][MAPSIZE];
    public static  Map<Integer,String> room = new HashMap<Integer, String>();
    public static  Map<Integer,String> stair = new HashMap<Integer, String>();
    public static int[] buliding = new int[MAPSIZE];
    public static int[] bulidingDown = new int[MAPSIZE];
    BuildMap(){
        createRoom();
        createMap();
        createStair();
        createBuliding();
    }
    public void createStair(){
        stair.put(4,"楼梯A");
        stair.put(8,"楼梯A");
        stair.put(17,"楼梯A");
        stair.put(29,"楼梯A");
        stair.put(50,"楼梯A");
        stair.put(5,"楼梯B");
        stair.put(10,"楼梯B");
        stair.put(19,"楼梯B");
        stair.put(31,"楼梯B");
        stair.put(6,"楼梯C");
        stair.put(51,"楼梯C");
        stair.put(11,"楼梯C");
        stair.put(20,"楼梯C");
        stair.put(32,"楼梯C");
        stair.put(7,"楼梯C");
        stair.put(12,"楼梯C");
        stair.put(21,"楼梯C");
        stair.put(33,"楼梯C");
        stair.put(52,"楼梯C");
        stair.put(13,"楼梯D");
        stair.put(22,"楼梯D");
        stair.put(34,"楼梯D");
        stair.put(53,"楼梯D");
        stair.put(14,"楼梯D");
        stair.put(23,"楼梯D");
        stair.put(35,"楼梯D");
        stair.put(54,"楼梯D");
        stair.put(69,"楼梯D");
        stair.put(15,"楼梯E");
        stair.put(24,"楼梯E");
        stair.put(36,"楼梯E");
        stair.put(55,"楼梯E");
        stair.put(16,"楼梯E");
        stair.put(25,"楼梯E");
        stair.put(37,"楼梯E");
        stair.put(56,"楼梯E");
        stair.put(70,"楼梯E");
        stair.put(26,"楼梯F");
        stair.put(38,"楼梯F");
        stair.put(57,"楼梯F");
        stair.put(71,"楼梯F");
        stair.put(27,"楼梯G");
        stair.put(39,"楼梯G");
        stair.put(58,"楼梯G");
        stair.put(72,"楼梯G");

        stair.put(40,"楼梯G");
        stair.put(59,"楼梯G");
        stair.put(73,"楼梯G");
        stair.put(78,"楼梯G");

        stair.put(28,"楼梯H");
        stair.put(41,"楼梯H");
        stair.put(60,"楼梯H");
        stair.put(74,"楼梯H");
        stair.put(79,"楼梯H");
        stair.put(42,"楼梯H");
        stair.put(61,"楼梯H");
        stair.put(75,"楼梯H");
        stair.put(43,"楼梯I");
        stair.put(62,"楼梯I");
        stair.put(76,"楼梯I");
        stair.put(80,"楼梯I");
        stair.put(44,"楼梯J");
        stair.put(63,"楼梯J");
        stair.put(77,"楼梯J");
        stair.put(81,"楼梯J");
        //stair.put(79,"H");
        stair.put(45,"楼梯L");
        stair.put(64,"楼梯L");
        stair.put(46,"楼梯L");
        stair.put(65,"楼梯L");

        stair.put(48,"楼梯K");
        stair.put(49,"楼梯K");
        stair.put(67,"楼梯K");
        stair.put(68,"楼梯K");


    }
    public void createBuliding(){
            for(int i =0;i<buliding.length;i++){
                buliding[i] = 0;
            }
        buliding[4] = 8;
        buliding[8] = 17;
        buliding[17] = 29;
        buliding[29] = 50;
        buliding[5] = 10;
        buliding[10] = 19;
        buliding[19] = 31;
        buliding[31] = 51;
        buliding[6] = 11;
        buliding[11] = 20;
        buliding[20] = 32;
        buliding[32] = 51;
        buliding[7] = 12;
        buliding[12] = 21;
        buliding[21] = 33;
        buliding[33] = 52;
        buliding[13] =22;
        buliding[22] = 34;
        buliding[34] = 53;
        buliding[14] = 23;
        buliding[23] = 35;
        buliding[35] = 54;
        buliding[54] = 69;
        buliding[15] = 24;
        buliding[24] = 36;
        buliding[36] = 55;
        buliding[16] = 25;
        buliding[25] = 37;
        buliding[37] = 56;
        buliding[56] = 70;
        buliding[26] = 38;
        buliding[38] = 57;
        buliding[57] = 71;
        buliding[27] =39;
        buliding[39] = 58;
        buliding[58] = 72;
        buliding[40] = 59;
        buliding[59] = 73;
        buliding[73] = 78;
        buliding[28] = 41;
        buliding[41] = 60;
        buliding[60] = 74;
        buliding[42] = 61;
        buliding[61] = 75;
        //buliding[75] = 79;
        buliding[74] = 79;
        buliding[43] = 62;
        buliding[62] = 76;
        buliding[76] = 80;
        buliding[44] = 63;
        buliding[63] = 77;
        buliding[77] = 81;

        buliding[45] = 64;
        buliding[46] = 65;
        buliding[47] = 66;
        buliding[48] = 68;
        buliding[49] = 67;
        for(int i =0;i<bulidingDown.length;i++){
            bulidingDown[buliding[i]] =  i;
        }
    }
    public void createRoom(){

        room.put(0,"入口A");
        room.put(1,"入口B");
        room.put(2,"入口C");
        room.put(3,"入口D");

        room.put(4,"101");
        room.put(5,"105");
        room.put(6,"106");
        room.put(7,"107");

        room.put(8,"201");
        room.put(9,"203");
        room.put(10,"206");
        room.put(11,"207");
        room.put(12,"208");
        room.put(13,"211");
        room.put(14,"215");
        room.put(15,"216");
        room.put(16,"217");

        room.put(17,"301");
        room.put(18,"303");
        room.put(19,"306");
        room.put(20,"307");
        room.put(21,"308");
        room.put(22,"311");
        room.put(23,"312");
        room.put(24,"314");
        //room.put(25,"315");
        room.put(25,"315");
        room.put(26,"316");
        room.put(27,"318");
        room.put(28,"320");

        room.put(29,"401");
        room.put(30,"403");
        room.put(31,"406");
        room.put(32,"407");
        room.put(33,"408");
        room.put(34,"411");
        room.put(35,"412");
        room.put(36,"414");
        room.put(37,"415");
        room.put(38,"416");
        room.put(39,"418");
        room.put(40,"419");
        room.put(41,"421");
        room.put(42,"422");
        room.put(43,"425");
        room.put(44,"426");
        room.put(45,"433");
        room.put(46,"434");
        room.put(47,"437");
        room.put(48,"442");
        room.put(49,"443");

        room.put(50,"501");
        room.put(51,"502");
        room.put(52,"503");
        room.put(53,"506");
        room.put(54,"507");
        room.put(55,"509");
        room.put(56,"510");
        room.put(57,"511");
        room.put(58,"513");
        room.put(59,"514");
        room.put(60,"516");
        room.put(61,"517");
        room.put(62,"520");
        room.put(63,"521");
        room.put(64,"528");
        room.put(65,"529");
        room.put(66,"532");
        room.put(67,"537");
        room.put(68,"538");

        room.put(69,"601");
        room.put(70,"602");
        room.put(71,"603");
        room.put(72,"605");
        room.put(73,"606");
        room.put(74,"608");
        room.put(75,"609");
        room.put(76,"612");
        room.put(77,"613");

        room.put(78,"701");
        room.put(79,"703");
        room.put(80,"706");
        room.put(81,"707");
    }
    public void createMap () {
        for (int i=0;i<mVexs.length;i++)
            for (int j=0;j<mVexs.length;j++)
                map[i][j] = Integer.MAX_VALUE;
        map[0][1] = 3;
        map[1][2] = 1;
        map[2][3] = 4;
        //入口到一楼教室
        map[0][4] = 2;
        map[0][5] = 1;
        map[0][6] = 1;
        map[0][7] = 2;

       /* map[1][4] = 3;
        map[1][5] = 3;
        map[1][6] = 3;
        map[1][7] = 3;

        map[2][4] = 4;
        map[2][5] = 4;
        map[2][6] = 4;
        map[2][7] = 4;

        map[3][4] = 25;
        map[3][5] = 23;
        map[3][6] = 23;
        map[3][7] = 24;

        //入口到二楼三楼的一层教室
        map[0][13] = 9;
        map[0][14] = 10;
        map[0][15] = 14;
        map[0][16] = 15;
        map[0][28] = 25;
*/
        map[1][13] = 1;
        map[1][14] = 1;
        map[1][15] = 2;
        map[1][16] = 3;

        map[2][13] = 3;
        map[2][14] = 2;
        map[2][15] = 1;
        map[2][16] = 2;

        map[3][28] = 1;

        //一楼到二楼
        map[4][8] = 3;
        map[5][10] = 3;
        map[6][11] = 3;
        //二楼到三楼
        map[8][17] = 3;
        map[10][19] = 3;
        map[11][20] = 3;
        map[13][22] = 3;
        map[15][24] = 3;
        map[16][25] = 3;
        map[27][39] = 3;
        //三楼到四楼
        map[17][29] = 3;
        map[19][31] = 3;
        map[20][32] = 3;
        map[22][34] = 3;
        map[24][36] = 3;
        map[25][37] = 3;
        map[27][39] = 3;
        map[28][41] = 3;
        //四楼到五楼
        map[29][50] = 3;
        map[31][51] = 3;
        map[32][51] = 3;
        map[34][53] = 3;
        map[36][55] = 3;
        map[37][56] = 3;
        map[39][58] = 3;
        map[41][60] = 3;
        map[43][62] = 3;
        map[44][63] = 3;
       //五楼到六楼
        map[54][69] = 3;
        map[56][70] = 3;
        map[58][72] = 3;
        map[60][74] = 3;
        map[62][76] = 3;
        map[63][77] = 3;
        //六楼到七楼
        map[73][78] = 3;
        map[74][79] = 3;
        map[76][80] = 3;
        map[77][81] = 3;
        //一层
        map[4][5] = 1;
        map[5][6] = 1;
        map[6][7] = 1;
        map[8][9] = 1;
        map[9][10] = 1;
        map[10][11] = 1;
        map[11][12] = 1;
        map[12][13] = 1;
        map[13][14] = 1;
        map[14][15] = 1;
        map[15][16] = 1;
        map[17][18] = 1;
        map[18][19] = 1;
        map[19][20] = 1;
        map[20][21] = 1;
        map[21][22] = 1;
        map[22][23] = 1;
        map[23][24] = 1;
        map[24][25] = 1;
        map[25][26] = 1;
        map[26][27] = 1;
        map[29][30] = 1;
        map[30][31] = 1;
        map[31][32] = 1;
        map[32][33] = 1;
        map[33][34] = 1;
        map[34][35] = 1;
        map[35][36] = 1;
        map[36][37] = 1;
        map[37][38] = 1;
        map[38][39] = 1;
        map[39][40] = 1;
        map[40][41] = 1;
        map[41][42] = 1;
        map[42][43] = 1;
        map[43][44] = 1;
        map[50][51] = 1;
        map[51][52] = 1;
        map[52][53] = 1;
        map[53][54] = 1;
        map[54][55] = 1;
        map[55][56] = 1;
        map[56][57] = 1;
        map[57][58] = 1;
        map[58][59] = 1;
        map[59][60] = 1;
        map[60][61] = 1;
        map[61][62] = 1;
        map[62][63] = 1;
        map[69][70] = 1;
        map[70][71] = 1;
        map[71][72] = 1;
        map[72][73] = 1;
        map[73][74] = 1;
        map[74][75] = 1;
        map[75][76] = 1;
        map[76][77] = 1;

        map[78][79] = 1;
        map[79][80] = 1;
        map[80][81] = 1;

        map[45][46] = 1;
        map[46][47] = 1;
        map[47][49] = 1;
        map[49][48] = 1;
        map[64][65] = 1;
        map[65][66] = 1;
        map[66][67] = 1;
        map[67][68] = 1;

        map[45][64] = 3;
        map[46][65] = 3;
        map[47][6] = 33;
        map[49][67] = 1;
        map[48][68] = 1;
        map[1][48] = 3;
        map[1][49] = 3;
        map[1][47] = 4;
        map[3][45] = 3;
        map[3][46] = 3;
        map[3][47] = 4;

        map[22][49] = 2;
        map[23][49] = 2;
        map[24][49] = 2;
        map[34][67] = 2;
        map[35][67] = 2;
        map[36][67] = 2;
       /* map[][] = 3;
        map[][] = 3;        map[][] = 3;        map[][] = 3;
        map[][] = 3;        map[][] = 3;        map[][] = 3;
        map[][] = 3;
        */
        for (int i=0;i<mVexs.length;i++)
           for (int j=0;j<mVexs.length;j++)
               if (map[i][j]!=Integer.MAX_VALUE) map[j][i]= map[i][j];

      /*  for (int i=0;i<mVexs.length;i++) {
            for (int j = 0; j < mVexs.length; j++){
                if (map[i][j]!=Integer.MAX_VALUE) System.out.print(map[i][j]+"   ");
                else System.out.print("."+"   ");
            }
            System.out.println();
        }
        */
       // System.out.println(map[2][16]+"-----------");
    }
    public int getRoomKey(String string){
        boolean flag  = false;
        for(Integer key:room.keySet()){
            if(string.equals( room.get(key))) {
                flag = true;
                return key;
            }
        }
        if (!flag){
            System.out.println("教室不存在");
            return -2;
        }
        return 0;
    }
}
