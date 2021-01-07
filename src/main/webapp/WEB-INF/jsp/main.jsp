<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %><%--
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
<script type="text/javascript">
    function cantempty(){
        $(".noNull").each(function(){
            if($("#userName").val()===""){
                alert("不能为空");
                return false;
            }
            if($("#passwd").val()===""){
                alert("不能为空");
                return false;
            }
            if($("#classid").val()===""){
                alert("不能为空");
                return false;
            }

        })
    }
</script>


<div class="container-fluid">
    <div class="row">
        <jsp:include page="sidebar.jsp"></jsp:include>

        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
            <form action="/updateUser" method="post">
                <input type="hidden" name="userId" value="${currentUser.getUserId()}">
                <div class="form-group">
                    <label>姓名</label>
                    <input value="${currentUser.getUserName()}" type="text" class="form-control" placeholder="请输入姓名" name="userName" id="userName">
                </div>
                <div class="form-group">
                    <label>密码</label>
                    <input value="${currentUser.getPasswd()}" type="password" class="form-control" placeholder="请输入密码" name="passwd" id="passwd">
                </div>
                <input type="hidden" name="lastUpdateDt" value="${ludt}">
                <div class="form-group">
                    <label>修改人</label>
                    <input value="${currentUser.getLastUpdateUser()}" type="text" class="form-control" placeholder="请输入修改人名字" name="lastUpdateUser">
                </div>
                <div class="form-group">
                    <label>班级</label>
                    <input value="${currentUser.getClassid()}" type="text" class="form-control" placeholder="请输入班级" name="classid" id="classid">
                </div>
                <button type="submit" class="btn btn-primary" onclick="bubmi()">修改</button>
                <label style="color: red">${msg}</label>

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
<script type="text/javascript">
    function bubmi(){
        $(".noNull").each(function(){
            var name = $(this).attr("name");
            if($(this).val()==""){
                alert($(this).attr('notNull')+"不能为空");return false;
            }
            if($(this).attr("type")=="radio"){
                if ($("input[name='"+name+"']:checked").size() < 1){
                    alert($(this).attr('notNull')+"不能为空!");
                    return false;
                }
            }
            if($(this).attr("type")=="checkbox"){
                if ($('input[name="'+name+'"]:checked').size() < 1){
                    alert($(this).attr('notNull')+"不能为空!");
                    return false;
                }
            }
        })
    }
</script>

</body>
</html>

