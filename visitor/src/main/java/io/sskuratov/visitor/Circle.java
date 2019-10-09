package io.sskuratov.visitor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Circle implements Shape {

    private int radius;

    @Override
    public void visit(Visitor visitor) {
        visitor.visit(this);
    }
}
