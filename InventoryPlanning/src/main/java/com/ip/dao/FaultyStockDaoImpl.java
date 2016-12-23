package com.ip.dao;

import com.ip.model.FaultyStock;
import org.hibernate.Session;


import java.util.List;

/**
 * Created by titam on 01/11/16.
 */
public class FaultyStockDaoImpl implements FaultyStockDao {

    public List<FaultyStock> getAllFaultyStock(){
        List<FaultyStock> faultyStocks;
        Session s= HibernateUtils.getSessionFactory().openSession();
        faultyStocks=(List<FaultyStock>)s.createCriteria(FaultyStock.class).list();
        return faultyStocks;
    }
}
