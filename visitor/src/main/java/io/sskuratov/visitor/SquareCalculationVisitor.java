package io.sskuratov.visitor;

public class SquareCalculationVisitor implements Visitor {

    @Override
    public void visit(Circle circle) {
        System.out.println(String.format("Circle square: %f", Math.PI * Math.pow(circle.getRadius(), 2)));
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println(String.format("Rectangle square: %d", rectangle.getWidth() * rectangle.getHeight()));
    }

    @Override
    public void visit(Triangle triangle) {
        System.out.println(String.format("Rectangle square: %f", 0.5 * triangle.getBase() * triangle.getHeight()));
    }

    @Override
    public void visit(Square square) {
        System.out.println(String.format("Square square: %d", square.getSize() * square.getSize()));
    }
}