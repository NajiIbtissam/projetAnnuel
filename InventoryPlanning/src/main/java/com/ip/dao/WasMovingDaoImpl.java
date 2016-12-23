package com.ip.dao;

import com.ip.model.WasMoving;
import org.hibernate.Session;

import java.util.ArrayList;

/**
 * Created by titam on 01/11/16.
 */
public class WasMovingDaoImpl implements  WasMovingDao {

    public ArrayList<WasMoving> getAllWasMoving(){
        ArrayList<WasMoving> wasMoving=new ArrayList<>();
        Session s= HibernateUtils.getSessionFactory().openSession();
        wasMoving=(ArrayList<WasMoving>)s.createCriteria(WasMoving.class).list();
        return wasMoving;
    }
}
