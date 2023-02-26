package com.mycompany.projects.Proy1;

import javax.swing.JOptionPane;

public class Metodos {
    void menuOpciones(String opc) {
        switch (opc) {
            case "Calcule el perímetro de un círculo": perimetroCirculo();
                break;
            case "Obtenga el residuo de dos números": residuoNumeros();
                break;
            case "Calcule el promedio de 3 números": promedioNumeros();
                break;
            case "Calcule al cuadrado y al cubo": cuboCuadrado();
                break;
            case "Es par o impar": parImpar();
                break;
            case "Fórmula y = a+b/2": formula();
                break;
        }
    }

    void perimetroCirculo() {
        try {
            double radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el radio de su circulo","Perimetro de un circulo", JOptionPane.QUESTION_MESSAGE));
            if (radio > 0) {
                double perimetro = 2 * Math.PI * radio;
                perimetro = Double.parseDouble(String.format("%.2f", perimetro));
                JOptionPane.showMessageDialog(null, "El perimetro de su circulo es " + perimetro,"Perimetro de un circulo", JOptionPane.INFORMATION_MESSAGE);
            } else
                JOptionPane.showMessageDialog(null, "Debe ingresar un número válido", "PRECAUCIÓN...",JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número", "ERROR...", JOptionPane.ERROR_MESSAGE);
        }
    }

    void residuoNumeros() {
        try {
            double num = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el numerador","Residuo de números", JOptionPane.QUESTION_MESSAGE));
            double deno = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el denominador","Residuo de números", JOptionPane.QUESTION_MESSAGE));
            String mensaje = (num > 0 && deno > 0) ? "El residuo de " + num + "/" + deno + " es " + num % deno: "Debe ingresar un número válido";
            JOptionPane.showMessageDialog(null, mensaje, "Residuo de números", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número", "ERROR...", JOptionPane.ERROR_MESSAGE);
        }
    }

    void promedioNumeros() {
        try {
            double n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer número", "Calcular Promedio", JOptionPane.QUESTION_MESSAGE));
            double n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo número", "Calcular Promedio", JOptionPane.QUESTION_MESSAGE));
            double n3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el tercer número", "Calcular Promedio", JOptionPane.QUESTION_MESSAGE));
            if (n1 > 0 && n2 > 0 && n3 > 0){
                double promedio = Double.parseDouble(String.format("%.2f", ((n1 + n2 + n3)/3)));
                JOptionPane.showMessageDialog(null, "El promedio de los numeros es: " + promedio , "Calcular Promedio", JOptionPane.INFORMATION_MESSAGE);
            } 
            else{
                JOptionPane.showMessageDialog(null, "Debe ingresar un número válido", "PRECAUCIÓN...", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número", "ERROR...", JOptionPane.ERROR_MESSAGE);
        }
    }

    void cuboCuadrado() {
        try {
            double num = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un número", "Cuadrado y Cubo",JOptionPane.QUESTION_MESSAGE));
            double cuadrado = Math.pow(num, 2);
            double cubo = Math.pow(num, 3);
            String mensaje = (cuadrado > 0 && cubo > 0) ? "Numero " + num + "\nCuadrado " + cuadrado + "\nCubo " + cubo: "Debe ingresar un número válido";
            JOptionPane.showMessageDialog(null, mensaje, "Cuadrado y Cubo", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número", "ERROR...", JOptionPane.ERROR_MESSAGE);
        }
    }

    void parImpar() {
        try {
            double num = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un número", "Par o Impar",JOptionPane.QUESTION_MESSAGE));
            String esPar = (num % 2 == 0) ? "El número " + num + " es par" : "El número " + num + " es impar";
            JOptionPane.showMessageDialog(null, esPar, "Par o Impar", JOptionPane.INFORMATION_MESSAGE);            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número", "ERROR...", JOptionPane.ERROR_MESSAGE);
        }
    }

    void formula() {
        try {
            double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Siendo la formula y = a+b/2\nIngrese a: ", "Fórmula" ,JOptionPane.QUESTION_MESSAGE));
            double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Siendo la formula y = a+b/2\nIngrese b: ", "Fórmula" ,JOptionPane.QUESTION_MESSAGE));
            double y = (a+b)/2;
            JOptionPane.showMessageDialog(null, "y = " +  a + " + " + b + " / 2\ny = " + y, "Fórmula", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número", "ERROR...", JOptionPane.ERROR_MESSAGE);
        }
    }
}