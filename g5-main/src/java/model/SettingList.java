/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author dangd
 */
public class SettingList {

    int id;
    String stype;
    String svalue;
    String sorder;
    String sclass;
    String sstatus;

    public SettingList() {
    }

    public SettingList(int id, String stype, String svalue, String sorder, String sclass, String sstatus) {
        this.id = id;
        this.stype = stype;
        this.svalue = svalue;
        this.sorder = sorder;
        this.sclass = sclass;
        this.sstatus = sstatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStype() {
        return stype;
    }

    public void setStype(String stype) {
        this.stype = stype;
    }

    public String getSvalue() {
        return svalue;
    }

    public void setSvalue(String svalue) {
        this.svalue = svalue;
    }

    public String getSorder() {
        return sorder;
    }

    public void setSorder(String sorder) {
        this.sorder = sorder;
    }

    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
    }

    public String getSstatus() {
        return sstatus;
    }

    public void setSstatus(String sstatus) {
        this.sstatus = sstatus;
    }

    @Override
    public String toString() {
        return "SettingList{" + "id=" + id + ", stype=" + stype + ", svalue=" + svalue + ", sorder=" + sorder + ", sclass=" + sclass + ", sstatus=" + sstatus + '}';
    }

    

}
