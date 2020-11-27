package creational.builder;

import java.util.ArrayList;
import java.util.List;

public class ProductDocumentation implements Product {

    private List<String> features = new ArrayList<>();

    @Override
    public void feature1() {
        features.add("Documentation feature1");
    }

    @Override
    public void feature2() {
        features.add("Documentation feature2");
    }

    @Override
    public void feature3() {
        features.add("Documentation feature3");
    }

    @Override
    public void feature4() {
        features.add("Documentation feature4");
    }

    @Override
    public List<String> getFeatures() {
        return List.copyOf(features);
    }
}
