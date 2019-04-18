package com.elcordova.amazonviewer.model;

import java.util.ArrayList;

public class Chapter extends Movie{

    private int id;
    private int sessionNumber;

    public Chapter(String title, String genre, String creator, int duration, short year) {
        super(title, genre, creator, duration, year);
        this.sessionNumber = sessionNumber;
    }


    public int getSessionNumber() {
        return sessionNumber;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "\n:: CHAPTER ::" +
                " \n Title: " + getTitle() +
                "\n Year: " + getYear() +
                "\n Creator: " + getCreator() +
                "\n Duration: " + getDuration();
    }

    public static ArrayList<Chapter> makeChapterList() {
        ArrayList<Chapter> chapters = new ArrayList<>();
        for (int i = 1; i<=5; i++){
            chapters.add(new Chapter("Capitulo "+i, "Genero "+i, "Creator"+i, 45, (short)(2017+i)));
        }
        return chapters;
    }
}
