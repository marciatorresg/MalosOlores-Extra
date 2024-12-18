/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.malosolores.extra;

import java.time.LocalDate;
import java.time.temporal.Temporal;

/**
 *
 * @author Gino Leonardo
 */
public class Loan {
     private Book book;
    private boolean isLoaned;
    private LocalDate dueDate;

    public Loan(Book book) {
        this.book = book;
        this.isLoaned = false;
    }

    public boolean isLoaned() { return isLoaned; }
    public LocalDate getDueDate() { return dueDate; }

    public void loanBook() {
        this.isLoaned = true;
        this.dueDate = LocalDate.now().plusWeeks(2);
    }

    public void returnBook() {
        this.isLoaned = false;
    }

}
