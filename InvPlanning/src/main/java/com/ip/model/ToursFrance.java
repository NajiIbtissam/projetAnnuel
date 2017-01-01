package com.ip.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by titam on 01/11/16.
 */
@Entity
public class ToursFrance implements Serializable{

    @Column(unique = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @Basic
    private String LOCATION1CODE;

    @Basic
    private String LOCATION2CODE;

    @Basic
    private Long DAYFROM;

    @Basic
    private Long DAYTO;

    @Basic
    private Long QUANTITY;

    @Basic
    private String TYPE;

    @Basic
    private Long COST;

    public ToursFrance() {
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getLOCATION1CODE() {
        return LOCATION1CODE;
    }

    public void setLOCATION1CODE(String LOCATION1CODE) {
        this.LOCATION1CODE = LOCATION1CODE;
    }

    public String getLOCATION2CODE() {
        return LOCATION2CODE;
    }

    public void setLOCATION2CODE(String LOCATION2CODE) {
        this.LOCATION2CODE = LOCATION2CODE;
    }

    public Long getDAYFROM() {
        return DAYFROM;
    }

    public void setDAYFROM(Long DAYFROM) {
        this.DAYFROM = DAYFROM;
    }

    public Long getDAYTO() {
        return DAYTO;
    }

    public void setDAYTO(Long DAYTO) {
        this.DAYTO = DAYTO;
    }

    public Long getQUANTITY() {
        return QUANTITY;
    }

    public void setQUANTITY(Long QUANTITY) {
        this.QUANTITY = QUANTITY;
    }

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    public Long getCOST() {
        return COST;
    }

    public void setCOST(Long COST) {
        this.COST = COST;
    }
}

