package ru.mirea.task18;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        String FIO, INN;
        System.out.println("Введите ФИО и ИНН");
        Scanner scan = new Scanner(System.in);
        FIO = scan.nextLine();
        INN = scan.next();
        try {
            Integer.parseInt(INN);
        }catch (NumberFormatException e){
            System.out.println("Ошибка, неверный формат ИНН: " + e.getMessage());
        }
    }
}
