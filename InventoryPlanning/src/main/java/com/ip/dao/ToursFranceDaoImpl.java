package com.ip.dao;

import com.ip.model.ToursFrance;
import org.hibernate.Session;

import java.util.ArrayList;

/**
 * Created by titam on 01/11/16.
 */
public class ToursFranceDaoImpl implements  ToursFranceDao {

    public ArrayList<ToursFrance> getAllToursFrance(){
        ArrayList<ToursFrance> toursFrances=new ArrayList<>();
        Session s= HibernateUtils.getSessionFactory().openSession();
        toursFrances=(ArrayList<ToursFrance>)s.createCriteria(ToursFrance.class).list();
        return toursFrances;
    }
}
