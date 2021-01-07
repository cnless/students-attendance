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
    <script src="${pageContext.request.contextPath}/js/echarts.min.js"></script>
</head>
<body>
<jsp:include page="topbar.jsp"></jsp:include>


<div class="container-fluid">
    <div class="row">
        <jsp:include page="sidebar.jsp"></jsp:include>
        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
            <div class="form-group">
                <div class="row">
                    <div class="col-md-6">
                        <select name="province_code" class="form-control combox" ref="city_select"
                                refUrl="${ctx}/procity?pro_code={value}&city_code=HSLY">
                        </select>
                    </div>
                    <div class="col-md-6">
                        <select name="city_code" id="city_select" class="form-control">
                        </select>
                    </div>
                </div>
            </div>
            <script type="text/javascript">
                <!--
                $(function() {
                    if ($.fn.combox) {
                        $("select.combox", $p).combox();
                    }
                });
                //-->
            </script>



            <!-- 为ECharts准备一个具备大小（宽高）的Dom -->
            <div id="main" style="width: 100%;height:100%;"></div>
            <script type="text/javascript">
                // 基于准备好的dom，初始化echarts实例
                var myChart = echarts.init(document.getElementById('main'));

                // 指定图表的配置项和数据
                var option = {
                    title: {
                        text: '班级出勤率'
                    },
                    tooltip: {},
                    legend: {
                        data:['出勤率']
                    },
                    xAxis: {
                        data:[${className[0]},${className[1]},${className[2]},${className[3]},${className[4]}]
                    },
                    yAxis: {},
                    series: [{
                        name: '出勤率',
                        type: 'bar',
                        data:[${attendance.getNum71()},${attendance.getNum72()},${attendance.getNum81()},${attendance.getNum82()},${attendance.getNum91()}]
                    }]
                };

                // 使用刚指定的配置项和数据显示图表。
                myChart.setOption(option);
            </script>
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

