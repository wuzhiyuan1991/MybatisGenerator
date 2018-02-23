package com.ueb.po;

import java.util.Date;

public class BfConfig {
    private Integer id;

    private Byte type;

    private String branch_name;

    private String disconf_url;

    private String disconf_name;

    private String remarks;

    private Integer creator;

    private Date created_time;

    private Date update_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getBranch_name() {
        return branch_name;
    }

    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name == null ? null : branch_name.trim();
    }

    public String getDisconf_url() {
        return disconf_url;
    }

    public void setDisconf_url(String disconf_url) {
        this.disconf_url = disconf_url == null ? null : disconf_url.trim();
    }

    public String getDisconf_name() {
        return disconf_name;
    }

    public void setDisconf_name(String disconf_name) {
        this.disconf_name = disconf_name == null ? null : disconf_name.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Date getCreated_time() {
        return created_time;
    }

    public void setCreated_time(Date created_time) {
        this.created_time = created_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }
}