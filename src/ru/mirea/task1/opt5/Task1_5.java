package ru.mirea.task1.opt5;

public class Task1_5 {
    public static void main(String[] args) {
        System.out.println("Первые 10 элементов гармонического ряда");
        for (int i = 1; i<=10; i++){
            System.out.print(i + " элемент: ");
            System.out.println("1/" + i + " = " + 1/(float)i);
        }
    }
}
