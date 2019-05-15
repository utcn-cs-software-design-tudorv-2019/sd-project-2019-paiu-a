package com.myexample.project.Model;

public class Book {

    private String title, author, information;
    private int year;

    public Book() {
    }

    public Book(String title, String author, String information, int year) {
        this.title = title;
        this.author = author;
        this.information = information;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
