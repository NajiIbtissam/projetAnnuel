package com.ip.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by titam on 01/11/16.
 */
@Entity
public class WasMoving implements Serializable {

    @Column(unique = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;


    @Basic
    private String LOCATIONCODE;

    @Basic
    private String ITEMCODE;

    @Basic
    private Long DAY;

    @Basic
    private Long QUANTITY;

    @Basic
    private String TYPE;

    public WasMoving() {
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getLOCATIONCODE() {
        return LOCATIONCODE;
    }

    public void setLOCATIONCODE(String LOCATIONCODE) {
        this.LOCATIONCODE = LOCATIONCODE;
    }

    public String getITEMCODE() {
        return ITEMCODE;
    }

    public void setITEMCODE(String ITEMCODE) {
        this.ITEMCODE = ITEMCODE;
    }

    public Long getDAY() {
        return DAY;
    }

    public void setDAY(Long DAY) {
        this.DAY = DAY;
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
}
