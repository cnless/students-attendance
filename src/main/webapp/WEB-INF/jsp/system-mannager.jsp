<%--
  Created by IntelliJ IDEA.
  User: 25141
  Date: 2021/1/4
  Time: 21:17
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
            <div class="row">
                <div class="col-sm-6 col-md-3">
                    <div class="thumbnail" style=" width: auto;  height: auto;">
                        <img src="/img/emps01.png" style="width: 100%;height: 100%"
                             alt="功能及权限管理">
                        <div class="caption" style="text-align: center">
                            <h3>权限</h3>
                            <p>功能及权限管理</p>
                            <p>
                                <a href="/crole" class="btn btn-primary" role="button">
                                    进入
                                </a>
                            </p>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6 col-md-3">
                    <div class="thumbnail" style=" width: auto;  height: auto;">
                        <img src="/img/emps02.png" style="width: 100%;height: 100%"
                             alt="用户管理">
                        <div class="caption" style="text-align: center">
                            <h3>用户</h3>
                            <p>用户管理</p>
                            <p>
                                <a href="/um" class="btn btn-primary" role="button">
                                    进入
                                </a>
                            </p>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6 col-md-3" style=" width: auto;  height: auto;">
                    <div class="thumbnail">
                        <img src="/img/emps03.png" style="width: 100%;height: 100%"
                             alt="班级管理">
                        <div class="caption" style="text-align: center">
                            <h3>班级</h3>
                            <p>班级管理</p>
                            <p>
                                <a href="" class="btn btn-primary" role="button">
                                    进入
                                </a>
                            </p>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6 col-md-3" style=" width: auto;  height: auto;">
                    <div class="thumbnail">
                        <img src="/img/emps04.png" style="width: 100%;height: 100%"
                             alt="课程管理">
                        <div class="caption" style="text-align: center">
                            <h3>课程</h3>
                            <p>课程管理</p>
                            <p>
                                <a href="" class="btn btn-primary" role="button">
                                    进入
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
<script>
    var ctx = document.getElementById("myChart");
    var myChart = new Chart(ctx, {
        type: 'line',
        data: {
            labels: ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"],
            datasets: [{
                data: [15339, 21345, 18483, 24003, 23489, 24092, 12034],
                lineTension: 0,
                backgroundColor: 'transparent',
                borderColor: '#007bff',
                borderWidth: 4,
                pointBackgroundColor: '#007bff'
            }]
        },
        options: {
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: false
                    }
                }]
            },
            legend: {
                display: false,
            }
        }
    });
</script>

</body>
</html>


