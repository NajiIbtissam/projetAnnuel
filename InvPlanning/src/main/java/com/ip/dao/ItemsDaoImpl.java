package com.ip.dao;

import com.ip.model.Items;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by titam on 01/11/16.
 */
public class ItemsDaoImpl implements ItemsDao {

    public List<Items> getAllItems(){
        Session s= HibernateUtils.getSessionFactory().openSession();
        return s.createQuery("from Items",Items.class).list();
    }
}
