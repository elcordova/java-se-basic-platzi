package com.elcordova.amazonviewer.model;

public class Option {
    private int id;
    private String label;

    public int getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public Option(int id, String label){
        this.id = id;
        this.label = label;
    }
}
