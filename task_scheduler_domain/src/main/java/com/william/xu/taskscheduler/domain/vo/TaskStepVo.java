package com.william.xu.taskscheduler.domain.vo;

import java.util.Map;

/**
 * Created by william on 2017/2/28.
 */
public class TaskStepVo {

    private Map<String,TaskParamVo> params;


    public Map<String, TaskParamVo> getParams() {
        return params;
    }

    public void setParams(Map<String, TaskParamVo> params) {
        this.params = params;
    }

}
