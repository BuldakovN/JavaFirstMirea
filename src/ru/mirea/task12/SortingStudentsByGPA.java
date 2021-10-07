package ru.mirea.task12;
//Быстрая сортировка

import java.util.Arrays;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    public static void main(String[] args) {
        Student[] IDNumbers = new Student[10];
        for (int i = 0; i < 10; i++) {
            IDNumbers[i] = new Student();
        }
        System.out.println(Arrays.toString(IDNumbers));
        quickSort(IDNumbers, 0, IDNumbers.length - 1);
        System.out.println(Arrays.toString(IDNumbers));
        reverseQuickSort(IDNumbers, 0, IDNumbers.length - 1);
        System.out.println(Arrays.toString(IDNumbers));
    }

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.ID > o2.ID) {return 1;}
        else if (o1.ID < o2.ID){return -1;}
        else {return 0;}
    }

    public static void quickSort(Student[] source, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int center = source[(leftMarker + rightMarker) / 2].ID;
        do {
            // Двигаем левый маркер слева направо пока элемент меньше, чем center
            while (source[leftMarker].ID < center) {
                leftMarker++;
            }
            // Двигаем правый маркер, пока элемент больше, чем center
            while (source[rightMarker].ID > center) {
                rightMarker--;
            }
            // Проверим, не нужно обменять местами элементы, на которые указывают маркеры
            if (leftMarker <= rightMarker) {
                // Левый маркер будет меньше правого только если мы должны выполнить swap
                if (leftMarker < rightMarker) {
                    Student tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }
                // Сдвигаем маркеры, чтобы получить новые границы
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        // Выполняем рекурсивно для частей
        if (leftMarker < rightBorder) {
            quickSort(source, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(source, leftBorder, rightMarker);
        }
    }

    public static void reverseQuickSort(Student[] source, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int center = source[(leftMarker + rightMarker) / 2].ID;
        do {
            // Двигаем левый маркер слева направо пока элемент меньше, чем center
            while (source[leftMarker].ID > center) {
                leftMarker++;
            }
            // Двигаем правый маркер, пока элемент больше, чем center
            while (source[rightMarker].ID > center) {
                rightMarker--;
            }
            // Проверим, не нужно обменять местами элементы, на которые указывают маркеры
            if (leftMarker <= rightMarker) {
                // Левый маркер будет меньше правого только если мы должны выполнить swap
                if (leftMarker < rightMarker) {
                    Student tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }
                // Сдвигаем маркеры, чтобы получить новые границы
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        // Выполняем рекурсивно для частей
        if (leftMarker < rightBorder) {
            quickSort(source, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(source, leftBorder, rightMarker);
        }
    }
}