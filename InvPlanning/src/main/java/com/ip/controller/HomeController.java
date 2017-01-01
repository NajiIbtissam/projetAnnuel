package com.ip.controller;

import com.ip.dao.*;
import com.ip.model.CostsAndTime;
import com.ip.model.OUTPUT_MOVES;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
//import org.springframework.web.servlet.ModelAndView;

/**
 * Created by fatima on 19/10/16.
 */


@Controller
public class HomeController {
    public HomeController() {
    }

    @RequestMapping({"/home", "/", "/costsandtime"})
    public ModelAndView home() {
        CostsAndTimeDaoImpl cd = new CostsAndTimeDaoImpl();
        List costsandtime = cd.getAllCostsAndTime();
        ModelAndView mav = new ModelAndView();
        mav.addObject("costsandtime", costsandtime);
        mav.setViewName("costsandtime");
        return mav;
    }

    @RequestMapping({"/demands"})
    public ModelAndView demands() {
        DemandsDaoImpl dd = new DemandsDaoImpl();
        List demands = dd.getAllDemands();
        ModelAndView mav = new ModelAndView();
        mav.addObject("demands", demands);
        mav.setViewName("demands");
        return mav;
    }

    @RequestMapping({"/faultystock"})
    public ModelAndView faultystock() {
        FaultyStockDaoImpl fs = new FaultyStockDaoImpl();
        List faultystock = fs.getAllFaultyStock();
        ModelAndView mav = new ModelAndView();
        mav.addObject("faultystock", faultystock);
        mav.setViewName("faultystock");
        return mav;
    }

    @RequestMapping({"/healthystock"})
    public ModelAndView healthystock() {
        HealthyStockDaoImpl cd = new HealthyStockDaoImpl();
        List healthystock = cd.getAllHealthyStock();
        ModelAndView mav = new ModelAndView();
        mav.addObject("healthystock", healthystock);
        mav.setViewName("healthystock");
        return mav;
    }

    @RequestMapping({"/items"})
    public ModelAndView items() {
        ItemsDaoImpl id = new ItemsDaoImpl();
        List items = id.getAllItems();
        ModelAndView mav = new ModelAndView();
        mav.addObject("items", items);
        mav.setViewName("items");
        return mav;
    }

    @RequestMapping({"/locations"})
    public ModelAndView locations() {
        LocationsDaoImpl id = new LocationsDaoImpl();
        List locations = id.getAllLocations();
        ModelAndView mav = new ModelAndView();
        mav.addObject("locations", locations);
        mav.setViewName("locations");
        return mav;
    }

    @RequestMapping({"/nmit"})
    public ModelAndView nmit() {
        NmitDaoImpl id = new NmitDaoImpl();
        List nmit = id.getAllNmit();
        ModelAndView mav = new ModelAndView();
        mav.addObject("nmit", nmit);
        mav.setViewName("nmit");
        return mav;
    }

    @RequestMapping({"/graph"})
    public ModelAndView graph() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("graph");
        return mav;
    }

    @RequestMapping({"/planner_settings"})
    public ModelAndView planner_settings() {
        Planner_settingsDaoImpl id = new Planner_settingsDaoImpl();
        List planner_settings = id.getAllPlanner_settings();
        ModelAndView mav = new ModelAndView();
        mav.addObject("planner_settings", planner_settings);
        mav.setViewName("planner_settings");
        return mav;
    }

    @RequestMapping({"/toursfrance"})
    public ModelAndView toursfrance() {
        ToursFranceDaoImpl id = new ToursFranceDaoImpl();
        List toursfrance = id.getAllToursFrance();
        ModelAndView mav = new ModelAndView();
        mav.addObject("toursfrance", toursfrance);
        mav.setViewName("toursfrance");
        return mav;
    }

    @RequestMapping({"/wasmoving"})
    public ModelAndView wasmoving() {
        WasMovingDaoImpl id = new WasMovingDaoImpl();
        List wasmoving = id.getAllWasMoving();
        ModelAndView mav = new ModelAndView();
        mav.addObject("wasmoving", wasmoving);
        mav.setViewName("wasmoving");
        return mav;
    }

    @RequestMapping({"/outputcosts"})
    public ModelAndView outputcosts() {
        OUTPUT_COSTSDaoImpl ocd = new OUTPUT_COSTSDaoImpl();
        List outputcosts = ocd.getAllOutputCosts();
        ModelAndView mav = new ModelAndView();
        mav.addObject("outputcosts", outputcosts);
        mav.setViewName("outputcosts");
        return mav;
    }

    @RequestMapping({"/outputfstock"})
    public ModelAndView outputfstock() {
        OUTPUT_FSTOCKDaoImpl ofd = new OUTPUT_FSTOCKDaoImpl();
        List outputfstock = ofd.getAllOutputFstock();
        ModelAndView mav = new ModelAndView();
        mav.addObject("outputfstock", outputfstock);
        mav.setViewName("outputfstock");
        return mav;
    }

    @RequestMapping({"/outputhstock"})
    public ModelAndView outputhstock() {
        OUTPUT_HSTOCKDaoImpl ohd = new OUTPUT_HSTOCKDaoImpl();
        List outputhstock = ohd.getAllOutputHstock();
        ModelAndView mav = new ModelAndView();
        mav.addObject("outputhstock", outputhstock);
        mav.setViewName("outputhstock");
        return mav;
    }

    @RequestMapping({"/outputmoves"})
    public ModelAndView outputmoves() {
        OUTPUT_MOVESDaoImpl omd = new OUTPUT_MOVESDaoImpl();
        List outputmoves = omd.getAllOutputMoves();
        ModelAndView mav = new ModelAndView();
        mav.addObject("outputmoves", outputmoves);
        mav.setViewName("outputmoves");
        return mav;
    }

    @RequestMapping({"/outputnmit"})
    public ModelAndView outputnmit() {
        OUTPUT_NMITDaoImpl ond = new OUTPUT_NMITDaoImpl();
        List outputnmit = ond.getAllOutputNmit();
        ModelAndView mav = new ModelAndView();
        mav.addObject("outputnmit", outputnmit);
        mav.setViewName("outputnmit");
        return mav;
    }

    @RequestMapping({"/outputreults"})
    public ModelAndView outputreults() {
        OUTPUT_RESULTSDaoImpl ord = new OUTPUT_RESULTSDaoImpl();
        List outputreults = ord.getAllOutputReults();
        ModelAndView mav = new ModelAndView();
        mav.addObject("outputreults", outputreults);
        mav.setViewName("outputreults");
        return mav;
    }

    @RequestMapping(
            value = {"/graphData"},
            method = {RequestMethod.GET}
    )
    @ResponseBody
    public List<OUTPUT_MOVES> graphData(@RequestParam long day) {
        OUTPUT_MOVESDaoImpl omd = new OUTPUT_MOVESDaoImpl();
        return omd.getOutputMovesByDayfrom(day);
    }

    @RequestMapping(
            value = {"/getMovesDistinct"},
            method = {RequestMethod.GET}
    )
    @ResponseBody
    public List<OUTPUT_MOVES> getOutputDistinctMovesByDayfrom(@RequestParam long day) {
        OUTPUT_MOVESDaoImpl omd = new OUTPUT_MOVESDaoImpl();
        return omd.getOutputDistinctMovesByDayfrom(day);
    }

    @RequestMapping(
            value = {"/getDaysNumber"},
            method = {RequestMethod.GET}
    )
    @ResponseBody
    public String getDaysNumber() {
        OUTPUT_MOVESDaoImpl omd = new OUTPUT_MOVESDaoImpl();
        return "{\"days\":" + omd.getOutputMovesNumDays() + "}";
    }

    @RequestMapping({"/costsandtimeData"})
    @ResponseBody
    public List<CostsAndTime> costsandtimeData() {
        CostsAndTimeDaoImpl cd = new CostsAndTimeDaoImpl();
        return cd.getAllCostsAndTime();
    }

    @RequestMapping({"/dashboard"})
    public String dashboard() {
        return "dashboard";
    }
}


//Test