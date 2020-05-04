package com.example.bdd;

import java.sql.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

class Group {
    private int id;
    private List<Integer> desks;
    Group(int id){
        this.id = id;
    }
    public int getId(){return this.id;}
    public List<Integer> getDesks(){return desks;}
    public void setDesks(byte[] desks){
        //for (int i : desks) this.desks.add(i);
    }
    /*
    public void addDesk(){
        int id = 0;
        while (this.desks.get(id) != null) id++;
        this.desks.put(id, new Desk(id));
    }
    public void deleteDesk(int id){
        this.desks.remove(id);
    }
    public void paintDesk(int id){
        this.desks.get(id).paint();
    }

     */
}
