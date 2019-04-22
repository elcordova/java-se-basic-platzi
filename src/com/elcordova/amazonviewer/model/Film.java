package com.elcordova.amazonviewer.model;

public class Film {

    private String title;
    private String genre;
    private String creator;
    private int duration;
    private short year;
    private boolean viewed;
    private int timeViewed;

    public Film(String title, String genre, String creator, int duration) {
        this.title = title;
        this.genre = genre;
        this.creator = creator;
        this.duration = duration;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public float getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    public String isViewed() {
        if (viewed){
            return "Sí";
        }
        return "No";
    }

    public boolean getIsViewd(){
        return viewed;
    }

    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }
}
