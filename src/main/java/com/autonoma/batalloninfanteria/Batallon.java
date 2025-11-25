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
}
