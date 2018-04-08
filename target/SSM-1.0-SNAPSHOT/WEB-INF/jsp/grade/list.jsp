<%--
  Created by IntelliJ IDEA.
  User: 张罗平
  Date: 2018/1/13
  Time: 20:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
<html>
<head>
    <style type="text/css">
        ul{
            list-style-type: none;
        }
        ul li{
            float: left;
            width: auto;
            margin: 0px 10px;
        }
    </style>
    <script type="text/javascript">
        function go(page) {
            $("#pageNum").val(page)
            $("#form").attr("action","http://localhost:8080/grade/list");
            $("#form").submit();
        }
    </script>
    <title>学生列表</title>
</head>
<body>
<input type="text" value="${pageNum}"/><br>
<a href="#">添加</a>
<form action="#" method="post" id="form">
    <input type="hidden" name="pageNum" id="pageNum" value="${pageNum}"/>
<table>
    <thead>

    <tr>
        <th>年级编号</th>
        <th>年级</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${pageInfo.list}" var="grade">
    <tr>
        <td>${grade.gradeid}</td>
        <td>${grade.gradename}</td>
        <td>
            <a href="#">删除</a>
            <a href="#">查看</a>
            <a href="#">修改</a>
        </td>
    </tr>
    </c:forEach>
    </tbody>
        <tfoot>
            <td colspan="5">
                <ul>
                    <li>
                        <a href="javascript:go(1)" >首页</a>
                    </li>
                    <li>
                        <a href="javascript:go(${pageInfo.prePage})" >上一页</a>
                    </li>
                    <c:forEach items="${pageInfo.navigatepageNums}" var="page">
                        <li>
                            <a href="javascript:go(${page})">第${page}页</a>
                        </li>
                    </c:forEach>
                    <li>
                        <a href="javascript:go(${pageInfo.nextPage})" >下一页</a>
                    </li>
                    <li>
                        <a href="javascript:go(${pageInfo.pages})" >末页</a>
                     </li>
                </ul>
            </td>
        </tfoot>
    </table>
</form>
</body>
</html>
