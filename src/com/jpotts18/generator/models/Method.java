package com.jpotts18.generator.models;

import java.util.List;

/**
 * Created by jpotts18 on 9/19/14.
 */
public class Method {

    private String access;
    private String returnType;
    private String dataType;
    private String type;
    private String name;
    private List<Arguments> arguments;

    public Method(String access, String returnType, String name) {
        this.access = access;
        this.returnType = returnType;
        this.name = name;
    }

    public Method(String access, String returnType, String name, List<Arguments> argumentList) {
        this.access = access;
        this.returnType = returnType;
        this.name = name;
        this.arguments = argumentList;
    }


    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
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

    public List<Arguments> getArguments() {
        return arguments;
    }

    public void setArguments(List<Arguments> argumentList) {
        this.arguments = argumentList;
    }
}
