package com.elcordova.amazonviewer.model;

import java.util.Date;

public class Publication {
    private String title;
    private Date editionDate;
    private String editorial;
    private String[] authors;

    public Publication(String title, Date editionDate, String editorial, String[] authors) {
        this.title = title;
        this.editionDate = editionDate;
        this.editorial = editorial;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public Date getEditionDate() {
        return editionDate;
    }

    public String getEditorial() {
        return editorial;
    }

    public String[] getAuthors() {
        return authors;
    }
}
