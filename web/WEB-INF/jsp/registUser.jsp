<%--
  Created by IntelliJ IDEA.
  User: Chen
  Date: 2020/7/17
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>

    <%--导入bootstrap--%>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js"></script>
    <script type="text/javascript">

        //页面加载完成之后
        $(function () {

            //给注册绑定单击事件
            $("#sub_btn").click(function () {

                //获取用户名内容
                var userName = $("#inputEmail3").val();

                //创建正则表达式对象(由字母数字下划线组成，长度为5-12)
                var userNamePatt = /^\w{5,12}$/;

                //验证
                if (!userNamePatt.test(userName)){

                    $("span.errorMsg").text("用户名由5-12位字母数字构成，您输入的不合法");

                    return false;

                }

                //获取用户名内容
                var password = $("#inputPassword3").val();

                //创建正则表达式对象(由字母数字下划线组成，长度为5-12)
                var passwordPatt = /^\w{5,12}$/;

                //验证
                if (!passwordPatt.test(password)){

                    $("span.paErrorMsg").text("密码由5-12位字母数字构成，您输入的不合法");

                    return false;

                }

                //合法后释放内容
                $("span.errorMsg").text("");
                $("span.paErrorMsg").text("");

            });

        })

    </script>

    <style>

        /*  Class*/
        .center-block {
            display: block;
            margin-left: auto;
            margin-right: auto;
        }

        .element {
        .center-block();
        }

        .errorMsg {

            color: red;

        }

        .paErrorMsg {

            color: red;

        }

    </style>
</head>
<body>

<div class="container">
    <%--清除浮动--%>
    <div class="row clearfix">

        <%--栅格系统 将中等屏幕分成12份--%>
        <div class="col-md-12 column">

            <%--头部--%>
            <div class="page-header">

                <h1>
                    <small>用户注册</small>
                </h1>

            </div>

        </div>


        <div class="center-block">

            <form class="form-horizontal" action="${pageContext.request.contextPath }/user/registUser" method="post">
                <div class="form-group">
                    <label for="inputEmail3" class="col-sm-2 control-label">用户名</label>
                    <div class="col-sm-3">
                        <input type="text" class="form-control" id="inputEmail3" name="userName" required>
                        <span class="errorMsg"></span>
                    </div>
                </div>
                <div class="form-group">
                    <label for="inputPassword3" class="col-sm-2 control-label">密码</label>
                    <div class="col-sm-3">
                        <input type="password" class="form-control" id="inputPassword3" name="password" required>
                        <span class="paErrorMsg"></span>
                    </div>
                </div>

                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-default" id="sub_btn">注册</button>
                    </div>
                </div>
            </form>

        </div>

    </div>
</div>


</body>
</html>
