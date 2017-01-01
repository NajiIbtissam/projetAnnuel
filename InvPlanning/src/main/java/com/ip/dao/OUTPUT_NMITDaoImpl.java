package com.ip.dao;

import com.ip.model.OUTPUT_HSTOCK;
import com.ip.model.OUTPUT_NMIT;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by titam on 02/11/16.
 */
public class OUTPUT_NMITDaoImpl implements  OUTPUT_NMITDao{
    @Override
    public List<OUTPUT_NMIT> getAllOutputNmit() {
        Session s= HibernateUtils.getSessionFactory().openSession();
        return s.createQuery("from OUTPUT_NMIT",OUTPUT_NMIT.class).list();
    }
}
