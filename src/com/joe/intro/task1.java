package com.joe.intro;

public class task1 {

    public static int[] mylist = {12, 54, 93, 10, 70, 65, 84};

    public static void main(String[] args) {
        int max = maxNumber(mylist);
        System.out.println("the max number is " + max);

        double avg = findAverage(mylist);
        System.out.println("the average is " + avg);

        int[] anotherArray = copyToAnotherArray(mylist);
        for (int i = 0; i < anotherArray.length; i++) {
            System.out.println(anotherArray[i]);
        }

    }

    public static int maxNumber(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static double findAverage(int[] arr){
        int total=0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total / arr.length;
    }

    public static int[] copyToAnotherArray(int[] arr){
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        return newArray;
    }
}
