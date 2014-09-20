package com.jpotts18.generator.models;


public class Property {

    private String access;
    private String dataType;
    private String type;
    private String name;

    public Property(String access, String dataType, String name){
        this.access = access;
        this.dataType = dataType;
        this.name = name;
    }

    public Property(String access, String dataType, String type, String name) {
        this.access = access;
        this.dataType = dataType;
        this.type = type;
        this.name = name;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
