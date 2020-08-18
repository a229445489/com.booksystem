<%--
  Created by IntelliJ IDEA.
  User: Chen
  Date: 2020/7/16
  Time: 17:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加书籍</title>

    <%--导入bootstrap--%>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>


<div class="container">

   <%-- <img src="${pageContext.request.contextPath}/WEB-INF/img/bgImg.jpg">--%>

    <%--清除浮动--%>
    <div class="row clearfix">

        <%--栅格系统 将中等屏幕分成12份--%>
        <div class="col-md-12 column">

            <%--头部--%>
            <div class="page-header">

                <h1>
                    <small>添加书籍</small>
                </h1>

            </div>

        </div>

    </div>

        <form action="${pageContext.request.contextPath}/book/addBook" method="post">

            <div class="form-group">

                <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/allBook">返回书籍列表</a>

            </div>

            <div class="form-group">
                <label>书籍名称</label>
                <input type="text" name="bookName" class="form-control" required>
            </div>

            <div class="form-group">
                <label>书籍数量</label>
                <input type="text" name="bookCounts" class="form-control" required>
            </div>

            <div class="form-group">
                <label>书籍描述</label>
                <input type="text" name="detail" class="form-control" required>
            </div>

            <div class="form-group">
                <input type="submit" class="form-control" value="添加书籍">
            </div>

        </form>

</div>

</body>
</html>
