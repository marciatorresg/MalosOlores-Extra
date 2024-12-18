package com.mycompany.malosolores.extra;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gino Leonardo
 */
public class Book_2 {
    private String title;
    private String author;

    public Book_2(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public void updateDetails(String newTitle, String newAuthor) {
        this.title = newTitle;
        this.author = newAuthor;
    }
}
