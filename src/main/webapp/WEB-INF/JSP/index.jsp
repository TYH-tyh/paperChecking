<%--
  Created by IntelliJ IDEA.
  User: 田义会
  Date: 2019/12/11
  Time: 23:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>随心查重</title>
</head>

<body>

<%--录入文档内容进入MongoDB--%>
<form action="save" method="post">
    <div>请输入ID  ：</div>
    <textarea type="text" name="id" rows="2" cols="50"></textarea></br></br>
<%--    <input type="text" name="id"  ></br></br>--%>
    <div>请输入文档名称：</div>
    <textarea type="text" name="name" rows="2" cols="50"></textarea></br></br>
<%--    <input type="text" name="name" width="50" height="100"></br></br>--%>
    <div>请输入文档第一部分内容：</div>
    <textarea type="text" name="part1" rows="10" cols="50"></textarea></br></br>
<%--    <input type="text" style="height: 200px;width: 400px" name="part1" width="20"/></br></br>--%>
    <div>请输入文档第二部分内容：</div>
    <textarea type="text" name="part2" rows="10" cols="50"></textarea></br></br>
<%--    <input type="text" style="height: 200px;width: 400px" name="part2" /></br></br>--%>
    <div>请输入文档第三部分内容：</div>
    <textarea type="text" name="part3" rows="10" cols="50"></textarea></br></br>
    <%--    <input type="text" style="height: 200px;width: 400px" name="part2" /></br></br>--%>
    <input type="submit" value="提交" /><br><br>
    <h4>正在为您分析，请稍等。。。</h4>
    <div>该文档的重复率为：</div>

</form>

</body>
</html>