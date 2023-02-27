package com.mycompany.projects.Proy4;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Proy4 {
    public void Inicio(){ 
        List<Character> elem = new ArrayList<Character>();
        String opc = null;       
        String []opciones = {"Cargar", 
                             "Mostrar",
                             "Insertar", 
                             "Reemplazar", 
                             "Mover"};
        try {            
            do{
                opc = (String) JOptionPane.showInputDialog(null, "Selecciona una opción", "Proyecto 4",JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);                
                new Metodos().menuOpciones(opc, elem);
            }  while(opc != null);          
        } catch (Exception e) {
            
        }
    }    
}