<%@page import="java.util.List" %>
<%@page import="java.util.Date" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <%@ taglib prefix="gm" uri="http://java.sun.com/jsp/jstl/core" %>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <link href="<gm:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
        <link href="<gm:url value="/css/bootstrap.min.css" />" rel="stylesheet">
        <link href="<gm:url value="/resources/css/sb-admin.css" />" rel="stylesheet">
    </head>
    <title>Gmilk</title>
    </head>
<body style="background-color: #222">

<div class="container">
    <center>
        </br></br>
        <%--<h1><img src="<gm:url value="/resources/pictures/logo.png"/>"></h1>--%>
        <img src="/pitures/header.jpg" alt="Opulent">
        <div class="panel panel-primary">
            <div class="panel-heading">
                <h2>Menu Principale</h2>
            </div>
            <div class="panel-body">


                <div class="col-xs-6 col-md-3">
                    <gm:url value="vues.aspx" var="url"/>
                    <a class="thumbnail" href="${url}">
                        <img src="<gm:url value="/resources/pictures/data.png"/>">
                    </a>
                    <div class="caption">
                        <blockquote><h3>Données</h3></blockquote>
                    </div>
                </div>

                <div class="col-xs-6 col-md-3">
                    <gm:url value="graph.aspx" var="url"/>
                    <a class="thumbnail" href="${url}">
                        <img src="<gm:url value="/resources/pictures/pie.png"/>">
                    </a>
                    <div class="caption" style="background-color: ">
                        <blockquote><h3>Graphes</h3></blockquote>
                    </div>
                </div>

                <div class="col-xs-6 col-md-3">
                    <gm:url value="vues.aspx" var="url"/>
                    <a class="thumbnail" href="${url}">
                        <img src="<gm:url value="/resources/pictures/adobe21.png"/>">
                    </a>
                    <div class="caption">
                        <blockquote><h3>Rapports</h3></blockquote>
                    </div>
                </div>

                <div class="col-xs-6 col-md-3">
                    <gm:url value="dynamicbord.aspx" var="url"/>
                    <a class="thumbnail" href="${url}">
                        <img src="<gm:url value="/resources/pictures/data80.png"/>">
                    </a>
                    <div class="caption">
                        <blockquote><h3>Tableaux de bords </h3></blockquote>
                    </div>
                </div>
            </div>
        </div>
    </center>
</div>
</body>
</html>