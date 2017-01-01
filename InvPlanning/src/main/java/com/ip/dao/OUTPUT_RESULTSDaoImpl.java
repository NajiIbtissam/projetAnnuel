package com.ip.dao;

import com.ip.model.OUTPUT_NMIT;
import com.ip.model.OUTPUT_RESULTS;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by titam on 02/11/16.
 */
public class OUTPUT_RESULTSDaoImpl implements OUTPUT_RESULTSDao {
    @Override
    public List<OUTPUT_RESULTS> getAllOutputReults() {
        List<OUTPUT_RESULTS> outputreults;
        Session s= HibernateUtils.getSessionFactory().openSession();
        return s.createQuery("from OUTPUT_RESULTS",OUTPUT_RESULTS.class).list();
    }
}
