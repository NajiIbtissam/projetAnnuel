package com.ip.model;

import javax.persistence.*;

/**
 * Created by titam on 02/11/16.
 */
@Entity
public class OUTPUT_RESULTS {

    @Column(unique = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    @Basic
    private String NAME;
    @Basic
    private Long VALUE;
    @Basic
    private String ITEMCODE;

    public OUTPUT_RESULTS() {
    }


    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public Long getVALUE() {
        return VALUE;
    }

    public void setVALUE(Long VALUE) {
        this.VALUE = VALUE;
    }

    public String getITEMCODE() {
        return ITEMCODE;
    }

    public void setITEMCODE(String ITEMCODE) {
        this.ITEMCODE = ITEMCODE;
    }
}
