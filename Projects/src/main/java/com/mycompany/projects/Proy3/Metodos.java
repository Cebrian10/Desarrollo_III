package com.mycompany.projects.Proy3;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;

import javax.swing.JOptionPane;

public class Metodos {
    void menuOpciones(String opc) {
        switch (opc) {
            case "Número Capicúa":
                Capicua();
                break;
            case "Número al revés":
                alReves();
                break;
            case "Número romano":
                Romano();
                break;
            case "Cumpleaños":
                Cumple();
                break;
        }
    }

    void Capicua() {
        try {
            int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe un número 3 digitos","Número Capicúa", JOptionPane.PLAIN_MESSAGE));
            if (num >= 100 && num <= 999) {
                String numStr = Integer.toString(num);
                String reversedStr = new StringBuilder(numStr).reverse().toString();
                int reversedNum = Integer.parseInt(reversedStr);
                verificarCapicua(num, reversedNum);
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número de 3 dígitos", "PRECAUCIÓN...",
                        JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número", "ERROR...", JOptionPane.ERROR_MESSAGE);
        }
    }

    void verificarCapicua(int num, int reversedNum) {
        if (num == reversedNum) {
            JOptionPane.showMessageDialog(null, "El número " + num + " es capicúa", "Número Capicúa",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "El número " + num + " no es capicúa", "Número Capicúa",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    void alReves() {
        try {
            int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe un número 3 digitos","Número al revés", JOptionPane.PLAIN_MESSAGE));
            if (num >= 100 && num <= 999) {
                String numStr = Integer.toString(num);
                String reversedStr = new StringBuilder(numStr).reverse().toString();
                int reversedNum = Integer.parseInt(reversedStr);
                JOptionPane.showMessageDialog(null, "Número Original : " + num + "\nNúmero al revés : " + reversedNum, "Número al revés", JOptionPane.PLAIN_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número de 3 dígitos", "PRECAUCIÓN...",
                        JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número", "ERROR...", JOptionPane.ERROR_MESSAGE);
        }
    }

    void Romano() {
        try {
            int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe un número del 1 al 100","Número romano", JOptionPane.PLAIN_MESSAGE));
            if (num >= 1 && num <= 100) {
                cambiarRomano(num);
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número de 3 dígitos", "PRECAUCIÓN...",JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número", "ERROR...", JOptionPane.ERROR_MESSAGE);
        }
    }

    void cambiarRomano(int num){
        String[] unidades = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] decenas = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] centenas = {"", "C"};

        String numeroRomano = "";

        int centena = num / 100;
        int decena = (num % 100) / 10;
        int unidad = (num % 10);

        numeroRomano += centenas[centena];
        numeroRomano += decenas[decena];
        numeroRomano += unidades[unidad];

        JOptionPane.showMessageDialog(null,  "Número Original : " + num + "\nNúmero Romano : " + numeroRomano, "Número romano", JOptionPane.PLAIN_MESSAGE);
    }

    void Cumple() {
        try {
            String fechaString = JOptionPane.showInputDialog(null,"Ingrese su fecha de cumpleaños en formato (dd/mm): ", "Cumpleaños", JOptionPane.PLAIN_MESSAGE);
            if (validarFecha(fechaString)) {
                String[] fecha = fechaString.split("/");
                int dia = Integer.parseInt(fecha[0]);
                int mes = Integer.parseInt(fecha[1]);

                LocalDate fechaCumple = LocalDate.of(LocalDate.now().getYear(), mes, dia);
                LocalDate fechaHoy = LocalDate.now();

                ChronoLocalDate fcumple = fechaCumple;
                ChronoLocalDate fhoy = fechaHoy;

                long diasCumple = ChronoUnit.DAYS.between(fechaHoy, fechaCumple);

                if(fcumple.isEqual(fhoy)){
                    JOptionPane.showMessageDialog(null, "Felicidades, tu cumpleaños es hoy", "Cumpleaños",JOptionPane.INFORMATION_MESSAGE);
                }
                else if(fcumple.isBefore(fhoy)){
                    JOptionPane.showMessageDialog(null, "Tu cumple fue hace " + (diasCumple * -1) + " dias" , "Cumpleaños",JOptionPane.INFORMATION_MESSAGE);
                }
                else if(fcumple.isAfter(fhoy)){
                    JOptionPane.showMessageDialog(null, "Faltan " + diasCumple + " dias para tu cumple", "Cumpleaños",JOptionPane.INFORMATION_MESSAGE);
                }                
            } 
            else{
                JOptionPane.showMessageDialog(null, "Debe ingresar una fecha correcta", "PRECAUCIÓN...",JOptionPane.WARNING_MESSAGE);
            }            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número", "ERROR...", JOptionPane.ERROR_MESSAGE);
        }
    }

    boolean validarFecha(String fechaString){   
        String[] fecha = fechaString.split("/");

        boolean dia = (Integer.parseInt(fecha[0]) > 0) && (Integer.parseInt(fecha[0]) < 32);
        boolean mes = (Integer.parseInt(fecha[1]) > 0) && (Integer.parseInt(fecha[1]) < 13);

        return dia && mes;
    }    
}