<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<meta http-equiv="content-type" content="text/html; charset=utf-8"/>
<%@ page isELIgnored="false" %>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <%--注意pom文件版本--%>
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
            <td>删除</td>
            <td>详细</td>
        </tr>
    <c:forEach items="${list}" var="list" >
      <tr id="trPage">
        <td><a href=''>${list.key}</a></td>
        <td><a href=''>${list.value.name}</a></td>
        <td><a href=''>${list.value.sex}</a></td>
        <td><a href=''>${list.value.address}</a></td>
          <td><a href="http://localhost:8080/deletestudent?number=${list.key}">删除</a></td>
          <td><a href="http://localhost:8080/selectonestudent?number=${list.key}">详细</a></td>
      </tr>
    </c:forEach>
    <td><a href="http://localhost:8080/addstudent.jsp">添加</a></td>
</table>

</body>
</html>
