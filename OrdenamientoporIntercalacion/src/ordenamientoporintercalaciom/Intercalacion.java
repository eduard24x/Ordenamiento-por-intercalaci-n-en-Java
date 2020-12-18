/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamientoporintercalaciom;

/**
 *
 * @author Eduardo
 */
public class Intercalacion {

    public void intercalacion(int[] arregloA, int[] arregloB) {
        int i, j, k;
        int arregloC[] = new int[arregloA.length + arregloB.length];
        //Repetir mientas los arreglos A y B tengan elementos que comparar
        for (i = j = k = 0; i < arregloA.length && j < arregloB.length; k++) {
            if (arregloA[i] < arregloB[j]) {
                arregloC[k] = arregloA[i];
                i++;
            } else {
                arregloC[k] = arregloB[j];
                j++;
            }
        }
        //Para añadir los elementos del arregloA sobrantes en caso de haberlo
        for (; i < arregloA.length; i++, k++) {
            arregloC[k] = arregloA[i];
        }
        //Para añadir los elementos del arregloC sobrantes en caso de haberlo
        for (; j < arregloB.length; j++, k++) {
            arregloC[k] = arregloB[j];
        }
        mostrarArreglo(arregloC);
    }

    public void mostrarArreglo(int[] arreglo) {
        int k;
        for (k = 0; k < arreglo.length; k++) {
            System.out.println("[" + arreglo[k] + "]");
        }
        System.out.println();
    }

    public void ordenarBurbuja(int[] array) {//Método que recibe como parámetro a un arreglo
        int aux;//Variable de tipo entero
        boolean cambios = false;//Variable de tipo booleana

        while (true) {//Ciclo infinito
            cambios = false;
            for (int i = 1; i < array.length; i++) {//Ciclo for para recorrer el arreglo
                if (array[i] < array[i - 1]) {
                    aux = array[i];//Guarda en aux el valor que está en la posición i
                    array[i] = array[i - 1];//Cambio de la posición con la que se está comparando
                    array[i - 1] = aux;//Almacenar aux en la posición (i-1)
                    cambios = true;
                }
            }
            if (cambios == false) {//Si no se realizó ningun cambio(nuestro arreglo ya está ordenado)
                break;
            }
        }
    }
}
