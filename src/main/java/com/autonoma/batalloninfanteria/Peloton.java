/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.autonoma.batalloninfanteria;

import java.util.ArrayList;

/**
 *
 * @author hijo
 */
enum TipoPeloton{
    ASALTO,
    ENTRENAMIENTO,
    APOYO
}

public class Peloton {
    private String nombre;
    private String comandante;
    private TipoPeloton tipo;
    private ArrayList<Escuadra> escuadras;
    private static int maxEscuadras;

    public Peloton(String nombre, String comandante, TipoPeloton tipo) {
        this.nombre = nombre;
        this.comandante = comandante;
        this.tipo = tipo;
        this.escuadras = new ArrayList<Escuadra>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComandante() {
        return comandante;
    }

    public void setComandante(String comandante) {
        this.comandante = comandante;
    }

    public TipoPeloton getTipo() {
        return tipo;
    }

    public void setTipo(TipoPeloton tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Escuadra> getEscuadras() {
        return escuadras;
    }

    public void setEscuadras(ArrayList<Escuadra> escuadras) {
        this.escuadras = escuadras;
    }

    public static int getMaxEscuadras() {
        return maxEscuadras;
    }

    public static boolean cambiarMaxEscuadras(int nuevoMax) {
        if(nuevoMax>=0){
            Peloton.maxEscuadras = nuevoMax;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean esPelotonCompleto(){
        return this.escuadras.size()>=Peloton.maxEscuadras;
    }
    
}
