package com.example.bdd;

import android.graphics.Canvas;
import android.view.SurfaceHolder;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class User {
    private int id;
    private List<Group> groups;
    User(int id){
        this.id = id;/*
        Repository r = new Repository();
        groups = r.getGroups(this.id);
        */
    }
    /*
    public void addToGroup(int id){
        if (groups.get(id) == null)
            groups.put(id, new Group(id));
    }
    public void deleteFromGroup(int id){
        groups.remove(id);
    }
    public Group getGroup(int id){
        return groups.get(id);
    }

     */
}