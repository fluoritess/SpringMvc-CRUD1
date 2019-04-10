<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/3/17
  Time: 20:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        td{
            width: 100px;
        }
        #table1 {
            margin: 0px;
            padding: 0px;
        }
        #table1 tr.head{
            background: #bbffaa;
        }
        #trPage td
        {
            border: 1px solid #CCCCCC;
        }
        #trPage a
        {
            text-decoration: none;
        }
        #trPage td:hover
        {
            border: 1px solid #FF5500;
            background-color: #FFEEE5;
        }
    </style>
</head>
<body>

<%--  <%HashMap map=request.getAttribute("stu");%>--%>
<%--学号:${list["001"].name}--%>

<table id="table1">
    <tr class="head">
        <td>学号</td>
        <td>姓名</td>
        <td>性别</td>
        <td>地址</td>
        <td>更新</td>
    </tr>
    <tr id="trPage">

        <form action="http://localhost:8080/addstudent" method="post">
            <td><input type="text" name="number" value=""></td>
            <td><input type="text" name="name" value=""></td>
            <td><input type="text" name="sex" value=""></td>
            <td><input type="text" name="address" value=""></td>
            <td><button>添加</button></td>
        </form>
    </tr>
</table>

</body>
</html>
