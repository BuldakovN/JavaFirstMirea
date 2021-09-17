package ru.mirea.task5;

public class DishTest {
    public static void main(String[] args) {
        Dish dish = new Fork("metall", "fork", 50);
        System.out.println(dish.toString());
        dish.setPrice(70);
        System.out.println(dish.toString());

        System.out.println();

        dish = new Plate("porcelain", "plate", 200);
        System.out.println(dish.toString());
        dish.setPrice(250);
        System.out.println(dish.toString());

        System.out.println();

        dish = new Spoon("silver", "spoon", 45);
        System.out.println(dish.toString());
        dish.setPrice(75);
        System.out.println(dish.toString());
   }
}

abstract class Dish{
    String material;
    String sort;
    int price;

    public Dish(String material, String sort, int price) {
        this.material = material;
        this.sort = sort;
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "material='" + material + '\'' +
                ", sort='" + sort + '\'' +
                ", price=" + price +
                '}';
    }
}

class Fork extends Dish{
    public Fork(String material, String sort, int price) {
        super(material, sort, price);
    }
}

class Plate extends Dish{
    public Plate(String material, String sort, int price) {
        super(material, sort, price);
    }
}

class Spoon extends Dish{
    public Spoon(String material, String sort, int price) {
        super(material, sort, price);
    }
}
