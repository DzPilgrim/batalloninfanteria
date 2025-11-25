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
enum TipoBatallon{
    LIGERO,
    MECANIZADO,
    AEROTRANSPORTADO
}

public class Batallon {
    private String nombre;
    private String ubicacion;
    private TipoBatallon tipo;
    private ArrayList<Peloton> pelotones;
    private static String codigoOTAN ="";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public TipoBatallon getTipo() {
        return tipo;
    }

    public void setTipo(TipoBatallon tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Peloton> getPelotones() {
        return pelotones;
    }

    public void setPelotones(ArrayList<Peloton> pelotones) {
        this.pelotones = pelotones;
    }

    public static String getCodigoOTAN() {
        return codigoOTAN;
    }

    public static void cambiarCodigoOTAN(String nuevoCodigo) {
        Batallon.codigoOTAN = nuevoCodigo;
    }
    
    public int contarPelotones(){
        return this.pelotones.size();
    }
    
    public int contarTotalSoldados(){
        int total_soldados = 0;
        for(Peloton p: this.pelotones){
            total_soldados += p.contarSoldados();
        }
        return total_soldados;
    }
    
    
}
