package com.ip.dao;

import com.ip.model.OUTPUT_HSTOCK;
import org.hibernate.Session;

import java.util.ArrayList;

/**
 * Created by titam on 02/11/16.
 */
public class OUTPUT_HSTOCKDaoImpl implements OUTPUT_HSTOCKDao {
    @Override
    public ArrayList<OUTPUT_HSTOCK> getAllOutputHstock() {
        ArrayList<OUTPUT_HSTOCK> outputhstock=new ArrayList<>();
        Session s= HibernateUtils.getSessionFactory().openSession();
        outputhstock=(ArrayList<OUTPUT_HSTOCK>)s.createCriteria(OUTPUT_HSTOCK.class).list();
        return outputhstock;
    }
}
