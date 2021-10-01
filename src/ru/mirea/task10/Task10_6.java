package ru.mirea.task10;
//Проверка числа на простоту
public class Task10_6 {
    public static void main(String[] args) {
        System.out.println(simple(23));
    }

    static boolean simple(int digit){
        if (digit==1){return true;}
        return simple(digit, digit-1);
    }

    public static boolean simple(int digit, int div){
        if (div==1){
            return true;
        }
        if (digit%div==0){
            return false;
        }
        else{
            return simple(digit, div-1);
        }
    }
}
