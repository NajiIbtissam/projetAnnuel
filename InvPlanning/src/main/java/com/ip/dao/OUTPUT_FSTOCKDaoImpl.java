package com.ip.dao;

import com.ip.model.OUTPUT_COSTS;
import com.ip.model.OUTPUT_FSTOCK;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by titam on 02/11/16.
 */
public class OUTPUT_FSTOCKDaoImpl implements OUTPUT_FSTOCKDao {
    @Override
    public List<OUTPUT_FSTOCK> getAllOutputFstock() {
        Session s= HibernateUtils.getSessionFactory().openSession();
        return s.createQuery("from OUTPUT_FSTOCK",OUTPUT_FSTOCK.class).list();
    }
}
