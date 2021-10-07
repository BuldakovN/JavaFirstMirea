package ru.mirea.task12;
//Сортировка вставками

import java.util.Arrays;

public class Task12_1 {
    public static void main(String[] args) {
        Student[] IDNumber = new Student[10];
        for (int i = 0; i < 10; i++) {
            IDNumber[i] = new Student();
        }
        System.out.println(Arrays.toString(IDNumber));
        for (int left = 0; left < IDNumber.length; left++) {
            Student value = IDNumber[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value.ID < IDNumber[i].ID) {
                    IDNumber[i + 1] = IDNumber[i];
                } else {
                    break;
                }
            }
            IDNumber[i + 1] = value;
        }
        System.out.println(Arrays.toString(IDNumber));
    }
}

class Student{
    public int ID;
    Student(){
        ID=(int)(Math.random()*90000+10000);
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                '}';
    }
}