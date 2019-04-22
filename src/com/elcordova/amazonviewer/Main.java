package com.elcordova.amazonviewer;

import com.elcordova.amazonviewer.model.Chapter;
import com.elcordova.amazonviewer.model.Movie;
import com.elcordova.amazonviewer.model.Option;
import com.elcordova.amazonviewer.model.Serie;
import com.elcordova.makereport.Report;
import jdk.javadoc.doclet.Reporter;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        showMenu();
        byte a =1;
        byte b =1;
        byte k = (byte) (a+b);
        Movie m[] = new Movie[20];
    }

    public static void showMenu() {
        int exit = 0;
        Option[] options = {
                new Option(1, "Movies"),
                new Option(2, "Series"),
                new Option(3, "Books"),
                new Option(4, "Magazines"),
                new Option(5, "Report"),
                new Option(6, "Report Today"),
                new Option(0, "Exit")};

        do {
            System.out.println("BIENVENIDOS A AMAZON VIEWER \n");
            System.out.println("Seleccione el numero de la opcion deseada");
            for (Option opt : options) {
                System.out.println(opt.getId() + ".- " + opt.getLabel());
            }

            Scanner scanner = new Scanner(System.in);
            int response = Integer.valueOf(scanner.nextLine());
            switch (response) {
                case 0:
                    break;
                case 1:
                    showMovies();
                    break;
                case 2:
                    showSeries();
                    break;
                case 3:
                    showBooks();
                    break;
                case 4:
                    showMagazines();
                    break;
                case 5:
                    makeReport();
                    break;
                case 6:
                    makeReport(new Date());
                    break;
                default:
                    System.out.println();
                    System.out.println("...seleccione una Opcion!!!");
                    System.out.println();
                    break;
            }
        } while (exit != 0);

    }

    public static ArrayList<Movie> movies;

    public static void showMovies() {
        movies = Movie.makeMoviesList();
        int exit = 1;
        do {
            System.out.println();
            System.out.println(":: MOVIES ::");
            System.out.println();
            for (int i = 0; i < movies.size(); i++) {
                System.out.println(i + 1 + ".- " + movies.get(i).getTitle() + " Visto: " + movies.get(i).isViewed());
            }
            System.out.println("0.- back to menu\n");
            // read user input
            Scanner sc = new Scanner(System.in);
            int response = Integer.valueOf(sc.nextLine());

            if (response == 0) {
                showMenu();
            }
            if (response>0){

                Movie movieSelected = movies.get(response - 1);
                movieSelected.setViewed(true);
                Date startToSee = movieSelected.startToSee(new Date());
                for (int i = 0; i < 100000; i++) {
                    System.out.println("..................");

                }
                //end movie see
                movieSelected.stopToSee(startToSee, new Date());
                System.out.println("viste la pelicula " + movieSelected.getTitle() + " por: " + (movieSelected.getTimeViewed() / 1000) + " segundos");

            }
            //select movie index


        } while (exit != 0);
    }

    public static void showSeries() {
        int exit = 1;
        ArrayList<Serie> series = Serie.makeSeriesList();
        do {
            System.out.println();
            System.out.println(":: SERIES ::");
            for (int i = 0; i < series.size(); i++) {
                System.out.println("" + (i + 1) + ".- " + series.get(i).getTitle() + " Visto: " + series.get(i).isViewed());
            }
            System.out.println("0.- back to menu\n");
            // read user input
            Scanner sc = new Scanner(System.in);
            int response = Integer.valueOf(sc.nextLine());

            if (response == 0) {
                showMenu();
            }

            if (response>0) {
                //select chapter index
                showChapters(series.get(response).getChapters());
            }

        } while (exit != 0);
    }

    public static void showChapters(ArrayList<Chapter> chapters) {
        System.out.println();
        System.out.println(":: CHAPTERS ::");
        System.out.println();
        for (int i = 0; i < chapters.size(); i++) {
            System.out.println((i + 1) + ".- " + chapters.get(i).getTitle() + " Visto: " + chapters.get(i).isViewed());
        }
        System.out.println("0.- back to Series menu\n");
        // read user input
        Scanner sc = new Scanner(System.in);
        int response = Integer.valueOf(sc.nextLine());

        if (response == 0) {
            showSeries();
        }
        //select movie index

        if (response>0){
            Movie chapterSelected = chapters.get(response - 1);
            chapterSelected.setViewed(true);
            Date startToSee = chapterSelected.startToSee(new Date());
            for (int i = 0; i < 100000; i++) {
                System.out.println(".................");

            }
            //end movie see
            chapterSelected.stopToSee(startToSee, new Date());
            System.out.println("viste el capitulo " + chapterSelected.getTitle() + " por: " + (chapterSelected.getTimeViewed() / 1000) + " segundos");
        }

    }

    public static void showBooks() {
        int exit = 0;
        do {
            System.out.println();
            System.out.println(":: BOOKS ::");
            System.out.println();
        } while (exit != 0);
    }

    public static void showMagazines() {
        int exit = 0;
        do {
            System.out.println();
            System.out.println(":: MAGAZINES ::");
            System.out.println();

        } while (exit != 0);
    }

    public static void makeReport() {
        Report report = new Report();
        report.setNameFile("reporte");
        report.setExtension("txt");
        String contentReport = "";
        for (Movie movie : movies) {
            if (movie.getIsViewd()) {
                contentReport += movie.toString();
            }
        }
        report.setContent(contentReport);
        report.makeReport();
    }

    public static void makeReport(Date date) {

    }


}
