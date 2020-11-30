package creational.prototype;

import java.util.Objects;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle target) {
        super(target);

        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if ((o == null) || (o.getClass() != this.getClass())) {
            return false;
        }
        Rectangle r = (Rectangle)o;
        return r.height == this.height && r.width == this.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.width, this.height);
    }

    @Override
    public String toString() {
        return "Rectangle {" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
