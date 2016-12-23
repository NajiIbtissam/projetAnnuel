package com.ip.dao;

import com.ip.model.Demands;
import org.hibernate.Session;

import java.util.ArrayList;

/**
 * Created by titam on 30/10/16.
 */
public class DemandsDaoImpl implements DemandsDao{

    public ArrayList<Demands> getAllDemands() {
        ArrayList<Demands> demands=new ArrayList<>();
        Session s= HibernateUtils.getSessionFactory().openSession();
        demands=(ArrayList<Demands>)s.createCriteria(Demands.class).list();
        return demands;
    }
}
