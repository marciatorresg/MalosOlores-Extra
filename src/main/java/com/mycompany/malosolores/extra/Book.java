/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.malosolores.extra;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Gino Leonardo
 */
public class Book {
    private String title;
    private String author;
    private boolean isLoaned;
    private LocalDate dueDate;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isLoaned = false;
    }
     public void loanBook() {
        this.isLoaned = true;
        this.dueDate = LocalDate.now().plusWeeks(2);
    }

    public void returnBook() {
        this.isLoaned = false; }

    public double calculateFine() {
        if (isLoaned && LocalDate.now().isAfter(dueDate)) {
            long daysOverdue = ChronoUnit.DAYS.between(dueDate, LocalDate.now());
            return daysOverdue * 0.5; // Fine is $0.5 per day
        }
        return 0;
    }
    public void updateDetails(String newTitle, String newAuthor) {
        this.title = newTitle;
        this.author = newAuthor;
    }
}
    
}
