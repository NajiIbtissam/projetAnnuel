package com.ip.model;

import javax.persistence.*;

/**
 * Created by titam on 02/11/16.
 */
@Entity
public class OUTPUT_COSTS {
    @Column(unique = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    @Basic
    private String NAME;
    @Basic
    private Float WEIGHT;
    @Basic
    private Float RESULT;
    @Basic
    private String ITEMCODE;

    public OUTPUT_COSTS() {
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

    public Float getWEIGHT() {
        return WEIGHT;
    }

    public void setWEIGHT(Float WEIGHT) {
        this.WEIGHT = WEIGHT;
    }

    public Float getRESULT() {
        return RESULT;
    }

    public void setRESULT(Float RESULT) {
        this.RESULT = RESULT;
    }

    public String getITEMCODE() {
        return ITEMCODE;
    }

    public void setITEMCODE(String ITEMCODE) {
        this.ITEMCODE = ITEMCODE;
    }
}
