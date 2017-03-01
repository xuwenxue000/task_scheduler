package com.william.xu.taskscheduler.domain.vo;

import com.william.xu.taskscheduler.common.constenum.DateTypeEnum;

/**
 * 任务参数
 * Created by william on 2017/2/27.
 */
public class TaskParamVo {
    /**
     * 参数名称
     */
    private String name;
    /**
     * 值
     */
    private String value;

    /**
     * 数据类型
     */
    private DateTypeEnum type;
    /**
     * 正则
     */
    private String reg;
    /**
     * 正则提示语
     */
    private String regMsg;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public DateTypeEnum getType() {
        return type;
    }

    public void setType(DateTypeEnum type) {
        this.type = type;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getRegMsg() {
        return regMsg;
    }

    public void setRegMsg(String regMsg) {
        this.regMsg = regMsg;
    }
}
