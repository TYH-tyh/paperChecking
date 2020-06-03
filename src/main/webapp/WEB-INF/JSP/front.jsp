<%--
  Created by IntelliJ IDEA.
  User: 田义会
  Date: 2019/12/12
  Time: 22:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查重</title>
    <style type="text/css">
        body{
            background-color: rgb(140,211,246);
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
            top:-120px;
            left: 200px;
            text-align: center;
            opacity:0;
            color: white;

        }
        .fg{
            height: 70px;
            width: 300px;
            background-color:rgb(111,188,240) ;
            position: relative;
            top:-50px;
            left: 200px;
            text-align: center;
            border-radius: 20px;
            border: none;
            outline:none;
            font-size: 24px;
            color: white;


        }
        .xx{
           position: relative;
            top:15px;
        }
        .xz2{
            height: 50px;
            width: 100px;
            border-radius: 25px;
            border: none;
            outline:none;
            background-color: rgb(111,188,240);
            position: relative;
            bottom: 20px;
            left: 240px;
            color: white;
        }
        .xz3{
            height: 50px;
            width: 100px;
            border-radius: 25px;
            border: none;
            outline:none;
            background-color: rgb(111,188,240);
            position: relative;
            bottom: 20px;
            left: 240px;
            color: white;
            margin-left: 20px;
        }

        　　　　　　
        　
    </style>
    <script type="text/javascript">
        window.onload = function(){
            var Sub = document.getElementById("1");
            Sub.onclick = function(){
            }
        }
        // $(document).ready(function(){
        //     $('#5').click(function(){
        //         $('#1').click();
        //     });
        //
        // });
    </script>
  </head>

<body>

    <div id="4" class="max_box" >
       <div class="cc"><div >随心查重</div></div>
        <div id="3" class="biaodan">
            <form action="front" method="post" enctype="multipart/form-data" >
                <div class="fg" id="5"><div class="xx">请选择文件</div></div>
                <input class="xz1" type="file" name="file" id="1" />
                <br>
                <input class="xz2" type="submit" id="bt_submit"  value="提交" />

                <input class="xz3 tj" type="reset" value="重置" />
            </form>
        </div>
    </div>

</body>

</html>

