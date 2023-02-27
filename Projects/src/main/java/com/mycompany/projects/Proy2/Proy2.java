package com.mycompany.projects.Proy2;

import javax.swing.JOptionPane;

public class Proy2 {
    public void Inicio() {
        Metodos met = new Metodos();
        Object menu[] = { "Instrucciones", "Jugar", "Salir" };
        int jugar = JOptionPane.showConfirmDialog(null, "Bienvenido! Presiona yes para jugar", "Adivina el Número",JOptionPane.YES_NO_OPTION);
        if (jugar == 0) {
            int opcion = 0;
            while (opcion != 2 && opcion != -1) {
                opcion = JOptionPane.showOptionDialog(null, "Menu\nSelecciona una opcion", "Adivina el Número",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);
                if (opcion == 0) {
                    met.Instrucciones();
                } else if (opcion == 1) {
                    String nom = JOptionPane.showInputDialog(null, "Porfavor Introduce tu nombre:", "Nombre",JOptionPane.INFORMATION_MESSAGE);
                    met.Juego(nom);
                }
            }
        }
    }
}