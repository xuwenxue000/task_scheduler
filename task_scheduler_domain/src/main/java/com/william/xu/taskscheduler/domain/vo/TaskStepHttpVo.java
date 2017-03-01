package com.william.xu.taskscheduler.domain.vo;

import java.util.Map;

/**
 * http任务
 *
 * Created by william on 2017/2/28.
 */
public class TaskStepHttpVo extends TaskStepVo{

    /**
     * http元数据
     */
    TaskDataSourceHttpMeta meta;
    /**
     * 路径
     */
    private String path;


    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}
