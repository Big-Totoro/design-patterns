package io.sskuratov.visitor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Square implements Shape {

    private int size;

    @Override
    public void visit(Visitor visitor) {
        visitor.visit(this);
    }
}
