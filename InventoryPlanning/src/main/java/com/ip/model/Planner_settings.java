package com.ip.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by titam on 01/11/16.
 */
@Entity
public class Planner_settings implements Serializable {

    @Column(unique = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @Basic
    private String SETTINGS;

    @Basic
    private String SETTING_VALUE;

    public Planner_settings() {
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getSETTINGS() {
        return SETTINGS;
    }

    public void setSETTINGS(String SETTINGS) {
        this.SETTINGS = SETTINGS;
    }

    public String getSETTING_VALUE() {
        return SETTING_VALUE;
    }

    public void setSETTING_VALUE(String SETTING_VALUE) {
        this.SETTING_VALUE = SETTING_VALUE;
    }
}
