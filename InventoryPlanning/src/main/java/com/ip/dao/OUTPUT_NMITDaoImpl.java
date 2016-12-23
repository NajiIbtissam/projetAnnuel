package com.ip.dao;

import com.ip.model.OUTPUT_NMIT;
import org.hibernate.Session;

import java.util.ArrayList;

/**
 * Created by titam on 02/11/16.
 */
public class OUTPUT_NMITDaoImpl implements  OUTPUT_NMITDao{
    @Override
    public ArrayList<OUTPUT_NMIT> getAllOutputNmit() {
        ArrayList<OUTPUT_NMIT> outputnmit=new ArrayList<>();
        Session s= HibernateUtils.getSessionFactory().openSession();
        outputnmit=(ArrayList<OUTPUT_NMIT>)s.createCriteria(OUTPUT_NMIT.class).list();
        return outputnmit;
    }
}
