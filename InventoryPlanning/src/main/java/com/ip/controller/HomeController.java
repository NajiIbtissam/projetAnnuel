package com.ip.controller;

import com.ip.dao.*;
import com.ip.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
//import org.springframework.web.servlet.ModelAndView;
/**
 * Created by fatima on 19/10/16.
 */


@Controller
public class HomeController {


    @RequestMapping(value="home")
    public String home() {
        return "home";
    }

    @RequestMapping(value="")
    public String index() {
        return "home";
    }

    @RequestMapping(value="demands")
    public ModelAndView demands() {
        DemandsDao dd = new DemandsDaoImpl();
        List<Demands> demands = dd.getAllDemands();
        ModelAndView mav =new ModelAndView();
        mav.addObject("demands",demands);
        mav.setViewName("demands");
        return mav;
    }

    @RequestMapping(value="costsandtime")
    public ModelAndView costsandtime() {
        CostsAndTimeDao cd=new CostsAndTimeDaoImpl();
        List<CostsAndTime> costsandtime = cd.getAllCostsAndTime();
        ModelAndView mav =new ModelAndView();
        mav.addObject("costsandtime",costsandtime);
        mav.setViewName("costsandtime");
        return mav;
    }

    @RequestMapping(value="faultystock")
    public ModelAndView faultystock() {
        FaultyStockDao fs=new FaultyStockDaoImpl();
        List<FaultyStock> faultystock = fs.getAllFaultyStock();
        ModelAndView mav =new ModelAndView();
        mav.addObject("faultystock",faultystock);
        mav.setViewName("faultystock");
        return mav;
    }

    @RequestMapping(value="healthystock")
    public ModelAndView healthystock() {
        HealthyStockDao cd=new HealthyStockDaoImpl();
        List<HealthyStock> healthystock = cd.getAllHealthyStock();
        ModelAndView mav =new ModelAndView();
        mav.addObject("healthystock",healthystock);
        mav.setViewName("healthystock");
        return mav;
    }

    @RequestMapping(value="items")
    public ModelAndView items() {
        ItemsDao id=new ItemsDaoImpl();
        List<Items> items = id.getAllItems();
        ModelAndView mav =new ModelAndView();
        mav.addObject("items",items);
        mav.setViewName("items");
        return mav;
    }

    @RequestMapping(value="locations")
    public ModelAndView locations() {
        LocationsDao id=new LocationsDaoImpl();
        List<Locations> locations = id.getAllLocations();
        ModelAndView mav =new ModelAndView();
        mav.addObject("locations",locations);
        mav.setViewName("locations");
        return mav;
    }

    @RequestMapping(value="nmit")
    public ModelAndView nmit() {
        NmitDao id=new NmitDaoImpl();
        List<Nmit> nmit = id.getAllNmit();
        ModelAndView mav =new ModelAndView();
        mav.addObject("nmit",nmit);
        mav.setViewName("nmit");
        return mav;
    }

    @RequestMapping(value="planner_settings")
    public ModelAndView planner_settings() {
        Planner_settingsDao id=new Planner_settingsDaoImpl();
        List<Planner_settings> planner_settings = id.getAllPlanner_settings();
        ModelAndView mav =new ModelAndView();
        mav.addObject("planner_settings",planner_settings);
        mav.setViewName("planner_settings");
        return mav;
    }
    @RequestMapping(value="toursfrance")
    public ModelAndView toursfrance() {
        ToursFranceDao id=new ToursFranceDaoImpl();
        List<ToursFrance> toursfrance = id.getAllToursFrance();
        ModelAndView mav =new ModelAndView();
        mav.addObject("toursfrance",toursfrance);
        mav.setViewName("toursfrance");
        return mav;
    }

    @RequestMapping(value="wasmoving")
    public ModelAndView wasmoving() {
        WasMovingDao id=new WasMovingDaoImpl();
        List<WasMoving> wasmoving = id.getAllWasMoving();
        ModelAndView mav =new ModelAndView();
        mav.addObject("wasmoving",wasmoving);
        mav.setViewName("wasmoving");
        return mav;
    }

    @RequestMapping(value="outputcosts")
    public ModelAndView outputcosts() {
        OUTPUT_COSTSDao ocd = new OUTPUT_COSTSDaoImpl();
        List<OUTPUT_COSTS> outputcosts = ocd.getAllOutputCosts();
        ModelAndView mav =new ModelAndView();
        mav.addObject("outputcosts",outputcosts);
        mav.setViewName("outputcosts");
        return mav;
    }

    @RequestMapping(value="outputfstock")
    public ModelAndView outputfstock() {
        OUTPUT_FSTOCKDao ofd = new OUTPUT_FSTOCKDaoImpl();
        List<OUTPUT_FSTOCK> outputfstock = ofd.getAllOutputFstock();
        ModelAndView mav =new ModelAndView();
        mav.addObject("outputfstock",outputfstock);
        mav.setViewName("outputfstock");
        return mav;
    }

    @RequestMapping(value="outputhstock")
    public ModelAndView outputhstock() {
        OUTPUT_HSTOCKDao ohd = new OUTPUT_HSTOCKDaoImpl();
        List<OUTPUT_HSTOCK> outputhstock = ohd.getAllOutputHstock();
        ModelAndView mav =new ModelAndView();
        mav.addObject("outputhstock",outputhstock);
        mav.setViewName("outputhstock");
        return mav;
    }

    @RequestMapping(value="outputmoves")
    public ModelAndView outputmoves() {
        OUTPUT_MOVESDao omd = new OUTPUT_MOVESDaoImpl();
        List<OUTPUT_MOVES> outputmoves = omd.getAllOutputMoves();
        ModelAndView mav =new ModelAndView();
        mav.addObject("outputmoves",outputmoves);
        mav.setViewName("outputmoves");
        return mav;
    }

    @RequestMapping(value="outputnmit")
    public ModelAndView outputnmit() {
        OUTPUT_NMITDao ond = new OUTPUT_NMITDaoImpl();
        List<OUTPUT_NMIT> outputnmit = ond.getAllOutputNmit();
        ModelAndView mav =new ModelAndView();
        mav.addObject("outputnmit",outputnmit);
        mav.setViewName("outputnmit");
        return mav;
    }

    @RequestMapping(value="outputreults")
    public ModelAndView outputreults() {
        OUTPUT_RESULTSDao ord = new OUTPUT_RESULTSDaoImpl();
        List<OUTPUT_RESULTS> outputreults = ord.getAllOutputReults();
        ModelAndView mav =new ModelAndView();
        mav.addObject("outputreults",outputreults);
        mav.setViewName("outputreults");
        return mav;
    }





    @RequestMapping(value="graph")
    public String graphMode() {
        return "graph";
    }

    @RequestMapping(value="dashboard")
    public String dashboard() {
        return "dashboard";
    }
}


//Test