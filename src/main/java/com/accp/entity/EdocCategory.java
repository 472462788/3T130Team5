package com.accp.entity;

import java.util.HashSet;
import java.util.Set;

public class EdocCategory {
    private int id;
    private String name;
    private Set<EdocCategory> edocCategories=new HashSet<EdocCategory>();

    public Set<EdocCategory> getEdocCategories() {
        return edocCategories;
    }

    public void setEdocCategories(Set<EdocCategory> edocCategories) {
        this.edocCategories = edocCategories;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
