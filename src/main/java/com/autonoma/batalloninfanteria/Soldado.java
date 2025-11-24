/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.autonoma.batalloninfanteria;

/**
 *
 * @author hijo
 */
enum RangoSoldado{
    RECLUTA,
    SOLDADO,
    CABO,
    SARGENTO,
    TENIENTE
}

public class Soldado {
    private static int edadMinimaServicio = 18;
    private String nombre;
    private int edad;
    private String estadoSalud;
    private RangoSoldado rango;

    public Soldado(String nombre, int edad, String estadoSalud, RangoSoldado rango) {
        this.nombre = nombre;
        this.edad = edad;
        this.estadoSalud = estadoSalud;
        this.rango = rango;
    }

    public static int getEdadMinimaServicio() {
        return edadMinimaServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public boolean setEdad(int edad) {
        if (edad >= edadMinimaServicio){
            this.edad = edad;
            return true;
        }else{
            return false;
        }
    }

    public String getEstadoSalud() {
        return estadoSalud;
    }

    public void setEstadoSalud(String estadoSalud) {
        this.estadoSalud = estadoSalud;
    }

    public RangoSoldado getRango() {
        return rango;
    }

    public void setRango(RangoSoldado rango) {
        this.rango = rango;
    }
    
    public void entrenar(){
        
    }
    
    public void asignarRango(RangoSoldado nuevoRango){
        this.rango = nuevoRango;
    }
    
    public void marcarComoHerido(){
        this.estadoSalud = "HERIDO";
    }
    
    public boolean esAptoParaMision(){
        if(this.edad >= edadMinimaServicio && this.estadoSalud.equals("APTO")){
            return true;
        }else{
            return false;
        }
    }

    public String descripcion() {
        return "Soldado: " + nombre 
                + "\nEdad: " + edad 
                + "\nEstado de salud: " + estadoSalud 
                + "\nRango: " + rango;
    }
    
    public static boolean cambiarEdadMinimaServicio(int edadMinimaServicio) {
        if(edadMinimaServicio>=0){
            Soldado.edadMinimaServicio = edadMinimaServicio;
            return true;
        }else{
            return false;
        }
    }    
}
