package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Operaciones objeto = new Operaciones();
        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        int n = Integer.parseInt(JOptionPane.showInputDialog("Seleccione 1)Suma 2)Resta 3)Multiplicacion 4)Division"));
        switch(n){
            case 1:
                int result = objeto.suma(a,b);
                System.out.println(a + " + " + b + " = " + result);
                break;
            case 2:
                int result1 = objeto.resta(a,b);
                System.out.println(a + " - " + b + " = " + result1);
                break;
            case 3:
                int result2 = objeto.multiplicacion(a,b);
                System.out.println(a + " * " + b + " = " + result2);
                break;
            case 4:
                if(b!=0){
                    float result3 = objeto.division(a,b);
                    System.out.println(a + " / " + b + " = " + result3);
                }
                else{
                    System.out.println("La division por 0 no es posible");
                }
                break;
            default:
                System.out.println("Esa opcion no se encuentra");
        }
    }
}