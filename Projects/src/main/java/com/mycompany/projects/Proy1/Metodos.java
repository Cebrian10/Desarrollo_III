package com.mycompany.projects.Proy1;

import javax.swing.JOptionPane;

public class Metodos {
    void menuOpciones(String opc){
        switch (opc) {
            case "Calcule el perímetro de un círculo":
                perimetroCirculo();
                break;                
            case "Obtenga el residuo de dos números":
                residuoNumeros();
                break;
            case "Calcule el promedio de 3 números":
                promedioNumeros();
                break;
            case "Calcule al cuadrado y al cubo":
                cuboCuadrado();
                break;
            case "Es par o impar":
                parImpar();
                break;
            case "Fórmula y = a+b/2":
                formula();
                break;
            default:
                break;
        }
    }

    void perimetroCirculo(){
        try {
            double radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el radio de su circulo"));
            if(radio > 0){
                double perimetro = 2 * Math.PI * radio;
                perimetro = Double.parseDouble(String.format("%.2f", perimetro));
                JOptionPane.showMessageDialog(null, "El perimetro de su circulo es "+ perimetro, "Perimetro de un circulo",  JOptionPane.INFORMATION_MESSAGE);
            }
            else
                JOptionPane.showMessageDialog(null, "Debe ingresar un número válido", "PRECAUCIÓN...",  JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número", "ERROR...",  JOptionPane.ERROR_MESSAGE);
        }        
    }

    void residuoNumeros(){
        
    }

    void promedioNumeros(){

    }

    void cuboCuadrado(){

    }

    void parImpar(){

    }

    void formula(){

    }
    
}
