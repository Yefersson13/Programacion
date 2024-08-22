
package javaapplication4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *Haz un programa que saque el area de un campo de futbol cuadrado
 * que al ingresar nummero del area, saque la longitud total de las vallas que
 * rodean el campo.
 * Yefersson
 */
public class tareasem2 {
    public static void main(String[] args) {
        int area;
        int result;
        Scanner leer=new Scanner (System.in);
        DecimalFormat formato=new DecimalFormat("# #. # #");
        System.out.println("Escribir el area del campo de futbol");
        area=(int) leer.nextInt();
        result=(int) (Math.sqrt(area)*4);
        System.out.println("La longitud total de las vallas del cambo es de: "+formato.format(result));
        
        
    }
}
