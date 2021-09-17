package ru.mirea.task1.opt3;

import java.util.Arrays;

public class Task1_3 {
    public static void main(String args[]) {
        int[] a = {1,2,3,4,5,6};
        int length = a.length;
        int i=0;
        int s=0;
        while(i<length){
            s+=a[i];
            i++;
        }
        System.out.println(s);
        s=0;
        i--;
        do{
            s+=a[i];
            i--;
        }while(i>=0);
        System.out.println(s);
        System.out.print(Arrays.toString(a));
    }
}
