package ru.mirea.task2;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        Shape sp = new Shape(3);
        System.out.println(sp.getDimension());
        sp.setDimension(2);
        System.out.println(sp.toString());

        System.out.println();

        Sphere bl = new Sphere("red", 150);
        System.out.println(bl.toString());
        bl.setColor("blue");
        System.out.println(bl.toString());

        System.out.println();

        Book bk = new Book("Капитанская дочка", "Пушкин", 1836);
        System.out.println(bk.toString());
        bk.setYear(2021);
        System.out.println(bk.toString());

        System.out.println();

        Dog doge = new Dog("Альма",7);
        System.out.println(doge.toString());
        doge.setAge(9);
        System.out.println(doge.humanize());
        System.out.println(doge.toString());

        TestDog td = new TestDog();
        td.addDog(doge);
        System.out.println(td.toString());
    }
}

class Shape{
    int dimension;

    public Shape(int dimension) {
        this.dimension = dimension;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "dimension=" + dimension +
                '}';
    }
}

class Sphere {
    String color;
    int price;

    public Sphere(String color, int price) {
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}

class Book{
    String name;
    String author;
    int year;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}

class Dog{
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int humanize(){
        return age*7;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class TestDog{
    Dog[] dogs = new Dog[0];
    int dogsCount = 0;
    public void addDog(Dog newDog){
        dogsCount++;
        Dog[] temp = new Dog[dogsCount];
        for (int i = 0; i<dogsCount-1; i++){
            temp[i]=dogs[i];
        }
        dogs = new Dog[dogsCount];
        for (int i = 0; i<dogsCount-1; i++){
            dogs[i]=temp[i];
        }
        dogs[dogsCount-1]=newDog;
    }

    @Override
    public String toString() {
        return "TestDog{" +
                "dogs=" + Arrays.toString(dogs) +
                ", dogsCount=" + dogsCount +
                '}';
    }
}

