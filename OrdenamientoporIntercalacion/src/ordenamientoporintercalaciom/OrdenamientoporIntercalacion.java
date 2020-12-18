package ordenamientoporintercalaciom;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class OrdenamientoporIntercalacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner introducido = new Scanner(System.in);

        System.out.println("\n METODO DE ORDENAMIENTO INTERCALACION  \n");
        Intercalacion inter = new Intercalacion();//Instanciación de la clase intercalacion

        int elementos;//Variable de tipo entero
        System.out.println("\nIntroduzca el número de elementos del primer arreglo:");
        elementos = introducido.nextInt();

        int vector1[] = new int[elementos];// Crea el arreglo y Asigna el tamaño al arreglo
        for (int i = 0; i < elementos; i++) {//Recorre al arreglo
            System.out.println("Introduzca el elemento que estará en la posición " + (i + 1) + ":");
            vector1[i] = introducido.nextInt();
        }

        int elementos2;//Variable de tipo entero
        System.out.println("\nIntroduzca el número de elementos del segundo arreglo:");
        elementos2 = introducido.nextInt();

        int vector2[] = new int[elementos2];// Crea el arreglo y Asigna el tamaño al arreglo
        for (int i = 0; i < elementos2; i++) {//Recorre al arreglo
            System.out.println("Introduzca el elemento que estará en la posición " + (i + 1) + ":");
            vector2[i] = introducido.nextInt();
        }

        System.out.println("\n ORDENAMIENTO POR EL MÉTODO DE INTERCALACIÓN \n");

        System.out.println("\nElementos primer arreglo: \n");
        inter.mostrarArreglo(vector1);
        System.out.println("Elementos del segundo arreglo: \n");
        inter.mostrarArreglo(vector2);
        inter.ordenarBurbuja(vector1);
        inter.ordenarBurbuja(vector2);
        System.out.println("Arreglos ordenados por el método de intercalación: \n");
        inter.intercalacion(vector1, vector2);

    }

}
