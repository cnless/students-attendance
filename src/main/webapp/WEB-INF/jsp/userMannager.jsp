<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 25141
  Date: 2021/1/6
  Time: 22:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>show</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Custom styles for this template -->
    <link href="css/dashboard.css" rel="stylesheet">
    <style type="text/css">
        /* Chart.js */

        @-webkit-keyframes chartjs-render-animation {
            from {
                opacity: 0.99
            }
            to {
                opacity: 1
            }
        }

        @keyframes chartjs-render-animation {
            from {
                opacity: 0.99
            }
            to {
                opacity: 1
            }
        }

        .chartjs-render-monitor {
            -webkit-animation: chartjs-render-animation 0.001s;
            animation: chartjs-render-animation 0.001s;
        }
    </style>
</head>
<body>
<jsp:include page="topbar.jsp"></jsp:include>


<div class="container-fluid">
    <div class="row">
        <jsp:include page="sidebar.jsp"></jsp:include>

        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
            <h2><a class="btn btn-sm btn-success" href="">添加员工</a></h2>

            <div class="table-responsive">
                <table class="table table-striped table-sm" id="role-table">
                    <thead>
                    <tr>
                        <th>用户id</th>
                        <th>用户姓名</th>
                        <th>用户密码</th>
                        <th>最新修改时间</th>
                        <th>最新修改用户</th>
                        <th>班级号</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${maUsers}" var="maUser" begin="0" end="${length}" step="1" varStatus="u">
                        <tr>
                            <td>${maUser.getUserId()}</td>
                            <td>${maUser.getUserName()}</td>
                            <td>${maUser.getPasswd()}</td>
                            <td>${maUser.getLastUpdateDt()}</td>
                            <td>${maUser.getLastUpdateUser()}</td>
                            <td>${maUser.getClassid()}</td>
                            <td>
                                <a class="btn btn-sm btn-primary" href="/udu/${maUser.getUserId()}">修改</a>
                                <a class="btn btn-sm btn-danger" href="/du/${maUser.getUserId()}">删除</a>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </main>
    </div>
</div>


<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.slim.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/popper.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

<!-- Icons -->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/feather.min.js"></script>
<script>
    feather.replace()
</script>
<!-- Graphs -->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/Chart.min.js"></script>


</body>
</html>


</body>
</html>
