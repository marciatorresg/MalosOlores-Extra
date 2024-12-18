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

// 2. Bloaters: Long Parameter List

//Problema:

    public void crearUsuario(String nombre, String apellido, String email, int edad, String direccion, String telefono) {
    // Código para crear usuario.
    }
    

//Solución:
public class Usuario {
    private String nombre;
    private String apellido;
    private String email;
    private int edad;
    private String direccion;
    private String telefono;

    // Constructor, getters y setters.
}

public void crearUsuario(Usuario usuario) {
    // Código para crear usuario.
}
