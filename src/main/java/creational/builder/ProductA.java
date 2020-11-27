package creational.builder;

import java.util.ArrayList;
import java.util.List;

public class ProductA implements Product {

    private List<String> features = new ArrayList<>();

    @Override
    public void feature1() {
        features.add("feature1");
    }

    @Override
    public void feature2() {
        features.add("feature2");
    }

    @Override
    public void feature3() {
        features.add("feature3");
    }

    @Override
    public void feature4() {
        features.add("feature4");
    }

    @Override
    public List<String> getFeatures() {
        return List.copyOf(features);
    }
}
