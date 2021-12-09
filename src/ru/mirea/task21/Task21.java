package ru.mirea.task21;

import java.util.ArrayList;

public class Task21 {
    public static void main(String[] args) {

    }
}

class MetroList{
    static ArrayList<String> metroList = new ArrayList<>(5);
    static{
        metroList.set(0,"Сокольническая");
        metroList.set(1,"Замоскворецкая");
        metroList.set(2,"Арбатско-Покровская");
        metroList.set(3,"Филёвская");
        metroList.set(4,"Кольцевая");
        metroList.set(5,"Калужско-Рижская");
        metroList.set(6,"Таганско-Краснопресненская");
        metroList.set(7,"Калининская");
        metroList.set(8,"Серпуховско-Тимирязевская");
        metroList.set(9,"Люблинско-Дмитровская");
        metroList.set(10,"Большая кольцевая");
        metroList.set(11,"Бутовская");
        metroList.set(12,"Московский монорельс");
        metroList.set(13,"Московское центральное кольцо");
        metroList.set(14,"Некрасовская");
        metroList.set(15,"Рублёво-Архангельская");
    }

    static void PrintList(boolean even){
        for (int i = 0; i<metroList.size(); i++){
            if((i%2==0)==even){
                System.out.println(metroList.get(i));
            }
        }
    }
}
