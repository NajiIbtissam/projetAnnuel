package com.ip.dao;

import com.ip.model.CostsAndTime;
import com.ip.model.Demands;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by titam on 30/10/16.
 */
public class DemandsDaoImpl implements DemandsDao{

    public List<Demands> getAllDemands() {
        Session s= HibernateUtils.getSessionFactory().openSession();
        return s.createQuery("from Demands",Demands.class).list();
    }
}
