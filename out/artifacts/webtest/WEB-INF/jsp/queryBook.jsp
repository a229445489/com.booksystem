<%--
  Created by IntelliJ IDEA.
  User: Chen
  Date: 2020/7/18
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>书籍查询</title>

    <%--导入bootstrap--%>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

<%--给页面设置边框--%>
<div class="container">

    <%--清除浮动--%>
    <div class="row clearfix">

        <%--栅格系统 将中等屏幕分成12份--%>
        <div class="col-md-12 column">

            <%--头部--%>
            <div class="page-header">

                <h1>
                    <small>查询书籍</small>
                </h1>

            </div>

        </div>


        <div class="row">

            <div class="col-md-4 column">
                 <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/allBook">返回书籍列表</a>
            </div>
            <div class="col-md-8 column">

                <form action="${pageContext.request.contextPath}/book/queryBook" method="post" class="form-inline">

                    <input type="text" name="queryBookName" class="form-control"  placeholder="请输入要查询的书籍名称">
                    <input type="submit" value="查询" class="btn btn-primary">
                    <%-- <span style="color:red; font-weight: bold">${error}</span>--%>

                </form>

            </div>

        </div>

    </div>

    <div class="row clearfix">

        <div class="col-md-12 column">

            <%--鼠标移动隔行变色,有分隔--%>
            <table class="table table-hover table-striped">

                <%--表头--%>
                <thead>

                <tr>

                    <th>序号</th>
                    <th>书籍名称</th>
                    <th>库存</th>
                    <th>书籍信息</th>

                </tr>

                </thead>

                <%--表身体，从数据库中查出，利用list遍历 方法：foreach--%>
                <tbody>

                <c:forEach var="book" items="${list}">

                    <tr>

                        <td>${book.bookID}</td>
                        <td>${book.bookName}</td>
                        <td>${book.bookCounts}</td>
                        <td>${book.detail}</td>

                    </tr>

                </c:forEach>

                </tbody>

            </table>

        </div>

    </div>

</div>

</body>
</html>
