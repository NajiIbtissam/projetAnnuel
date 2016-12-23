<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>
<head>
    <title>Augment an Admin Panel Category Flat Bootstrap Responsive Web Template | Tables :: w3layouts</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="Augment Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <!-- Bootstrap Core CSS -->
    <link href="/resources/css/bootstrap.min2.css" rel='stylesheet' type='text/css' />
    <!-- Custom CSS -->
    <link href="/resources/css/style2.css" rel='stylesheet' type='text/css' />
    <!-- Graph CSS -->
    <link href="/resources/css/font-awesome.css" rel="stylesheet">
    <!-- jQuery -->
    <link href='//fonts.googleapis.com/css?family=Roboto:700,500,300,100italic,100,400' rel='stylesheet' type='text/css'>
    <!-- lined-icons -->
    <link rel="stylesheet" href="/resources/css/icon-font.min.css" type='text/css' />
    <!-- /js -->
    <script src="/resources/js/jquery-1.10.2.min.js"></script>
    <!-- //js-->
</head>
<body>
<div class="page-container">
    <!--/content-inner-->
    <div class="left-content">
        <div class="inner-content">
            <!-- header-starts -->
            <div class="header-section">
                <!--menu-right-->
                <div class="top_menu">
                    <div class="main-search">
                        <form>
                            <input type="text" value="Search" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Search';}" class="text"/>
                            <input type="submit" value=""/>
                        </form>
                        <div class="close"><img src="/resources/pictures/cross.png" /></div>
                    </div>
                    <%--<div class="srch"><button></button></div>--%>
                    <script type="text/javascript">
                        $('.main-search').hide();
                        $('button').click(function (){
                                    $('.main-search').show();
                                    $('.main-search text').focus();
                                }
                        );
                        $('.close').click(function(){
                            $('.main-search').hide();
                        });
                    </script>
                    <!--/profile_details-->
                    <div class="profile_details_left">
                        <ul class="nofitications-dropdown">
                            <li class="dropdown note dra-down">
                            </li>
                            <li class="dropdown note">
                            </li>
                            <li class="dropdown note">
                            </li>
                            <li class="dropdown note">
                                <a href="" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false"></a>
                            </li>
                            <div class="clearfix"></div>
                        </ul>
                    </div>
                    <div class="clearfix"></div>
                    <!--//profile_details-->
                </div>
                <!--//menu-right-->
                <div class="clearfix"></div>
            </div>
            <!-- //header-ends -->
            <!--outter-wp-->
            <div class="outter-wp">
                <!--sub-heard-part-->
                <div class="sub-heard-part">
                    <ol class="breadcrumb m-b-0">
                        <li><a href="home">Home</a></li>
                        <li class="active">Tables</li>
                    </ol>
                </div>
                <!--//sub-heard-part-->
                <div class="graph-visual tables-main">
                    <h2 class="inner-tittle">WASMOVING Table</h2>
                    <div class="graph">
                        <div class="tables">

                            <table class="table table-hover">
                                <thead>
                                <tr>

                                    <th>ID</th>
                                    <th>LOCATIONCODE</th>
                                    <th>ITEMCODE</th>
                                    <th>DAY</th>
                                    <th>QUANTITY</th>
                                    <th>TYPE</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach var="asmoving" items="${asmoving}">
                                    <tr>
                                        <th scope="row">${asmoving.ID}</th>
                                        <td>${asmoving.LOCATIONCODE}</td>
                                        <td>${asmoving.ITEMCODE}</td>
                                        <td>${asmoving.DAY}</td>
                                        <td>${asmoving.QUANTITY}</td>
                                        <td>${asmoving.TYPE}</td>
                                    </tr>
                                </c:forEach>

                                </tbody>
                            </table>
                        </div>

                    </div>

                </div>
                <%--<h3 class="inner-tittle two">Hover Rows Table</h3>--%>
                <%--<div class="graph">--%>
                <%--<div class="tables">--%>

                <%--<table class="table table-hover"> <thead> <tr> <th>#</th> <th>First Name</th> <th>Last Name</th> <th>User Name</th> </tr> </thead> <tbody> <tr> <th scope="row">1</th> <td>Mark</td> <td>Otto</td> <td>@mdo</td> </tr> <tr> <th scope="row">2</th> <td>Jacob</td> <td>Thornton</td> <td>@fat</td> </tr> <tr> <th scope="row">3</th> <td>Larry</td> <td>the Bird</td> <td>@twitter</td> </tr> </tbody> </table>--%>
                <%--</div>--%>

                <%--</div>--%>
                <%--<h3 class="inner-tittle two">Hover Rows Table </h3>--%>
                <%--<div class="graph">--%>
                <%--<div class="tables">--%>

                <%--<table class="table table-hover"> <thead> <tr> <th>#</th> <th>First Name</th> <th>Last Name</th> <th>User Name</th> </tr> </thead> <tbody> <tr> <th scope="row">1</th> <td>Mark</td> <td>Otto</td> <td>@mdo</td> </tr> <tr> <th scope="row">2</th> <td>Jacob</td> <td>Thornton</td> <td>@fat</td> </tr> <tr> <th scope="row">3</th> <td>Larry</td> <td>the Bird</td> <td>@twitter</td> </tr> </tbody> </table>--%>
                <%--</div>--%>

                <%--</div>--%>
                <%--<h3 class="inner-tittle two">Hover Rows Table</h3>--%>
                <%--<div class="graph">--%>
                <%--<div class="tables">--%>

                <%--<table class="table table-hover"> <thead> <tr> <th>#</th> <th>First Name</th> <th>Last Name</th> <th>User Name</th> </tr> </thead> <tbody> <tr> <th scope="row">1</th> <td>Mark</td> <td>Otto</td> <td>@mdo</td> </tr> <tr> <th scope="row">2</th> <td>Jacob</td> <td>Thornton</td> <td>@fat</td> </tr> <tr> <th scope="row">3</th> <td>Larry</td> <td>the Bird</td> <td>@twitter</td> </tr> </tbody> </table>--%>
                <%--</div>--%>

                <%--</div>--%>
                <%--<h3 class="inner-tittle two">Hover Rows Table</h3>--%>
                <%--<div class="graph">--%>
                <%--<div class="tables">--%>

                <%--<table class="table table-hover"> <thead> <tr> <th>#</th> <th>First Name</th> <th>Last Name</th> <th>User Name</th> </tr> </thead> <tbody> <tr> <th scope="row">1</th> <td>Mark</td> <td>Otto</td> <td>@mdo</td> </tr> <tr> <th scope="row">2</th> <td>Jacob</td> <td>Thornton</td> <td>@fat</td> </tr> <tr> <th scope="row">3</th> <td>Larry</td> <td>the Bird</td> <td>@twitter</td> </tr> </tbody> </table>--%>
                <%--</div>--%>

                <%--</div>--%>
            </div>
            <!--//graph-visual-->
        </div>
        <!--//outer-wp-->
        <!--footer section start-->
        <footer>
            <p>&copy 2016 AMZIL Fatima & NAJI Ibtissam . All Rights Reserved</p>
        </footer>
        <!--footer section end-->
    </div>
</div>
<!--//content-inner-->
<!--/sidebar-menu-->
<div class="sidebar-menu">
    <header class="logo">
        <a href="#" class="sidebar-icon"> <span class="fa fa-bars"></span> </a> <a href="home"> <span id="logo"> <img align="center" alt="Brand" src="resources/pictures/logo.png"></span>
        <!--<img id="logo" src="" alt="Logo"/>-->
    </a>
    </header>
    <div style="border-top:1px solid rgba(69, 74, 84, 0.7)"></div>
    <div class="menu">
        <ul id="menu" >
            <li id="menu-academico" ><a href=""><i class="fa fa-table"></i> <span> Data</span> <span class="fa fa-angle-right" style="float: right"></span></a>
                <ul id="menu-academico-sub" >
                    <li id="menu-academico" ><a href="input"><i class="fa fa-download"></i>&nbsp;Inputs</a>
                        <ul id="menu-mensagens-sub"  >
                            <li  id="menu-mensagens-enviadas" style="width:180px" ><a href="costsandtime">COSTSANDTIME</a></li>
                            <li  id="menu-mensagens-enviadas" style="width:180px" ><a href="demands">DEMANDS</a></li>
                            <li  id="menu-mensagens-enviadas" style="width:180px" ><a href="faultystock">FAULTYSTOCK</a></li>
                            <li  id="menu-mensagens-enviadas" style="width:180px" ><a href="healthystock">HEALTHYSTOCK</a></li>
                            <li  id="menu-mensagens-enviadas" style="width:180px" ><a href="items">ITEMS</a></li>
                            <li  id="menu-mensagens-enviadas" style="width:180px" ><a href="locations">LOCATIONS</a></li>
                            <li  id="menu-mensagens-enviadas" style="width:180px" ><a href="nmit">NMIT</a></li>
                            <li  id="menu-mensagens-enviadas" style="width:180px" ><a href="planner_settings">PLANNER_SETTINGS</a></li>
                            <li  id="menu-mensagens-enviadas" style="width:180px" ><a href="toursfrance">TOURSFRANCE</a></li>
                            <li  id="menu-mensagens-enviadas" style="width:180px" ><a href="wasmoving">WASMOVING</a></li>
                        </ul>
                    </li>

                    <li><a href="output"><i class="fa fa-upload"></i>&nbsp;Outputs</a>
                        <ul id="menu-mensagens-sub"  >
                            <li  id="menu-mensagens-enviadas" style="width:180px" ><a href="outputcosts">OUTPUT_COSTS</a></li>
                            <li  id="menu-mensagens-enviadas" style="width:180px" ><a href="outputfstock">OUTPUT_FSTOCK</a></li>
                            <li  id="menu-mensagens-enviadas" style="width:180px" ><a href="outputhstock">OUTPUT_HSTOCK</a></li>
                            <li  id="menu-mensagens-enviadas" style="width:180px" ><a href="outputmoves">OUTPUT_MOVES</a></li>
                            <li  id="menu-mensagens-enviadas" style="width:180px" ><a href="outputnmit">OUTPUT_NMIT</a></li>
                            <li  id="menu-mensagens-enviadas" style="width:180px" ><a href="outputreults">OUTPUT_RESULTS</a></li>
                        </ul>
                    </li>
                </ul>
            </li>

            <li><a href="graph"><i class="lnr lnr-chart-bars"></i> <span>Graph</span><span class="fa fa-angle-right" style="float: right"></span></a>
                <ul>
                    <li><a href="dashboard.jsp"><i class="fa fa-inbox"></i> Inbox</a></li>
                    <li><a href="compose.html"><i class="fa fa-pencil-square-o"></i> Compose Mail</a></li>
                    <li><a href="editor.html"><span class="lnr lnr-highlight"></span> Editors Page</a></li>
                </ul>
            </li>
            <li><a href="dashboard"><i class="fa fa-tachometer"></i> <span>Dashboard</span></a></li>

            <li id="menu-academico" ><a href="reports"><i class="fa fa-file-text-o"></i> <span>Reports</span> <span class="fa fa-angle-right" style="float: right"></span></a>
            </li>
    </div>
</div>
<div class="clearfix"></div>
</div>
<script>
    var toggle = true;

    $(".sidebar-icon").click(function() {
        if (toggle)
        {
            $(".page-container").addClass("sidebar-collapsed").removeClass("sidebar-collapsed-back");
            $("#menu span").css({"position":"absolute"});
        }
        else
        {
            $(".page-container").removeClass("sidebar-collapsed").addClass("sidebar-collapsed-back");
            setTimeout(function() {
                $("#menu span").css({"position":"relative"});
            }, 400);
        }

        toggle = !toggle;
    });
</script>
<!--js -->
<script src="/resources/js/jquery.nicescroll.js"></script>
<script src="/resources/js/scripts.js"></script>
<!-- Bootstrap Core JavaScript -->
<script src="/resources/js/bootstrap.min2.js"></script>
</body>
</html>