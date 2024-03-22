package Algorithmen;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] list = {0,9,5,3,10,0,8,2,7, 4,1,6};

        for (int i = 0; i < list.length; i++){
            int ellementToSort = list[i];
            while(i > 0 && ellementToSort < list[i - 1]){
                list[i] = list[i - 1];
                i--;
            }
            list[i] = ellementToSort;
        }
        System.out.println("Sortiert: " + Arrays.toString(list));
    }
}


