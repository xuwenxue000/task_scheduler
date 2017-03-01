package com.william.xu.taskscheduler.domain.vo;

/**
 * 任务数据源HTTP元信息
 * Created by william on 2017/2/27.
 */
public class TaskDataSourceHttpMeta {



    /**
     * 协议
     */
    private String schema;
    /**
     * 域名或ip
     */
    private String host;
    /**
     * 端口
     */
    private String port;

    /**
     * 提交的方式
     */
    private HttpMethod method;

    public enum HttpMethod{
        GET,POST;
    }

    public HttpMethod getMethod() {
        return method;
    }

    public void setMethod(HttpMethod method) {
        this.method = method;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
