package com.example.usuario.tallerlistview;

import java.util.ArrayList;

/**
 * Created by android on 09/04/2018.
 */

public class Operaciones {
private int numero;
private String nombre;
private String datos;
private double resultado;

    public Operaciones(int numero, String nombre, String datos, double resultado) {
        this.numero = numero;
        this.nombre = nombre;
        this.datos = datos;
        this.resultado = resultado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
