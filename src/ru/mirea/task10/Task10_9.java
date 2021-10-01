package ru.mirea.task10;

//Без двух нулей
public class Task10_9 {
    public static void main(String[] args) {
        System.out.println(rec(2, 2));
    }

    static int rec(int a,int b){
        if (a-1>b){
            return 0;
        }
        if (a==0 || b==0){
            return 1;
        }
        return rec(a,b-1)+rec(a-1,b-1);
    }
}
