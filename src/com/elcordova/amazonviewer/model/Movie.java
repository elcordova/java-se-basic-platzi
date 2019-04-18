package com.elcordova.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

public class Movie extends Film implements IVisualizable{

    private int id;

    public Movie(String title, String genre, String creator, int duration, short year) {
        super(title, genre, creator, duration);
        this.setYear(year);
    }


    public void showData() {
//        System.out.println("Title: "+ title);
//        System.out.println("Genre: "+ genre);
//        System.out.println("Year: "+ year);
    }


    @Override
    public String toString() {
        return "\n:: MOVIE ::" +
                "\n Title: " + getTitle() +
                "\n Genre: " + getGenre() +
                "\n Year: " + getYear() +
                "\n Creator: " + getCreator() +
                "\n Duration: " + getDuration();
    }

    public int getId() {
        return id;
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
            setTimeViewed((int)(endTime - initTime ));
        }else {
            setTimeViewed(0);
        }
    }

    public static ArrayList<Movie> makeMoviesList(){
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Movie1", "genre 1", "elcordova", 120, (short)2019));
        for (int i = 0; i < 6; i++) {
            movies.add(new Movie("Movie "+i, "genero "+i, "elcordova", 120+i, (short)(2015+i)));
        }
        return movies;
    }
}
