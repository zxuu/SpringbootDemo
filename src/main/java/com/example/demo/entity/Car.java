package com.example.demo.entity;

public class Car {
    private String entity_name; //车牌号
    private String entity_desc; //车型
    private String entity_userName; //驾驶员姓名
    private String entity_userPhone;    //驾驶员手机号

    public Car(String entity_name, String entity_desc, String entity_userName, String entity_userPhone) {
        this.entity_name = entity_name;
        this.entity_desc = entity_desc;
        this.entity_userName = entity_userName;
        this.entity_userPhone = entity_userPhone;
    }

    public String getEntity_name() {
        return entity_name;
    }

    public void setEntity_name(String entity_name) {
        this.entity_name = entity_name;
    }

    public String getEntity_desc() {
        return entity_desc;
    }

    public void setEntity_desc(String entity_desc) {
        this.entity_desc = entity_desc;
    }

    public String getEntity_userName() {
        return entity_userName;
    }

    public void setEntity_userName(String entity_userName) {
        this.entity_userName = entity_userName;
    }

    public String getEntity_userPhone() {
        return entity_userPhone;
    }

    public void setEntity_userPhone(String entity_userPhone) {
        this.entity_userPhone = entity_userPhone;
    }
}
