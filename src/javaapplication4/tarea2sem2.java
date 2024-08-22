package javaapplication4;


import java.text.DecimalFormat;
import java.util.Scanner;
//* Haz un programa en donde al ingresar el radio halle el area de un circulo

public class tarea2sem2 {
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        DecimalFormat formato=new DecimalFormat("##.##");
        double radio,area;
        System.out.println("Ingresa la radio del circulo");
        radio=leer.nextDouble();
        area=Math.PI*Math.pow(radio, 2);
        System.out.println("El area del circulo es: "+formato.format(area));
        
    }
    
}
