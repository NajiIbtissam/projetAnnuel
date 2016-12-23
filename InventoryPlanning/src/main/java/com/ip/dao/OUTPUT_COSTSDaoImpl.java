package com.ip.dao;

import com.ip.model.OUTPUT_COSTS;
import org.hibernate.Session;

import java.util.ArrayList;

/**
 * Created by titam on 02/11/16.
 */
public class OUTPUT_COSTSDaoImpl implements OUTPUT_COSTSDao {
    @Override
    public ArrayList<OUTPUT_COSTS> getAllOutputCosts() {
        ArrayList<OUTPUT_COSTS> outputcosts=new ArrayList<>();
        Session s= HibernateUtils.getSessionFactory().openSession();
        outputcosts=(ArrayList<OUTPUT_COSTS>)s.createCriteria(OUTPUT_COSTS.class).list();
        return outputcosts;
    }
}
