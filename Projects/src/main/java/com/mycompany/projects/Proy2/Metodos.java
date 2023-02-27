package com.mycompany.projects.Proy2;

import javax.swing.JOptionPane;

public class Metodos {

    void Instrucciones() {
        JOptionPane.showMessageDialog(null, "Debes adivinar un número del 1 al 5,000\ntendrás las siguientes opciones:\n - 5 Oportunidades\n - 10 Oportunidades\n - Oportunidades infinitas", "Instrucciones",JOptionPane.INFORMATION_MESSAGE);
    }

    int Cantidad(int oportunidades) {
        return (oportunidades == 0) ? 5 : (oportunidades == 1) ? 10 : (int) Math.pow(1000, 1000);
    }

    String Titulo(int oportunidades) {
        return (oportunidades == 0) ? "5 Oportunidades": (oportunidades == 1) ? "10 Oportunidades" : "Oportunidades infinitas";
    }

    String Intentos(int num, int numGanador) {
        return (num < numGanador) ? "Número muy bajo" : (num > numGanador) ? "Número muy alto" : "GANADOR";
    }

    void Juego(String nom) {
        int numGanador = (int) ((Math.random() * 5000) + 1);
        Object oport[] = { "5", "10", "Infinitas" };
        int oportunidades = JOptionPane.showOptionDialog(null, "Selecciona la cantidad de oportunidades","Adivina el Número", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, oport,oport[0]);
        for (int i = 0; i < Cantidad(oportunidades); i++) {
            try {
                int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Intento numero " + (i + 1) + ": ",Titulo(oportunidades), JOptionPane.PLAIN_MESSAGE));
                if (!Intentos(num, numGanador).equals("GANADOR")) {
                    JOptionPane.showMessageDialog(null, Intentos(num, numGanador), "Intenta denuevo",JOptionPane.WARNING_MESSAGE);
                    System.out.print(numGanador);
                }
                else {
                    JOptionPane.showMessageDialog(null, "FELICIDADES " + nom, "GANADOR",JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
                if (i == Cantidad(oportunidades) - 1) {
                    JOptionPane.showMessageDialog(null, "Lo siento bro", "PERDISTE", JOptionPane.WARNING_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Porfavor ingrese un numero valido", "Error...",JOptionPane.ERROR_MESSAGE);
                i--;
            }
        }
    }
}