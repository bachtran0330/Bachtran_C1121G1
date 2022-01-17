package Bai6_ThucHanh;

import java.util.Date;

public class Circle extends Shape {
    public double radius = 1.0;

    public Circle(){};


    public Circle(double radius, String color , boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return  Math.PI * Math.pow(this.radius, 2);
    }
    public double getPerimeter(){
        return  this.radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                " . Whích is a subclass off " + super.toString() +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.radius = this.radius + this.radius*(percent/200);
    }
}