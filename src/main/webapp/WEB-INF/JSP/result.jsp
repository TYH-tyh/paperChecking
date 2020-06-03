<%--
  Created by IntelliJ IDEA.
  User: 田义会
  Date: 2020/1/2
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查重</title>
    <style type="text/css">
        body{
            background-image: url("../image/22.jpg");
            background-repeat: no-repeat;
            background-size:1920px 750px;
        }
        .max_box{
            background-color:rgb(232,251,255);
            height: 500px;
            width: 700px;
            margin: 0 auto;
            position: relative;
            top: 70px;
        }
        .cc{
            position: relative;
            top: 10px;
            right:-20px;
            text-align: center;
            width: 660px;
            height: 70px;
            font-size: 24px;
            background-color:rgb(255,255,255);

        }
        .cc div{
            position: relative;
            top:15px;
            font-family: "Adobe 明體 Std L";

        }
        .biaodan{
            box-sizing: border-box;
            height: 250px;
            position: relative;
            bottom: -220px;

        }
        .xz1{
            height: 70px;
            width: 300px;
            background-color: red;
            position: relative;
            top:-20px;
            left: 200px;
            text-align:center;
            opacity:0;

        }
        .fg{
            box-sizing: border-box;
            height:260px;
            width: 400px;
            padding: 0 15px;
            background-color:rgb(255,255,255) ;
            position: relative;
            top:-150px;
            left: 160px;
            text-align: left;
            border-radius: 20px;
            border: none;
            outline:none;
            font-size: 24px;
            color: black;

        }
        .xx{
            position: relative;
            top:15px;
            font-size: 15px;
        }
        .xz2{
            height: 50px;
            width: 200px;
            border-radius: 25px;
            border: none;
            outline:none;
            background-color: rgb(137,195,243);
            position: relative;
            bottom: 140px;
            left: 240px;
            font-size: 15px;
            color: white;
        }

        　　　　　　
        　
    </style>
    <script type="text/javascript">
        window.onload = function(){
            var Sub = document.getElementById("1");
            Sub.onclick = function(){
            }
        }
    </script>
</head>

<body>

<div id="4" class="max_box" >
    <div class="cc"> <div >查重结果</div></div>
    <div id="3" class="biaodan">
            <div class="fg" id="5">
                <div class="xx">
                    <div>该报告：${requestScope.result1}</div><br>
                    <div>重复率最高报告：${requestScope.result2}</div><br>
                    <div>重复率：${requestScope.result3}</div><br>
                </div>
            </div>
            <br>
            <button class="xz2 tj" type="button" onclick="location.href='front'" />继续查重
    </div>
</div>

</body>

</html>

