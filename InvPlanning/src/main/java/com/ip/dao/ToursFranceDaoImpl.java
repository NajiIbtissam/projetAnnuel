package com.ip.dao;

import com.ip.model.OUTPUT_NMIT;
import com.ip.model.ToursFrance;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by titam on 01/11/16.
 */
public class ToursFranceDaoImpl implements  ToursFranceDao {

    public List<ToursFrance> getAllToursFrance(){
        Session s= HibernateUtils.getSessionFactory().openSession();
        return s.createQuery("from ToursFrance",ToursFrance.class).list();
    }
}
