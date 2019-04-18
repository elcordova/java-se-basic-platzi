package com.elcordova.amazonviewer.model;

import java.util.Date;

public class Book extends Publication implements IVisualizable{
    private int id;
    private String isbn;
    private boolean readed;
    private int timeReaded;


    public Book(String title, Date editionDate, String editorial, String[] authors, int id) {
        super(title, editionDate, editorial, authors);
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isReaded() {
        return readed;
    }

    public void setReaded(boolean readed) {
        this.readed = readed;
    }

    public int getTimeReaded() {
        return timeReaded;
    }

    public void setTimeReaded(int timeReaded) {
        this.timeReaded = timeReaded;
    }

    @Override
    public String toString() {
        String bookDetail = "\n:: BOOK ::" +
                " \n Title: " + getTitle() +
                "\n Editorial: " + getEditorial() +
                "\n Edition Date: " + getEditionDate() +
                "\n Authors: ";
        for (String author:this.getAuthors()){
            bookDetail += "\t"+author;
        }
        return bookDetail;
    }

    @Override
    public Date startToSee(Date dateI) {
        return dateI;
    }

    @Override
    public void stopToSee(Date dateI, Date dateF) {
        long initTime = dateI.getTime();
        long endTime = dateF.getTime();
        if (initTime<endTime){
            setTimeReaded((int)(endTime - initTime ));
        }else {
            setTimeReaded(0);
        }
    }
}
