package com.example.demo.entity;
//响应参数实体
public class ResponsePram {

    private  String responseCode;
    private  String desc;

    public ResponsePram() {
        super();
    }

    public ResponsePram(String responseCode, String desc) {
        this.responseCode = responseCode;
        this.desc = desc;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "ResponsePram{" +
                "responseCode='" + responseCode + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
