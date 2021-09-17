package ru.mirea.task3;



public class CircleTest {
    public static void main() {
        Circle c = new Circle(5);
        System.out.println(c);
        c.setRadius(c.getRadius()+1);
        System.out.println(c);
    }
}

class Circle{
    float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
