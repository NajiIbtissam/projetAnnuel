<%--
  Created by IntelliJ IDEA.
  User: ibtissam
  Date: 23/12/16
  Time: 12:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url var="home" value="/" scope="request"/>
<html>
<head>
    <title>Title</title>

    <style>
        #cy {
            width: 80%;
            height: 100%;
            display: block;
        }
    </style>
</head>
<body>

<div id="cy"></div>

<span class="fa fa-bars config-toggle" id="config-toggle"></span>

<div id="config" class="config">

    <div id="cy"></div>

</div>

<script src="http://code.jquery.com/jquery-2.0.3.min.js"></script>
<script src=" /resources/cytoscape/2.7.13/dist/cytoscape.js"></script>


<script src="https://cdn.rawgit.com/cytoscape/cytoscape.js-spread/1.0.9/cytoscape-spread.js"></script>
<script type="text/javascript" src="/resources/js/graph.js">
</script>
</body>
</html>
