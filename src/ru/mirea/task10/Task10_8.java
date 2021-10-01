package ru.mirea.task10;

//Палиндром
public class Task10_8 {
    public static void main(String[] args) {
        System.out.println(palindrom("ДОВjhgОД"));
    }

    static String palindrom(String str){
        if (str.charAt(0)==str.charAt(str.length()-1)){
            return palindrom(str,1);
        }
        else {return "NO";}
    }

    static String palindrom(String str, int i){
        if (i>str.length()/2){
            return "YES";
        }
        if (str.charAt(i)==str.charAt(str.length()-1-i)){
            return palindrom(str, ++i);
        }
        else{
            return "NO";
        }
    }
}
