package io.sskuratov.visitor;

public interface Visitor {

    void visit(Circle circle);
    void visit(Rectangle rectangle);
    void visit(Triangle triangle);
    void visit(Square square);
}
