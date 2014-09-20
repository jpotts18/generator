package com.jpotts18.generator.models;

/**
 * Created by jpotts18 on 9/19/14.
 */
public class Arguments {

    String type;
    String name;

    public Arguments(String type, String name) {
        this.type = type;
        this.name = name;
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
