<%--
  Created by IntelliJ IDEA.
  User: 25141
  Date: 2021/1/6
  Time: 22:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>show</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Custom styles for this template -->
    <link href="css/dashboard.css" rel="stylesheet">
    <link href="/css/bootstrap.min.css" rel="stylesheet">
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
            <form action="/updateUser2" method="post">
                <input type="hidden" name="userId" value="${maUser.getUserId()}">
                <div class="form-group">
                    <label>姓名</label>
                    <input value="${maUser.getUserName()}" type="text" class="form-control" placeholder="请输入姓名" name="userName" id="userName">
                </div>
                <div class="form-group">
                    <label>密码</label>
                    <input value="${maUser.getPasswd()}" type="password" class="form-control" placeholder="请输入密码" name="passwd" id="passwd">
                </div>
                <input type="hidden" name="lastUpdateDt" value="${ludt}">
                <div class="form-group">
                    <label>修改人</label>
                    <input value="${maUser.getLastUpdateUser()}" type="text" class="form-control" placeholder="请输入修改人名字" name="lastUpdateUser">
                </div>
                <div class="form-group">
                    <label>班级</label>
                    <input value="${maUser.getClassid()}" type="text" class="form-control" placeholder="请输入班级" name="classid" id="classid">
                </div>
                <button type="submit" class="btn btn-primary">修改</button>
                <label style="color: red">${umsg}</label>

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

</body>
</html>

