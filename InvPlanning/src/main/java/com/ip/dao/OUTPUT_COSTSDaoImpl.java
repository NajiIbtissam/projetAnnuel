package com.ip.dao;

import com.ip.model.Nmit;
import com.ip.model.OUTPUT_COSTS;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by titam on 02/11/16.
 */
public class OUTPUT_COSTSDaoImpl implements OUTPUT_COSTSDao {
    @Override
    public List<OUTPUT_COSTS> getAllOutputCosts() {
        Session s= HibernateUtils.getSessionFactory().openSession();
        return s.createQuery("from OUTPUT_COSTS",OUTPUT_COSTS.class).list();
    }
}
