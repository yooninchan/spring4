package com.apress.isf.java.model;

/**
 * Created by yun-inchan on 2014. 10. 24..
 */
public class Document {

    private String name;
    private Type type;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
