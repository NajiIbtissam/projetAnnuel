package com.ip.dao;

import com.ip.model.OUTPUT_NMIT;
import com.ip.model.Planner_settings;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by titam on 01/11/16.
 */
public class Planner_settingsDaoImpl implements Planner_settingsDao {

    public List<Planner_settings> getAllPlanner_settings(){
        Session s= HibernateUtils.getSessionFactory().openSession();
        return s.createQuery("from Planner_settings",Planner_settings.class).list();
    }
}
