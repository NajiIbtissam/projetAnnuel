package com.ip.dao;

import com.ip.model.Planner_settings;
import org.hibernate.Session;

import java.util.ArrayList;

/**
 * Created by titam on 01/11/16.
 */
public class Planner_settingsDaoImpl implements Planner_settingsDao {

    public ArrayList<Planner_settings> getAllPlanner_settings(){
        ArrayList<Planner_settings> planner_settingses=new ArrayList<>();
        Session s= HibernateUtils.getSessionFactory().openSession();
        planner_settingses=(ArrayList<Planner_settings>)s.createCriteria(Planner_settings.class).list();
        return planner_settingses;
    }
}
