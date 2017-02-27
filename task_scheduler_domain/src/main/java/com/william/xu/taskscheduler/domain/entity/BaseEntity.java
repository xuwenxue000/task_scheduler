package com.william.xu.taskscheduler.domain.entity;

import java.util.Date;

/**
 * 基础实体类
 * Created by william on 2017/2/27.
 */
public abstract class BaseEntity {
    /**
     * 自增id
     */
    private Long id;
    /**
     *创建时间
     */
    private Date createdTime;

    /**
     * 修改时间
     */
    private Date modifiedTime;



    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }



}
