package com.mycompany.projects.Proy5;

import javax.swing.JOptionPane;

public class Metodos {
    void menuOpciones(String opc, char flores[][]) {
        switch (opc) {
            case "Cargar Matriz":  cargarMatriz(flores);
                break;
            case "Investigar Matriz": investigarMatriz(flores);
                break;
            case "Mostrar Matriz": mostrarMatriz(flores);
                break;
        }
    }

    void blanquear(char flores[][]){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++){
                flores[i][j] = ' ';
            }            
        }
    }

    void cargarMatriz(char flores[][]){
        blanquear(flores);
        for(int i=0 ; i<6 ; i++){
            String flor = JOptionPane.showInputDialog(null, "Ingrese nombres de flores de hasta 6 letras\n\nFlor #" + (i+1) , "Flores", 3);
            if(flor.matches("[a-zA-Z]+") && flor.length() <= 6){
                for(int j=0 ; j<6 ; j++){
                    flores[i][j] = (j < flor.length()) ? flor.charAt(j) : ' ';
                }            
            }
            else{
                JOptionPane.showMessageDialog(null,"Error... El nombre debe contener solo letras alfabéticas y tener longitud menor o igual a 6", "Error", 0);
                i--;
            }
        }
        JOptionPane.showMessageDialog(null, "Vector cargado", "Flores", JOptionPane.INFORMATION_MESSAGE);
    }

    void investigarMatriz(char flores[][]){
        int cantidad[] = consonantesMatriz(flores);
        String cad = "";
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
              cad += String.valueOf(flores[i][j]);
            }
            cad += "   \t" + cantidad[i] + "\n";
          }
          JOptionPane.showMessageDialog(null,"-----------------------\nFlores  Cantidad\n-----------------------\n" + cad);
    }

    int[] consonantesMatriz(char flores[][]){
        int cantidad[] = new int[6];
        char vocales[] = {'a', 'e', 'i', 'o', 'u'};
    
        for (int i = 0; i < 6; i++) {
            int cont = 0;
            for (int j = 0; j < 6; j++) {
                char letra = Character.toLowerCase(flores[i][j]);
                if(letra >= 'a' && letra <= 'z'){
                    boolean esVocal = false;
                    for(int x=0 ; x<vocales.length ; x++){
                        if(letra == vocales[x]){
                            esVocal = true;
                            break;
                        }
                    }
                    if(!esVocal){
                        cont++;
                    }
                }
            }
            cantidad[i] = cont;             
        }
        return cantidad;
    }    

    void mostrarMatriz(char flores[][]){
        String cad = "Listado de Flores\n";
        for(int i=0 ; i<6 ; i++){
            cad += "->";
            for(int j=0 ; j<6 ; j++){
                cad += " ' " + flores[i][j] + " ' ";
            }  
            cad += "\n";          
        }
        JOptionPane.showMessageDialog(null, cad, "Flores", 1);
    }
}