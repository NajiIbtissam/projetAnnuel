<nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="index.html">Inventory Planning</a>
    </div>
    <!-- /.navbar-header -->

    <ul class="nav navbar-top-links navbar-right">
        <!-- /.dropdown -->

        <li class="dropdown">
            <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                <i class="fa fa-user fa-fw"></i> <i class="fa fa-caret-down"></i>
            </a>
            <ul class="dropdown-menu dropdown-user">
                <li><a href="#"><i class="fa fa-user fa-fw"></i> User Profile</a>
                </li>
                <li><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a>
                </li>
                <li class="divider"></li>
                <li><a href="login.html"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                </li>
            </ul>
            <!-- /.dropdown-user -->
        </li>
        <!-- /.dropdown -->
    </ul>
    <!-- /.navbar-top-links -->

    <div class="navbar-default sidebar" role="navigation">
        <div class="sidebar-nav navbar-collapse">
            <ul class="nav" id="side-menu">
                <li>
                    <a href="#"><i class="fa fa-database" aria-hidden="true"></i> Data<span
                            class="fa arrow"></span></a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a href="#"><i class="fa fa-sign-in" aria-hidden="true"></i> Inputs <span class="fa arrow"></span></a>
                            <ul class="nav nav-third-level">
                                <li><a href="${pageContext.request.contextPath}/costsandtime">COSTSANDTIME</a></li>
                                <li><a href="${pageContext.request.contextPath}/demands">DEMANDS</a></li>
                                <li><a href="${pageContext.request.contextPath}/faultystock">FAULTYSTOCK</a></li>
                                <li><a href="${pageContext.request.contextPath}/healthystock">HEALTHYSTOCK</a></li>
                                <li><a href="${pageContext.request.contextPath}/items">ITEMS</a></li>
                                <li><a href="${pageContext.request.contextPath}/locations">LOCATIONS</a></li>
                                <li><a href="${pageContext.request.contextPath}/nmit">NMIT</a></li>
                                <li><a href="${pageContext.request.contextPath}/planner_settings">PLANNER_SETTINGS</a></li>
                                <li><a href="${pageContext.request.contextPath}/toursfrance">TOURSFRANCE</a></li>
                                <li><a href="${pageContext.request.contextPath}/wasmoving">WASMOVING</a></li>
                            </ul>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-sign-out" aria-hidden="true"></i> Outputs <span class="fa arrow"></span></a>
                            <ul class="nav nav-third-level">
                                <li><a href="${pageContext.request.contextPath}/outputcosts">OUTPUT_COSTS</a></li>
                                <li><a href="${pageContext.request.contextPath}/outputfstock">OUTPUT_FSTOCK</a></li>
                                <li><a href="${pageContext.request.contextPath}/outputhstock">OUTPUT_HSTOCK</a></li>
                                <li><a href="${pageContext.request.contextPath}/outputmoves">OUTPUT_MOVES</a></li>
                                <li><a href="${pageContext.request.contextPath}/outputnmit">OUTPUT_NMIT</a></li>
                                <li><a href="${pageContext.request.contextPath}/outputreults">OUTPUT_RESULTS</a></li>
                            </ul>
                        </li>
                    </ul>
                    <!-- /.nav-second-level -->
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/graph"><i class="fa fa-database" aria-hidden="true"></i> Planning Graph<span
                            class="fa arrow"></span></a>
                </li>
            </ul>
        </div>
        <!-- /.sidebar-collapse -->
    </div>
    <!-- /.navbar-static-side -->
</nav>