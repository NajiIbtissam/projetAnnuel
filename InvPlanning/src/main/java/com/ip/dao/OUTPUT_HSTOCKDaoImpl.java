package com.ip.dao;

import com.ip.model.OUTPUT_HSTOCK;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by titam on 02/11/16.
 */
public class OUTPUT_HSTOCKDaoImpl implements OUTPUT_HSTOCKDao {
    @Override
    public List<OUTPUT_HSTOCK> getAllOutputHstock() {
        Session s= HibernateUtils.getSessionFactory().openSession();
        return s.createQuery("from OUTPUT_HSTOCK",OUTPUT_HSTOCK.class).list();
    }
}
