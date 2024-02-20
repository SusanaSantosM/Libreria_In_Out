package com.Susana.libreria;

import javax.swing.*;

public class Salida {
    /** Tipos de salida de datos
     * @param CONSOLA
     * @param VENTANA
     */
    private final static Float CONSOLA=0f;
    private final static Float VENTANA=0f;

    /**
     * Método de salida de datos por CONSOLA
     * @param dato
     */
    public static void CONSOLA(Float dato){
        System.out.println(dato.floatValue());
    }

    /**
     * Método de salida de datos por ventana
     * @param dato
     */
    public static void VENTANA(Float dato){
        JOptionPane.showMessageDialog(null, dato);
    }

}
