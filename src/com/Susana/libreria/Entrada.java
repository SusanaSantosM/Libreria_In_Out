package com.Susana.libreria;
import javax.swing.*;
import java.util.Scanner;

public class Entrada {
    /** Tipos de entrada de datos
     * @param CONSOLA
     * @param VENTANA
     */
    private final static Float CONSOLA = 0f;
    private final static Float VENTANA = 0f;

    /** Método para ingresar datos por consola
     * @param msg
     * @return Float
     */

    public static Float CONSOLA(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        return scanner.nextFloat();
    }

    /** Método para ingresar datos por ventana
     * @param msg
     * @return Float
     */
    public static Float VENTANA(String msg) {
        return Float.parseFloat(JOptionPane.showInputDialog(msg));
    }

}
