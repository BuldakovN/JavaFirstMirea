package ru.mirea.task6;

interface Nameable {
    String getName();
}

interface Priceable{
    int getPrice();
}

class Cat implements Nameable, Priceable{
    String name = "Жучка";
    int price = 15000;

    public Cat(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}

public class Test{
    public static void main(String[] args) {
        Cat c = new Cat("asdfasdf", 987);
        System.out.println(c.getPrice());
        System.out.println(c.getName());
    }
}