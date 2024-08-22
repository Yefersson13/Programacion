
package javaapplication4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *Haz un programa para hallar el area total de un cilindro
 * @author Yefersson
 */
public class tarea3sem2 {
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        DecimalFormat formato=new DecimalFormat("# #. # #");
        double areabase,arcurva,areatotal;
        int radio,altura;
        System.out.println("Ingrese el radio del cilindro");
        radio=leer.nextInt();
        System.out.println("Ingrese la altura del cilindro");
        altura=leer.nextInt();
        areabase=(double) (Math.PI*Math.pow(radio, 2))*2;
        arcurva=2*Math.PI*radio*altura;
        areatotal=areabase+arcurva;
        System.out.println("El area de la base del cilindro es: "+formato.format(areabase));
        System.out.println("El area de la curva del cilindro es: "+formato.format(arcurva));
        System.out.println("El area total del cilindro es de: "+formato.format(areatotal));
    }
}
