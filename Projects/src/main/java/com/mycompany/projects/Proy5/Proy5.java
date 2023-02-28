package com.mycompany.projects.Proy5;

import javax.swing.JOptionPane;

public class Proy5 {
    public void Inicio(){
        char flores[][] = new char[6][6];
        String opc = null;
        String[] opciones = { "Cargar Matriz","Investigar Matriz","Mostrar Matriz" };
        try {
            do {
                opc = (String) JOptionPane.showInputDialog(null, "Selecciona una opción", "Proyecto 5",JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
                new Metodos().menuOpciones(opc, flores);
            } while (opc != null);            
        } catch (Exception e) {
            //System.out.print("Se cerro");
        }
    }    
}