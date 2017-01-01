<%--
  Created by IntelliJ IDEA.
  User: ibtissam
  Date: 23/12/16
  Time: 12:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Planning Graph</title>

    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <%--<link href="${pageContext.request.contextPath}/resources/css/bootstrap-theme.min.css" rel="stylesheet">--%>
    <link href="${pageContext.request.contextPath}/resources/css/metisMenu.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/css/admin.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/css/font-awesome.min.css" rel="stylesheet">
    <style>
        #cy {
            width: 80%;
            height: 100%;
            display: block;
        }
    </style>

</head>
<body>

<div id="wrapper">

    <!-- Navigation -->
    <jsp:include page="header.jsp"></jsp:include>

    <div id="page-wrapper">
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Planning Graph</h1>
            </div>
            <!-- /.col-lg-12 -->
        </div>
        <!-- /.row -->

        <div class="row">
            <div class="col-lg-12 col-md-6">
                <div id="cy"></div>
            </div>
        </div>
        <!-- /.col-lg-4 -->
    </div>
    <!-- /.row -->
</div>
<!-- /#page-wrapper -->

<!-- /#wrapper -->


<script src="${pageContext.request.contextPath}/resources/js/jquery-2.2.4.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
<script src="https://blackrockdigital.github.io/startbootstrap-sb-admin-2/vendor/metisMenu/metisMenu.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/admin.js"></script>

<script src="${pageContext.request.contextPath}/resources/cytoscape/2.7.13/dist/cytoscape.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/graph.js"></script>
</body>
</html>


</html>
