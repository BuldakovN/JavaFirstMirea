package ru.mirea.task5;

public class FurnitureTest {
    public static void main(String[] args) {
        //Упражнение 3
        FurnitureShop fs = new FurnitureShop();
        Sofa sofa = new Sofa("Софа чёрная", 5, 2, 3, 250, 4);
        Cabinet cabinet = new Cabinet("Тумбочка жёлтая", 2, 2, 2, 100, 2);
        fs.sellFurniture(sofa, 8900000);
        fs.sellFurniture(cabinet, 4500000);
    }
}

class FurnitureShop {
    public void sellFurniture(Furniture f, int price) {
        System.out.println("Продажа "+f.getName() + " за "+price/100+"."+price%100+" рублей.");
    }
}

abstract class Furniture {
    private String name;
    private float length = 0, width = 0, height = 0, weight = 0;

    public Furniture(String name, float length, float width, float height, float weight) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}

class Cabinet extends Furniture {
    private int shelves = 0;

    public int getShelves() {
        return shelves;
    }

    public void setShelves(int shelves) {
        this.shelves = shelves;
    }


    public Cabinet(String name, float length, float width, float height, float weight, int shelves) {
        super(name, length, width, height, weight);
        this.shelves = shelves;
    }
}

class Sofa extends Furniture {
    private int pillows = 0;

    public int getPillows() {
        return pillows;
    }

    public void setPillows(int pillows) {
        this.pillows = pillows;
    }

    public Sofa(String name, float length, float width, float height, float weight, int pillows) {
        super(name, length, width, height, weight);
        this.pillows = pillows;
    }
}