/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*Código basado en el concepto de "Bad Smells" en código.
 *Fuente: "Bad Smells" en código, M.C. Juan Carlos Olivares Rojas, Febrero 2011.
 *https://www.slideserve.com/byron-mayo/bad-smells-en-c-digo
 */
package com.mycompany.malosolores.extra;

/**
 *
 * @author User
 */


// 1. Dispensables: Duplicate Code

//Problema:
public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }

    public int sumarTresNumeros(int a, int b, int c) {
        return a + b + c;
    }
}

//Solución:
public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }

    public int sumarTresNumeros(int a, int b, int c) {
        return sumar(a, b) + c;
    }
}

