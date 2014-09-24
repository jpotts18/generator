package com.jpotts18.generator.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jpotts18 on 9/19/14.
 */
public class AmazingModel {

    private List<Property> properties;
    private List<Method> methods;

    private String name;
    private String access;

    public AmazingModel(String access, String name, List<Property> properties, List<Method> methods) {
        this.access = access;
        this.name = name;
        this.properties = properties;
        this.methods = methods;
    }
    public AmazingModel(String access, String name, List<Property> properties) {
        this.access = access;
        this.name = name;
        this.properties = properties;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public List<Method> getMethods() {
        return methods;
    }

    public List<Method> getPrivateMethods(){
        List<Method> l = new ArrayList<Method>();
        for (Method m: methods)
        {
            if (m.getAccess().equals(Access.PRIVATE))
            {
                l.add(m);
            }
        }
        return l;
    }

    public List<Method> getPublicMethods(){
        List<Method> l = new ArrayList<Method>();
        for (Method m: methods)
        {
            if (m.getAccess().equals(Access.PUBLIC))
            {
                l.add(m);
            }
        }
        return l;
    }

    public void setMethods(List<Method> methods) {
        this.methods = methods;
    }
}
