package com.ip.dao;

import com.ip.model.Locations;
import org.hibernate.Session;

import java.util.ArrayList;

/**
 * Created by titam on 01/11/16.
 */
public class LocationsDaoImpl implements LocationsDao {

    public ArrayList<Locations> getAllLocations(){
        ArrayList<Locations> locations=new ArrayList<>();
        Session s= HibernateUtils.getSessionFactory().openSession();
        locations=(ArrayList<Locations>)s.createCriteria(Locations.class).list();
        return locations;
    }
}
