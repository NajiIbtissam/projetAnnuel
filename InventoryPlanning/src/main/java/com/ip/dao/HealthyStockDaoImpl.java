package com.ip.dao;

import com.ip.model.HealthyStock;
import org.hibernate.Session;

import java.util.ArrayList;

/**
 * Created by titam on 01/11/16.
 */
public class HealthyStockDaoImpl implements  HealthyStockDao{
    public ArrayList<HealthyStock> getAllHealthyStock(){
        ArrayList<HealthyStock> healthyStocks=new ArrayList<>();
        Session s= HibernateUtils.getSessionFactory().openSession();
        healthyStocks=(ArrayList<HealthyStock>)s.createCriteria(HealthyStock.class).list();
        return healthyStocks;
    }
}
