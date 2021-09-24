package ru.mirea.task1.opt7;

import java.util.Scanner;

public class Task1_7 {
    public static void main(String[] args) {
        int n, fac;
        fac = 1;
        Scanner scann = new Scanner(System.in);
        n = scann.nextInt();
        for (int i=1; i<=n; i++){
            fac*=i;
        }
        System.out.println("Факториал числа " + n + " равен " + fac);
    }
}
