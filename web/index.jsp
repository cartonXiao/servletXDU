<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/4/4
  Time: 12:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
  <title>B楼导航</title>
  <style type="text/css">
    *{margin:0 ;padding: 0;}
    .main{width: 1200px;margin: 0 auto;border: 3px solid lightblue;}
    .head{width: 1200px;margin: 0 auto;height: 100px;background-color: darkred;text-align: center;
          padding-top: 25px;}
    .body{width: 1200px;margin: 0 auto;}
    .search{height:80px;width: 1100px;padding-top: 10px;border-top: 1px solid red;padding-left: 100px;}
    .search_left{width:30%;height:80px;float: left;}
    .search_mid{width:10%;height:80px;float: left;}
    .search_right{width:60%;height:80px;float: right;font-size: 20px;}
    .result{width: 100%;background-color: #55ddff;text-align: center;font-size: 30px;   }
  </style>

</head>
<body>
<div class="main">
    <div class="head">  <img src="http://localhost:8080/JavaWeb/head.png"  /></div>
    <div class="body">  <img src="http://localhost:8080/JavaWeb/B_building.jpg"  />
        <div class="search">
            <div class="search_left">
                <!--<form action="http://localhost:8080/JavaWeb/LoginServlet" method="post">!--><!--</form> !-->
                <span style="font-size: 30px;font-weight: bold">起始地：</span><input type="text" id="start" style="width:180px; height:25px;font-size: 22px" /><br/>
                <span style="font-size: 30px;font-weight: bold">目的地：</span><input type="text" id="end" style="width:180px; height:25px;font-size: 22px" />
            </div>
            <div class="search_mid">
                <input type="button" id="button1" style="background:url('button.png')no-repeat;
                background-color:lightgray;height:70px;width:70px" />
            </div>
            <div class="search_right">注意事项<br /><span style="font-size:15px;color: darkturquoise;">如果您的起点是室外，请输入-1</span></div>
            </div>
        <div class="result">查询结果
            <ol></ol>
        </div>
    </div>
</div>
</div>
<script src="http://localhost:8080/JavaWeb/jquery-1.11.3.min.js"></script>
<script type="text/javascript">
    $(function () {
        $("#button1").click(function () {
            $.get("http://localhost:8080/JavaWeb/LoginServlet",//servlet URL
                    {start: $("#start").val(),
                     end:$("#end").val()
                    },//表单中的值
                    function (data) {//相应函数
                        $("ol").empty(); //每次查询清空之前的记录
                        var jsonvars = data.mydata;//返回JSON数据
                        if(jsonvars.length==1)
                        {
                            var i=0;
                            alert("Error");
                            $("ol").append(jsonvars[i]+"<br />");
                        }
                        else{
                            for (var i = 1; i < jsonvars.length; i++) {
                                $("ol").append(i +"." + "从"+jsonvars[i-1] + "到"+jsonvars[i]+ "<br />");
                            }
                        }
                    }, "json");
        })
    });
</script>
</body>
</html>
