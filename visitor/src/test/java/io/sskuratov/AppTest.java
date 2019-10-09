package io.sskuratov;

import static org.junit.Assert.assertTrue;

import io.sskuratov.visitor.*;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        Visitor visitor = new SquareCalculationVisitor();
        visitor.visit(new Circle(10));
        visitor.visit(new Rectangle(20, 30));
        visitor.visit(new Square(40));
        visitor.visit(new Triangle(50, 45));
    }
}
