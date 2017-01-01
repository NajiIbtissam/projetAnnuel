<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Faulty Stock</title>

    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <%--<link href="${pageContext.request.contextPath}/resources/css/bootstrap-theme.min.css" rel="stylesheet">--%>
    <link href="${pageContext.request.contextPath}/resources/css/metisMenu.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/css/admin.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/css/font-awesome.min.css" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/DataTables/datatables.css"
          type='text/css'/>
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/DataTables/DataTables-1.10.13/css/dataTables.bootstrap.css"
          type='text/css'/>

    <link href="${pageContext.request.contextPath}/resources/DataTables/Buttons-1.2.4/css/buttons.dataTables.min.css"
          rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/DataTables/Buttons-1.2.4/css/buttons.bootstrap.min.css"
          rel="stylesheet">

</head>
<body>

<div id="wrapper">

    <!-- Navigation -->
    <jsp:include page="header.jsp"></jsp:include>

    <div id="page-wrapper">
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Faulty Stock</h1>
            </div>
            <!-- /.col-lg-12 -->
        </div>
        <!-- /.row -->
        <div class="row">
            <div class="col-lg-12 col-md-6">
                <div class="table-responsive">
                    <table class="table table-bordered table-hover table-striped" id="datatable">
                        <thead>
                        <tr>

                            <th>ID</th>
                            <th>LOCATIONCODE</th>
                            <th>ITEMCODE</th>
                            <th>STOCK</th>
                        </tr>
                        </thead>
                        <tfoot>
                        <tr>

                            <th>ID</th>
                            <th>LOCATIONCODE</th>
                            <th>ITEMCODE</th>
                            <th>STOCK</th>
                        </tr>
                        </tfoot>
                        <tbody>
                        <c:forEach var="faultystock" items="${faultystock}">
                            <tr>
                                <th scope="row">${faultystock.ID}</th>
                                <td>${faultystock.LOCATIONCODE}</td>
                                <td>${faultystock.ITEMCODE}</td>
                                <td>${faultystock.STOCK}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>

                <!-- /.panel-footer -->
            </div>
            <!-- /.panel .chat-panel -->
        </div>
        <!-- /.col-lg-4 -->
    </div>
    <!-- /.row -->
</div>
<!-- /#page-wrapper -->

<!-- /#wrapper -->


<script src="${pageContext.request.contextPath}/resources/js/jquery-1.12.4.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
<script src="https://blackrockdigital.github.io/startbootstrap-sb-admin-2/vendor/metisMenu/metisMenu.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/admin.js"></script>
<script src="${pageContext.request.contextPath}/resources/DataTables/DataTables-1.10.13/js/jquery.dataTables.js"></script>
<script src="${pageContext.request.contextPath}/resources/DataTables/DataTables-1.10.13/js/dataTables.bootstrap.js"></script>
<script src="${pageContext.request.contextPath}/resources/DataTables/Buttons-1.2.4/js/dataTables.buttons.js"></script>
<script src="${pageContext.request.contextPath}/resources/DataTables/JSZip-2.5.0/jszip.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/DataTables/pdfmake-0.1.18/build/pdfmake.js"></script>
<script src="${pageContext.request.contextPath}/resources/DataTables/pdfmake-0.1.18/build/vfs_fonts.js"></script>
<script src="${pageContext.request.contextPath}/resources/DataTables/Buttons-1.2.4/js/buttons.html5.js"></script>
<%--<script src="${pageContext.request.contextPath}/resources/DataTables/Buttons-1.2.4/js/buttons.print.min.js"></script>--%>
<script src="${pageContext.request.contextPath}/resources/DataTables/Buttons-1.2.4/js/buttons.bootstrap.js"></script>

<script src="${pageContext.request.contextPath}/resources/js/script.js"></script>
</body>
</html>
