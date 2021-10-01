package ru.mirea.task10;


//Разложение на множители.
public class Task10_7 {
    public static void main(String[] args) {
        int digit = 24;
        int temp = digit;
        String out="";
        for (int i=2; i<=digit; i++){
            while(temp%i==0 && Task10_6.simple(i)){
                temp/=i;
                out+=Integer.toString(i)+" ";
            }
        }
        System.out.println(out);
    }
}
