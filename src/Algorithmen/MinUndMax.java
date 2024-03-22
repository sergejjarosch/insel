package Algorithmen;

import java.util.Arrays;

public class MinUndMax {
    public static void main(String[] args) {
        int[] list = {9,5,3,10,0,8,2,7,4,1,6};
        int min = list[0];
        // i ist auf 1 gesetzt, weil wir bereits es in min überprüfen.
        // es wäre redundant es nochmal in der for schleife =0; zu prüfen.
        for (int i =1; i < list.length; i++){
            if (list[i] < min){
                min = list[i];
            }
        }
        System.out.println("Die kleinste Zahl ist: " + min + " Länge Array: " + list.length);

    }
}
