package com.ip.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by titam on 30/10/16.
 */
@Entity
public class HealthyStock implements Serializable {

    @Column(unique = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @Basic
    private String LOCATIONCODE;

    @Basic
    private String ITEMCODE;

    @Basic
    private Long STOCK;

    public HealthyStock() {
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

    public Long getSTOCK() {
        return STOCK;
    }

    public void setSTOCK(Long STOCK) {
        this.STOCK = STOCK;
    }
}
