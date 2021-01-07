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
            <div class="row">
                <div class="col-sm-6 col-md-3">
                    <div class="thumbnail" style=" width: auto;  height: auto;">
                        <img src="/img/emps01.png" style="width: 100%;height: 100%"
                             alt="录入学生考勤信息">
                        <div class="caption" style="text-align: center">
                            <h3>录入</h3>
                            <p>录入学生考勤信息。</p>
                            <p>
                                <a href="/teacher" class="btn btn-primary" role="button">
                                    录入
                                </a>
                            </p>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6 col-md-3">
                    <div class="thumbnail" style=" width: auto;  height: auto;">
                        <img src="/img/emps02.png" style="width: 100%;height: 100%"
                             alt="个人出勤信息查看">
                        <div class="caption" style="text-align: center">
                            <h3>个人</h3>
                            <p>个人出勤信息查看。</p>
                            <p>
                                <a href="/student" class="btn btn-primary" role="button">
                                    查看
                                </a>
                            </p>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6 col-md-3" style=" width: auto;  height: auto;">
                    <div class="thumbnail">
                        <img src="/img/emps03.png" style="width: 100%;height: 100%"
                             alt="班级出勤信息查看">
                        <div class="caption" style="text-align: center">
                            <h3>班级</h3>
                            <p>班级出勤信息查看。</p>
                            <p>
                                <a href="/headteacher" class="btn btn-primary" role="button">
                                    查看
                                </a>
                            </p>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6 col-md-3" style=" width: auto;  height: auto;">
                    <div class="thumbnail">
                        <img src="/img/emps04.png" style="width: 100%;height: 100%"
                             alt="班级出勤率查看">
                        <div class="caption" style="text-align: center">
                            <h3>班级出勤率</h3>
                            <p>班级出勤率查看。</p>
                            <p>
                                <a href="/leader" class="btn btn-primary" role="button">
                                    查看
                                </a>
                            </p>
                        </div>
                    </div>
                </div>
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

