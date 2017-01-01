package com.ip.dao;

import com.ip.model.OUTPUT_NMIT;
import com.ip.model.WasMoving;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by titam on 01/11/16.
 */
public class WasMovingDaoImpl implements  WasMovingDao {

    public List<WasMoving> getAllWasMoving(){
        Session s= HibernateUtils.getSessionFactory().openSession();
        return s.createQuery("from WasMoving",WasMoving.class).list();
    }
}
