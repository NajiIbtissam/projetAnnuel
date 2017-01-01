package com.ip.dao;

import com.ip.model.Demands;
import com.ip.model.FaultyStock;
import org.hibernate.Session;


import java.util.List;

/**
 * Created by titam on 01/11/16.
 */
public class FaultyStockDaoImpl implements FaultyStockDao {

    public List<FaultyStock> getAllFaultyStock(){
        Session s= HibernateUtils.getSessionFactory().openSession();
        return s.createQuery("from FaultyStock",FaultyStock.class).list();
    }
}
