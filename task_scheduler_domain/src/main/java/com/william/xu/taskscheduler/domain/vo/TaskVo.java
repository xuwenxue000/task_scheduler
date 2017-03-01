package com.william.xu.taskscheduler.domain.vo;

/**
 * 任务
 * Created by william on 2017/2/27.
 */
public class TaskVo {

    private TaskRootVo root;

    private String name;


    public TaskRootVo getRoot() {
        return root;
    }

    public void setRoot(TaskRootVo root) {
        this.root = root;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
