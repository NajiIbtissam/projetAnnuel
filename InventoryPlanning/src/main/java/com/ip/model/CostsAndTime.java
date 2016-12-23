package com.ip.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by titam on 31/10/16.
 */
@Entity
public class CostsAndTime implements Serializable{
    private static final long serialVersionUID = 1L;

    @Column(unique = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    @Basic
    private String LOCATIONCODE;
    @Basic
    private String ITEMCODE;
    @Basic
    private Float NMITCOST;
    @Basic
    private Float REPAIRCOST;
    @Basic
    private String REPAIRTIME;
    @Basic
    private Long HSTORAGECOST;
    @Basic
    private Long FSTORAGECOST;
    @Basic
    private Long MEAN;
    @Basic
    private Long STANDARDDEV;
    @Basic
    private String FACTOR;

    public CostsAndTime() {

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

    public Float getNMITCOST() {
        return NMITCOST;
    }

    public void setNMITCOST(Float NMITCOST) {
        this.NMITCOST = NMITCOST;
    }

    public Float getREPAIRCOST() {
        return REPAIRCOST;
    }

    public void setREPAIRCOST(Float REPAIRCOST) {
        this.REPAIRCOST = REPAIRCOST;
    }

    public String getREPAIRTIME() {
        return REPAIRTIME;
    }

    public void setREPAIRTIME(String REPAIRTIME) {
        this.REPAIRTIME = REPAIRTIME;
    }

    public Long getHSTORAGECOST() {
        return HSTORAGECOST;
    }

    public void setHSTORAGECOST(Long HSTORAGECOST) {
        this.HSTORAGECOST = HSTORAGECOST;
    }

    public Long getFSTORAGECOST() {
        return FSTORAGECOST;
    }

    public void setFSTORAGECOST(Long FSTORAGECOST) {
        this.FSTORAGECOST = FSTORAGECOST;
    }

    public Long getMEAN() {
        return MEAN;
    }

    public void setMEAN(Long MEAN) {
        this.MEAN = MEAN;
    }

    public Long getSTANDARDDEV() {
        return STANDARDDEV;
    }

    public void setSTANDARDDEV(Long STANDARDDEV) {
        this.STANDARDDEV = STANDARDDEV;
    }

    public String getFACTOR() {
        return FACTOR;
    }

    public void setFACTOR(String FACTOR) {
        this.FACTOR = FACTOR;
    }
}
