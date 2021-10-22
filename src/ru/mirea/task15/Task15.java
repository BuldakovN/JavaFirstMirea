package ru.mirea.task15;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        String path = "src/ru/mirea/task15/File15.txt";
        //1 -- записать в файл с клавиатуры
        System.out.println("Введите что-нибудь");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        writeFile(path, str,false);
        //2 -- вывод из файла
        System.out.print("Было введено: ");
        readFile(path);
        //3 -- замена в текста в файле на текст из клавиатуры
        System.out.println("Напишите еще что-нибудь");
        str = scanner.nextLine();
        writeFile(path, str, false);
        //4 -- добавление в конец файла текста, введенного с клавиатуры
        System.out.println("Напишите еще что-нибудь");
        str = scanner.nextLine();
        writeFile(path, str, true);
    }

    static void readFile(String name){
        //чтение из файла
        try(FileReader reader = new FileReader(name))
        {
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
            System.out.println();
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    static void writeFile(String name, String str, boolean append){
        //запись в файл
        try(FileWriter writer = new FileWriter(name, append))
        {
            writer.write(str);
            writer.append("\n");
            writer.flush();
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
