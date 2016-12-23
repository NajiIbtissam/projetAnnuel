package com.ip.dao;

import com.ip.model.Nmit;
import org.hibernate.Session;

import java.util.ArrayList;

/**
 * Created by titam on 01/11/16.
 */
public class NmitDaoImpl implements  NmitDao{
    public ArrayList<Nmit> getAllNmit(){
        ArrayList<Nmit> nmit=new ArrayList<>();
        Session s= HibernateUtils.getSessionFactory().openSession();
        nmit=(ArrayList<Nmit>)s.createCriteria(Nmit.class).list();
        return nmit;
    }
}
