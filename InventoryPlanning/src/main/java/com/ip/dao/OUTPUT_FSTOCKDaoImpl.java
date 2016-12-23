package com.ip.dao;

import com.ip.model.OUTPUT_FSTOCK;
import org.hibernate.Session;

import java.util.ArrayList;

/**
 * Created by titam on 02/11/16.
 */
public class OUTPUT_FSTOCKDaoImpl implements OUTPUT_FSTOCKDao {
    @Override
    public ArrayList<OUTPUT_FSTOCK> getAllOutputFstock() {
        ArrayList<OUTPUT_FSTOCK> outputfstock=new ArrayList<>();
        Session s= HibernateUtils.getSessionFactory().openSession();
        outputfstock=(ArrayList<OUTPUT_FSTOCK>)s.createCriteria(OUTPUT_FSTOCK.class).list();
        return outputfstock;
    }
}
