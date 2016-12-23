package com.ip.dao;

import com.ip.model.CostsAndTime;
import org.hibernate.Session;

import java.util.ArrayList;

/**
 * Created by titam on 31/10/16.
 */
public class CostsAndTimeDaoImpl implements CostsAndTimeDao {
    @Override
    public ArrayList<CostsAndTime> getAllCostsAndTime() {
        ArrayList<CostsAndTime> costsandtime=new ArrayList<>();
        Session s= HibernateUtils.getSessionFactory().openSession();
        costsandtime=(ArrayList<CostsAndTime>)s.createCriteria(CostsAndTime.class).list();
        return costsandtime;
    }
}
