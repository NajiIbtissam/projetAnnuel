package com.ip.dao;

import com.ip.model.OUTPUT_MOVES;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by titam on 02/11/16.
 */
public class OUTPUT_MOVESDaoImpl implements OUTPUT_MOVESDao {
    @Override
    public ArrayList<OUTPUT_MOVES> getAllOutputMoves() {
        ArrayList<OUTPUT_MOVES> outputmoves = new ArrayList<>();
        Session s = HibernateUtils.getSessionFactory().openSession();
        outputmoves = (ArrayList<OUTPUT_MOVES>) s.createCriteria(OUTPUT_MOVES.class).list();
        return outputmoves;
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
