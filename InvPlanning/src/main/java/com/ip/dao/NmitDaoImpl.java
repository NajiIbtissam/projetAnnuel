package com.ip.dao;

import com.ip.model.Locations;
import com.ip.model.Nmit;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by titam on 01/11/16.
 */
public class NmitDaoImpl implements  NmitDao{
    public List<Nmit> getAllNmit(){
        Session s= HibernateUtils.getSessionFactory().openSession();
        return s.createQuery("from Nmit",Nmit.class).list();
    }
}
