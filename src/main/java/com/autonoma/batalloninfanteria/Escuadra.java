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
enum TipoEscuadra{
    INFANTERIA,
    RECONOCIMIENTO,
    APOYO
}

public class Escuadra {
    private static int maxSoldadosPorEscuadra = 0;
    private String nombre;
    private int numero;
    private TipoEscuadra tipo;
    private ArrayList<Soldado> soldados;

    public Escuadra(String nombre, int numero, TipoEscuadra tipo, ArrayList<Soldado> soldados) {
        this.nombre = nombre;
        this.numero = numero;
        this.tipo = tipo;
        this.soldados = soldados;
    }

    public static int getMaxSoldadosPorEscuadra() {
        return maxSoldadosPorEscuadra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public TipoEscuadra getTipo() {
        return tipo;
    }

    public void setTipo(TipoEscuadra tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Soldado> getSoldados() {
        return soldados;
    }

    public void setSoldados(ArrayList<Soldado> soldados) {
        this.soldados = soldados;
    }
    
    public boolean agregarSoldado(Soldado s){
        if(this.tieneCapacidadDisponible()){
            this.soldados.add(s);
            return true;   
        }else{
            return false;
        }
    }
    
    public boolean removerSoldadoPorNombre(String nombre){
        for(Soldado soldado: this.soldados){
            if(soldado.getNombre().equals(nombre)){
                this.soldados.remove(soldado);
                return true;
            }
        }
        return false;
    }
    
    public int contarSoldados(){
        return this.soldados.size();
    }
    
    public boolean tieneCapacidadDisponible(){
        return this.contarSoldados()<Escuadra.maxSoldadosPorEscuadra;
    }
    
    public ArrayList<Soldado> obtenerSoldadosAptos(){
        ArrayList<Soldado> soldadosAptos = new ArrayList<>();
        for(Soldado soldado:this.soldados){
            if(soldado.getEstadoSalud().equals("APTO")){
                soldadosAptos.add(soldado);
            }
        }
        return soldadosAptos;
    }
       
    public static boolean setMaxSoldadosPorEscuadra(int maxSoldadosPorEscuadra) {
        if(maxSoldadosPorEscuadra >= 0){
            Escuadra.maxSoldadosPorEscuadra = maxSoldadosPorEscuadra;
            return true;
        }else{
            return false;
        }
    }
}


