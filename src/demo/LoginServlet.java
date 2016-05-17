package demo;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/4/4.
 */
@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
        public void doGet(HttpServletRequest request,
                          HttpServletResponse response)
                throws ServletException,
                IOException {
            response.setContentType("text/html;charset=utf-8");
            String start = request.getParameter("start");
            String end =request.getParameter("end");
            BuildMap B=new BuildMap();
            int x;
            List<String> str = new ArrayList<String>();
            if (start.equals("-1")) x = -1;
            else
                x = B.getRoomKey(start);
                if(x==-2)
                {
                    str.add("起始教室不存在！");
                }
                else{
                    int  y = B.getRoomKey(end);
                    if(y==-2)
                    {
                        str.add("目的教室不存在！");
                    }
                    else {
                        Dijkstra dijkstra = new Dijkstra();
                        int[] prev = new int[BuildMap.mVexs.length];
                        int[] dist = new int[BuildMap.mVexs.length];
                        str = dijkstra.calc(x, y, prev, dist);
                    }
                }

            JSONObject json = new JSONObject();
            net.sf.json.JSONArray jsonArray = net.sf.json.JSONArray.fromObject(str);

            json.put("mydata", str);
            PrintWriter pw = response.getWriter();
            pw.print(json.toString());
            pw.close();
        }
        //重写doPost方法
        public void doPost(HttpServletRequest request,
                           HttpServletResponse response)
                throws ServletException,
                IOException {
            doGet(request, response);
        }
}
