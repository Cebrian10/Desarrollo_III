package com.mycompany.projects.Proy4;

import java.util.List;

import javax.swing.JOptionPane;

public class Metodos {    

    void menuOpciones(String opc, List<Character> elem) {
        switch (opc) {
            case "Cargar": Cargar(elem);           
                break;
            case "Mostrar": Mostrar(elem);       
                break;
            case "Insertar": Insertar(elem);           
                break;
            case "Reemplazar": Reemplazar(elem);             
                break;
            case "Mover": Mover(elem);                
                break;
        }       
    }

    void Cargar(List<Character> elem){        
        JOptionPane.showMessageDialog(null,"Porfavor ingrese de 1 a 20 caracteres diferentes\nPresione ( ; ) para finalizar", "Cargar",JOptionPane.INFORMATION_MESSAGE);
        for(int i=1 ; i<=20 ; i++){
            try {
                String caracter = JOptionPane.showInputDialog(null, "Caracter numero: " + i, "Cargando...",JOptionPane.PLAIN_MESSAGE);
                if (caracter.equals(";") || i == 20) {
                    JOptionPane.showMessageDialog(null, "Arreglo Cargado", "Carga completa", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
                elem.add(caracter.charAt(0));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                i--;
            }
        }
        Mostrar(elem);
    }

    void Mostrar(List<Character> elem){
       if (!elem.isEmpty()) {
            String cad = elem.toString().replace(",", "").replace("[", "").replace("]", "");
            JOptionPane.showMessageDialog(null, cad, "Mostrar", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar el arreglo primero", "Arreglo Vacio", 2);
        }
    }

    void Insertar(List<Character> elem){
        if (!elem.isEmpty()) {
            if (elem.size() <= 20) {
                elem.add('*');
                JOptionPane.showMessageDialog(null, "Se ha insertado un * en la lista.", "Insertar", JOptionPane.INFORMATION_MESSAGE);
                Mostrar(elem);
            } else {
                JOptionPane.showMessageDialog(null, "No se puede insertar nada, la lista está llena.", "Insertar", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar el arreglo primero", "Arreglo Vacio", 2);
        }
    }

    void Reemplazar(List<Character> elem) {
        if (!elem.isEmpty()) {
            if (elem.contains('a')) {
                String reemplazo = JOptionPane.showInputDialog(null, "Ingresa el caracter por el cual quieras reemplazar la letra 'a'");
                elem.replaceAll(c -> c == 'a' ? reemplazo.charAt(0) : c);
                JOptionPane.showMessageDialog(null, "La letra 'a' ha sido reemplazada por '" + reemplazo.charAt(0) + "'", "Reemplazar", JOptionPane.INFORMATION_MESSAGE);
                Mostrar(elem);
            } else {
                JOptionPane.showMessageDialog(null, "No existe la letra 'a' en la lista", "Reemplazar", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar el arreglo primero", "Arreglo Vacio", 2);
        }        
    }
    
    void Mover(List<Character> elem){
        if (!elem.isEmpty()) {
            char ultimo = elem.get(elem.size() - 1);
            for (int i = elem.size() - 2; i >= 0; i--) {
                elem.set(i + 1, elem.get(i));
            }
            elem.set(0, ultimo);
            Mostrar(elem);
            JOptionPane.showMessageDialog(null, "El arreglo se movió una posición a la derecha", "Mover", JOptionPane.INFORMATION_MESSAGE);            
        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar el arreglo primero", "Arreglo Vacio", 2);
        }
    }
}