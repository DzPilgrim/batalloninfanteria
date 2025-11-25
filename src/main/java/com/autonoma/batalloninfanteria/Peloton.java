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
    
    
}
