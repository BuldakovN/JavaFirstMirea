package ru.mirea.task28;

public class Task28 {
    public static void main(String[] args) {
        Automobile.example();
    }
}

class Automobile{
    String getModel() {
        return "Автомобиль";
    }

    class F1Car extends Automobile{
        public String getModel(){
            return "Формула 1";
        }
    }
    static void example(){
        Automobile a1, a2;
        a1=new Automobile().new F1Car();
        a2=new Automobile(){
            String getModel(){
                return "Джипп";
            }
        };
        System.out.println(a1.getModel());
        System.out.println(a2.getModel());
    }
}
