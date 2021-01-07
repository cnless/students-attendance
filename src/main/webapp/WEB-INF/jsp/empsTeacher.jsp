<%--
  Created by IntelliJ IDEA.
  User: 25141
  Date: 2021/1/3
  Time: 21:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
            <div class="alert alert-success">${msg}</div>
            <form role="form" method="post" action="/teacherIn">
                <div class="form-group">
                    <label for="name">学生考勤信息录入</label>
                    <input type="text" class="form-control" name="UserId" placeholder="学生学号">
                    <input type="text" class="form-control" name="Courseid" placeholder="课程编号">
                    <input type="text" class="form-control" name="Classroomid" placeholder="教室号">
                    <input type="text" class="form-control" name="DateDay" placeholder="考勤时间">
                    <input type="text" class="form-control" name="AttenStatus" placeholder="考勤结果">
                    <button type="submit" class="btn btn-default">提交</button>
                </div>
            </form>
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

