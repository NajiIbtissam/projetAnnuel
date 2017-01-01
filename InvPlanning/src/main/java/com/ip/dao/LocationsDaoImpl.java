package com.ip.dao;

import com.ip.model.Items;
import com.ip.model.Locations;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by titam on 01/11/16.
 */
public class LocationsDaoImpl implements LocationsDao {

    public List<Locations> getAllLocations(){
        Session s= HibernateUtils.getSessionFactory().openSession();
        return s.createQuery("from Locations",Locations.class).list();
    }
}
