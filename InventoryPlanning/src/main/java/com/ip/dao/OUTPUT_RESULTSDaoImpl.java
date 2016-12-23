package com.ip.dao;

import com.ip.model.OUTPUT_RESULTS;
import org.hibernate.Session;

import java.util.ArrayList;

/**
 * Created by titam on 02/11/16.
 */
public class OUTPUT_RESULTSDaoImpl implements OUTPUT_RESULTSDao {
    @Override
    public ArrayList<OUTPUT_RESULTS> getAllOutputReults() {
        ArrayList<OUTPUT_RESULTS> outputreults=new ArrayList<>();
        Session s= HibernateUtils.getSessionFactory().openSession();
        outputreults=(ArrayList<OUTPUT_RESULTS>)s.createCriteria(OUTPUT_RESULTS.class).list();
        return outputreults;
    }
}
