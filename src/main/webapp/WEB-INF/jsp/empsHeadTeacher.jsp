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
                <form method="get" action="/Teacher.do">
                    <span>班级</span>
                    <select name="classname">
                        <c:if test="${classList != null }">
                            <option value="0">--请选择--</option>
                            <c:forEach var="role" items="${classList}">
                                <option <c:if test="${role.getClassId() == classname }">selected="selected"</c:if>
                                        value="${role.getClassId()}">${role.getClassName()}</option>
                            </c:forEach>
                        </c:if>
                    </select>
                    <input	value="查 询" type="submit" id="searchbutton">
                </form>
                    <table class="table table-striped">
                        <thead>
                        <tr>
                            <th>学生学号</th>
                            <th>学生姓名</th>
                            <th>班级</th>
                            <th>考勤时间</th>
                            <th>考勤结果</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:if test="${classAttendance != null }">
                            <c:forEach var="role" items="${classAttendance}">
                                <tr>
                                    <td>${role.getUserId()}</td>
                                    <td>${role.getUserName()}</td>
                                    <td>${role.getClassName()}</td>
                                    <td>${role.getDateDay()}</td>
                                    <td>${role.getAttenStatus()}</td>
                                </tr>
                            </c:forEach>
                        </c:if>
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

