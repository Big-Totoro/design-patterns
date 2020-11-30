package creational.prototype;

import java.util.Objects;

public class Circle extends Shape {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public Circle clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }

        Circle c = (Circle)o;
        return c.radius == this.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.radius);
    }

    @Override
    public String toString() {
        return "Circle {" +
                "radius=" + radius +
                '}';
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
