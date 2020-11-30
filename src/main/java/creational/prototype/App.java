package creational.prototype;

public class App {

    public static void main(String[] args) {
        System.out.println("> Original shapes");
        Shape circle = new Circle(10);
        Shape rectangle = new Rectangle(20, 30);
        System.out.println(circle);
        System.out.println(rectangle);

        System.out.println("> Cloned shapes");
        Shape clonedCircle = circle.clone();
        Shape clonedRectangle = rectangle.clone();
        System.out.println(clonedCircle);
        System.out.println(clonedRectangle);
    }
}
