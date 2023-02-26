package com.mycompany.projects.Proy1;

import javax.swing.JOptionPane;

public class Proy1 {
    public void Inicio() {
        Object[] opciones = { "Calcule el perímetro de un círculo",
                "Obtenga el residuo de dos números",
                "Calcule el promedio de 3 números",
                "Calcule al cuadrado y al cubo",
                "Es par o impar",
                "Fórmula y = a+b/2" };
        try {
            String opc = (String) JOptionPane.showInputDialog(null, "Selecciona una opción", "Proyecto 1",JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            new Metodos().menuOpciones(opc);
        } catch (Exception e) {
            
        }

    }
}