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
public class FineCalculator {
    public double calculateFine(Loan loan) {
        if (loan.isLoaned() && LocalDate.now().isAfter(loan.getDueDate())) {
            long daysOverdue = ChronoUnit.DAYS.between(loan.getDueDate(), LocalDate.now());
            return daysOverdue * 0.5; // Fine is $0.5 per day
        }
        return 0;
    }
}
