<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 25141
  Date: 2021/1/6
  Time: 14:07
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
            <h2 style="color: red">${rmsg}</h2>
            <div class="table-responsive">
                <table class="table table-striped table-sm" id="role-table">
                    <thead>
                    <tr>
                        <th>用户id</th>
                        <th>用户姓名</th>
                        <th>用户角色</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${maUsers}" var="maUser" begin="0" end="${length}" step="1" varStatus="u">
                            <tr>
                                <td>${maUser.getUserId()}</td>
                                <td>${maUser.getUserName()}</td>
                                <td>
                                    <select name="${u.index}s" size="1" id="${u.index}s">
                                        <option value="1">管理员</option>
                                        <option value="2">学生</option>
                                        <option value="3">任课老师</option>
                                        <option value="4">班主任</option>
                                        <option value="5">校领导</option>
                                    </select>
                                    <script language= JavaScript>
                                        var id= ${maUser.getRoleId()};//根据后台传值来动态改变它
                                        document.getElementsByName("${u.index}s")[0].value=id;
                                    </script>
                                </td>
                                <td>
                                    <a class="btn btn-sm btn-primary" href="" id="${u.index}a" onclick="getUrl(this)" >修改</a>
                                    <script language="JavaScript">
                                            function getUrl(val){
                                                var index=val.parentNode.parentNode
                                                var rowNum=index.rowIndex
                                                var i = document.getElementById("role-table").rows[rowNum].cells[0].innerHTML
                                                var seindex=rowNum-1
                                                var sid = seindex+"s"
                                                var aid = seindex+"a"
                                                var r = document.getElementById(sid).value
                                                var url = "/setrole/"+i+"/"+r
                                                document.getElementById(aid).href=url
                                            }

                                    </script>
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
