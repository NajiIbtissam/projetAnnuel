package com.ip.controller;

import com.ip.dao.DemandsDao;
import com.ip.dao.DemandsDaoImpl;
import com.ip.model.Demands;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by titam on 30/10/16.
 */
@WebServlet("/DisplayDemands")
public class DisplayDemands extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        DemandsDao dd = new DemandsDaoImpl();
        List<Demands> demands = dd.getAllDemands();
        request.setAttribute("demands",demands);
        RequestDispatcher rd=request.getRequestDispatcher("WEB-INF/views/demands.jsp");
        rd.forward(request,response);
//        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
//        System.out.println(demands.get(0).getID());
//        System.out.println(demands.get(0).getLOCATIONCODE());

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
