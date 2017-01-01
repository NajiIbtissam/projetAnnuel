package com.ip.dao;

import com.ip.model.CostsAndTime;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by titam on 31/10/16.
 */
public class CostsAndTimeDaoImpl implements CostsAndTimeDao {
    @Override
    public List<CostsAndTime> getAllCostsAndTime() {
        Session s = HibernateUtils.getSessionFactory().openSession();
        return s.createQuery("from CostsAndTime",CostsAndTime.class).list();
    }
}
