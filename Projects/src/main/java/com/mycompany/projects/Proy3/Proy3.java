package com.mycompany.projects.Proy3;

import javax.swing.JOptionPane;

public class Proy3 {
    public void Inicio() {
        Object[] opciones = { "Número Capicúa",
                              "Número al revés",
                              "Número romano",
                              "Cumpleaños"};                              
        try {
            String opc = (String) JOptionPane.showInputDialog(null, "Selecciona una opción", "Proyecto 3",JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            new Metodos().menuOpciones(opc);
        } catch (Exception e) {
            // System.out.print("Se cerro");
        }
    }
}