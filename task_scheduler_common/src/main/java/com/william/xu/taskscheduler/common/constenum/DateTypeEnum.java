package com.william.xu.taskscheduler.common.constenum;

/**
 * 参数类型
 * Created by william on 2017/2/27.
 */
public enum DateTypeEnum {

    NUMBER("","必须为数字"),

    OTHER("","");

    DateTypeEnum(String defaultReg, String defaultRegMsg) {
        this.defaultReg = defaultReg;
        this.defaultRegMsg = defaultRegMsg;
    }

    private String defaultReg;

    private String defaultRegMsg;


    public String getDefaultReg() {
        return defaultReg;
    }

    public String getDefaultRegMsg() {
        return defaultRegMsg;
    }
}
