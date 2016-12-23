package com.ip.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by titam on 01/11/16.
 */
@Entity
public class Locations implements Serializable {

    @Column(unique = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @Basic
    private String CODE;

    @Basic
    private String NAME;

    @Basic
    private Long REPAIR;

    @Basic
    private Long DEMANDS;

    public Locations() {
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getCODE() {
        return CODE;
    }

    public void setCODE(String CODE) {
        this.CODE = CODE;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public Long getREPAIR() {
        return REPAIR;
    }

    public void setREPAIR(Long REPAIR) {
        this.REPAIR = REPAIR;
    }

    public Long getDEMANDS() {
        return DEMANDS;
    }

    public void setDEMANDS(Long DEMANDS) {
        this.DEMANDS = DEMANDS;
    }
}

