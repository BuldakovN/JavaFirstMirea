package ru.mirea.task10;
//Сумма цифр числа.
public class Task10_5 {
    public static void main(String[] args) {
        System.out.println(sum(152));
    }

    static int sum(int digit){
        if (digit>0) {
            return digit % 10 + sum(digit / 10);
        }
        else{return 0;}
    }
}
