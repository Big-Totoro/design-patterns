package creational.builder;

public class ProductABuilder implements Builder {

    private Product product = new ProductA();

    @Override
    public void addFeature1() {
        product.feature1();
    }

    @Override
    public void addFeature2() {
        product.feature2();
    }

    @Override
    public void addFeature3() {
        product.feature3();
    }

    @Override
    public void addFeature4() {
        product.feature4();
    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
