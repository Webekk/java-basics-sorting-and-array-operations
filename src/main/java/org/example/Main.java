package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5,3,8,6,2};
// BUBBLE SORT
        for (int i = 0; i< numbers.length-1;i++){ // cause the largest value is gonna land at the end,
            // we can do one less iteration, that's why we add numbers.length - 1
            for (int j = 0; j<numbers.length-1-i;j++)
            { // After every outer loop iteration the biggest element
                //is at the end so we can just skip the sorted element with substracting i
                System.out.println(Arrays.toString(numbers));
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j+1] = temp;
                }
            }
        }
        System.out.println("----------------------------------------");
        System.out.println(Arrays.toString(numbers));

        System.out.println("Sorted array");

        for(int num : numbers){
            System.out.print(num + "");
        }
        System.out.println();
        int[] test = {43,2,45,89,34};
        int max = test[0];
        for (int i = 1; i < test.length; i++){
            if (test[i] > max){
                max = test[i];
            }
        }
        System.out.println("The largest element of array is: " + max);

        int sum = 0;

        for (int iteration: test) {
            sum+=iteration;
        }

        System.out.println("Sum of an array: " + sum );
    }
}