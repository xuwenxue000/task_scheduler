package com.william.xu.taskscheduler.domain.vo;

import java.util.List;
import java.util.Map;

/**
 * 任务根信息
 * Created by william on 2017/2/27.
 */
public class TaskRootVo {


    private List<TaskStepVo> steps;

    private Map<String,TaskParamVo> params;


    public List<TaskStepVo> getSteps() {
        return steps;
    }

    public void setSteps(List<TaskStepVo> steps) {
        this.steps = steps;
    }

    public Map<String, TaskParamVo> getParams() {
        return params;
    }

    public void setParams(Map<String, TaskParamVo> params) {
        this.params = params;
    }
}
