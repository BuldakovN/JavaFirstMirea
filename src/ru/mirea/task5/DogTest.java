package ru.mirea.task5;

public class DogTest {
    public static void main(String[] args) {
        Dog d1 = new Breed1("Жучка", 5);
        System.out.println(d1.getAge());
        d1.setAge(4);
        System.out.println(d1.toString());

        d1 = new Breed2("Федя", 9);
        System.out.println(d1.getAge());
        d1.setAge(9);
        System.out.println(d1.toString());
    }
}

abstract class Dog{
    String name;
    int age;
    String breed;

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

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                '}';
    }
}

class Breed1 extends Dog{
    public Breed1(String name, int age) {
        super(name, age);
        this.breed = "Breed1";
    }
}

class Breed2 extends Dog{
    public Breed2(String name, int age) {
        super(name, age);
        this.breed = "Breed2";
    }
}