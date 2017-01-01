package com.ip.dao;

import com.ip.model.FaultyStock;
import com.ip.model.HealthyStock;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by titam on 01/11/16.
 */
public class HealthyStockDaoImpl implements  HealthyStockDao{
    public List<HealthyStock> getAllHealthyStock(){
        Session s= HibernateUtils.getSessionFactory().openSession();
        return s.createQuery("from HealthyStock",HealthyStock.class).list();
    }
}
