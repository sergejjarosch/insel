package Algorithmen;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] list = {0,9,5,3,10,0,8,2,7, 4,1,6};

        for (int i = 0; i < list.length; i++){
            int minPos = i;
            int minimum = list[minPos];
            for (int j = i + 1; j < list.length; j++){
                if (minimum > list[j]){
                    minPos = j;
                    minimum = list[minPos];
                }
            }
            if (minPos != i){
                list[minPos] = list[i];
                list[i] = minimum;
            }
        }
        System.out.println("Sortiert: " + Arrays.toString(list));
    }
}
