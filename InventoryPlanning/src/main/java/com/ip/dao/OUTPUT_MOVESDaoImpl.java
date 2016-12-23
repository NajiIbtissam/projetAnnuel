package com.ip.dao;

import com.ip.model.OUTPUT_MOVES;
import org.hibernate.Session;

import java.util.ArrayList;

/**
 * Created by titam on 02/11/16.
 */
public class OUTPUT_MOVESDaoImpl implements OUTPUT_MOVESDao{
    @Override
    public ArrayList<OUTPUT_MOVES> getAllOutputMoves() {
        ArrayList<OUTPUT_MOVES> outputmoves=new ArrayList<>();
        Session s= HibernateUtils.getSessionFactory().openSession();
        outputmoves=(ArrayList<OUTPUT_MOVES>)s.createCriteria(OUTPUT_MOVES.class).list();
        return outputmoves;
    }
}
