package com.ip.dao;

import com.ip.model.OUTPUT_HSTOCK;
import com.ip.model.OUTPUT_MOVES;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;
import java.util.List;

/**
 * Created by titam on 02/11/16.
 */
public class OUTPUT_MOVESDaoImpl implements OUTPUT_MOVESDao {
    @Override
    public List<OUTPUT_MOVES> getAllOutputMoves() {
        Session s = HibernateUtils.getSessionFactory().openSession();
        return s.createQuery("from OUTPUT_MOVES",OUTPUT_MOVES.class).list();
    }

    @Override
    public List<OUTPUT_MOVES> getOutputMovesByDayfrom(long day) {
        Session s = HibernateUtils.getSessionFactory().openSession();
        Query query = s.createQuery("from OUTPUT_MOVES where DAYFROM=" + day, OUTPUT_MOVES.class);
        return query.list();

    }

    @Override
    public List<OUTPUT_MOVES> getOutputDistinctMovesByDayfrom(long day) {
        Session s = HibernateUtils.getSessionFactory().openSession();
        Query query = s.createQuery("select distinct DAYFROM from OUTPUT_MOVES where DAYFROM=" + day, OUTPUT_MOVES.class);
        return query.list();

    }

    @Override
    public long getOutputMovesNumDays() {
        Session s = HibernateUtils.getSessionFactory().openSession();
        return s.createQuery("select count(distinct DAYFROM) from OUTPUT_MOVES ", Long.class).uniqueResult();

    }
}
