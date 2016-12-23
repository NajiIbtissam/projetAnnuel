<%--
  Created by IntelliJ IDEA.
  User: titam
  Date: 19/10/16
  Time: 15:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>My index</title>
    <link rel="stylesheet" href="<c:url value="/resources/bootstrap/css/bootstrap.css" />">
    <link rel="stylesheet" href="<c:url value="/css/style.css" />">
</head>
<body background="resources/bg3.jpg">
<div class="container">
    <!--<div class="row top-buffer" align="center">-->
    <!--<button type="button" class="btn btn-primary btn-lg">  Table Mode  </button>-->
    <!--<button type="button" class="btn btn-primary btn-lg">Graphical Mode</button>-->
    <!--</div>-->
    <!--<div class="row top-buffer" align="center">-->
    <!--<button type="button" class="btn btn-secondary">OUT1</button>-->
    <!--<button type="button" class="btn btn-secondary">OUT2</button>-->
    <!--<button type="button" class="btn btn-secondary">OUT3</button>-->
    <!--<button type="button" class="btn btn-secondary">OUT4</button>-->
    <!--<button type="button" class="btn btn-secondary">OUT5</button>-->
    <!--</div>-->
    <nav class="navbar navbar-inverse navbar-fixed-top">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <a class="navbar-brand" href="#">
                    <img align="center" alt="Brand" src="resources/logo.png">
                </a>

            </div>
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Tables Mode  <span class="caret"></span></a>
                        <ul class="dropdown-menu multi-level">
                            <li class="dropdown-submenu">
                                <a tabindex="-1" href="#">Inputs </a>
                                <ul class="dropdown-menu">
                                    <li><a href="#">COSTSANDTIME</a></li>
                                    <li><a href="#">DEMANDS</a></li>
                                    <li><a href="#">FAULTYSTOCK</a></li>
                                    <li><a href="#">HEALTHYSTOCK</a></li>
                                    <li><a href="#">ITEMS</a></li>
                                    <li><a href="#">LOCATIONS</a></li>
                                    <li><a href="#">NMIT</a></li>
                                    <li><a href="#">PLANNER_SETTINGS</a></li>
                                    <li><a href="#">TOURSFRANCE</a></li>
                                    <li><a href="#">WASMOVING</a></li>
                                </ul>


                            </li>


                            <li class="dropdown-submenu">
                                <a tabindex="-1" href="#">Outputs </a>
                                <ul class="dropdown-menu">
                                    <li><a href="#">OUTPUT_COSTS</a></li>
                                    <li><a href="#">OUTPUT_FSTOCK</a></li>
                                    <li><a href="#">OUTPUT_HSTOCK</a></li>
                                    <li><a href="#">OUTPUT_MOVES</a></li>
                                    <li><a href="#">OUTPUT_NMIT</a></li>
                                    <li><a href="#">OUTPUT_RESULTS</a></li>
                                </ul>
                            </li>

                        </ul>
                    </li>
                    <li><a href="#">Graphics Mode  </a></li>
                    <li><a href="#">help</a></li>
                </ul>


            </div>
        </div>
    </nav>


    <table class="table top-buffer">
        <thead>
        <tr>
            <th>#</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Username</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <th scope="row">1</th>
            <td>Mark</td>
            <td>Otto</td>
            <td>@mdo</td>
        </tr>
        <tr>
            <th scope="row">2</th>
            <td>Jacob</td>
            <td>Thornton</td>
            <td>@fat</td>
        </tr>
        <tr>
            <th scope="row">3</th>
            <td>Larry</td>
            <td>the Bird</td>
            <td>@twitter</td>
        </tr>
        </tbody>
    </table>
</div>
</body>
<script type="text/javascript" src="<c:url value="/resources/js/jquery-3.1.1.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/bootstrap/js/bootstrap.js" />"></script>
</html>