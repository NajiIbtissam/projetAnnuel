package com.ip.dao;

import com.ip.model.Items;
import org.hibernate.Session;

import java.util.ArrayList;

/**
 * Created by titam on 01/11/16.
 */
public class ItemsDaoImpl implements ItemsDao {

    public ArrayList<Items> getAllItems(){
        ArrayList<Items> items=new ArrayList<>();
        Session s= HibernateUtils.getSessionFactory().openSession();
        items=(ArrayList<Items>)s.createCriteria(Items.class).list();
        return items;
    }
}
