package com.ip.dao;

import com.ip.model.OUTPUT_MOVES;

import java.util.List;
import java.util.List;

/**
 * Created by titam on 02/11/16.
 */
public interface OUTPUT_MOVESDao {
    List<OUTPUT_MOVES> getAllOutputMoves();
    List<OUTPUT_MOVES> getOutputMovesByDayfrom(long day);
    long getOutputMovesNumDays();
    List<OUTPUT_MOVES> getOutputDistinctMovesByDayfrom(long day);
}
