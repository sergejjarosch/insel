package Algorithmen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber;

        System.out.println("Wie viele Zahlen soll ich erstellen? :");
        int arrayLenght = new java.util.Scanner(System.in).nextInt();

        //int[] numbers = {1,6,7,9,3,56,7,0,4,3,89};
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < arrayLenght; i++ ){
            randomNumber = random.nextInt(1,100);
            numbers.add(randomNumber);
        }
        System.out.println(numbers);

        // bubblesort - - - - -
        for(int i =0; i < numbers.size(); i++){
            for(int j = 0; j < numbers.size() -1; j++){
                if (numbers.get(j) > numbers.get(j + 1)){
                    int temp = numbers.get(j); // bei ArrayList müssen auch bei angaben des Indexes
                    numbers.set(j, numbers.get(j +1)); //die .get und .set Methoden verwendet (1. ist was es war, 2. ist was es wird)
                    numbers.set(j + 1, temp); // temp ist ein integer, daher einfach angeben
                }
            }
        }
        System.out.println(numbers);
    }
}
