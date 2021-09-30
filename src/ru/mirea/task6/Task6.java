package ru.mirea.task6;

public class Task6 {
    public static void main(String[] args) {
        Dog dog = new Dog("Мухтар", 9);
        System.out.println(dog.getName());

        Planet planet = new Planet("Земля", 6371);
        System.out.println(planet.getName());

        Smartphone sm = new Smartphone("Iphone 13", 100000);
        System.out.println(sm.getPrice());

        Whatch whatch = new Whatch("Alexey", 50000);
        System.out.println(whatch.getPrice());
    }
}

interface Nameable{
    public String getName();
}

interface Priceable{
    public int getPrice();
}


class Dog implements Nameable{
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }
}


class Planet implements Nameable{
    String name;
    int size;

    public Planet(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }
}


class Smartphone implements Priceable{
    String model;
    int price;

    public Smartphone(String model, int price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}


class Whatch implements Priceable{
    String owner;
    int price;

    public Whatch(String owner, int price) {
        this.owner = owner;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}