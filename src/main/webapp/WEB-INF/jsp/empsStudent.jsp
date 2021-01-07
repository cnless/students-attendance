<%--
  Created by IntelliJ IDEA.
  User: 25141
  Date: 2021/1/3
  Time: 21:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>show</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Custom styles for this template -->
    <link href="css/dashboard.css" rel="stylesheet">
    <style type="text/css">

    </style>
</head>
<body>
<jsp:include page="topbar.jsp"></jsp:include>


<div class="container-fluid">
    <div class="row">
        <jsp:include page="sidebar.jsp"></jsp:include>

        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
            <div class="search">
                <div class="alert alert-success">${msg}</div>
                <form method="post" action="/studentGet" class="form-horizontal" role="form">
                    <div class="form-group">
                        <div class="col-sm-10">
                            <input type="text" class="form-control" name="UserId" id="firstname" placeholder="请输入学号">
                            <button type="submit" class="btn btn-default" style="text-align:center" >查询</button>
                        </div>
                    </div>
                </form>
            </div>
            <table class="table table-striped">
                <thead>
                <tr>
                    <th>考勤编号</th>
                    <th>学生学号</th>
                    <th>考勤时间</th>
                    <th>考勤结果</th>
                </tr>
                </thead>
                <tbody>
                    <c:if test="${student != null }">
                        <c:forEach var="role" items="${student}">
                            <tr>
                                <td>${role.getAttendanceId()}</td>
                                <td>${role.getUserId()}</td>
                                <td>${role.getDateDay()}</td>
                                <td>${role.getAttenStatus()}</td>
                            </tr>
                        </c:forEach>
                    </c:if>
                </tbody>
            </table>


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

