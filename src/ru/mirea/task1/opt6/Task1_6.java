package ru.mirea.task1.opt6;


import java.util.Arrays;
import java.util.Random;

public class Task1_6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int len = (int)(Math.random()*20) + 5;
        int[] arr = new int[len];
        for (int i = 0; i< len; i++) arr[i] = rand.nextInt(50);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
