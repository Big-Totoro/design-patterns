package io.sskuratov.visitor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rectangle implements Shape {

    private int width;
    private int height;

    @Override
    public void visit(Visitor visitor) {
        visitor.visit(this);
    }
}
