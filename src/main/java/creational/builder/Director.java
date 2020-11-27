package creational.builder;

public class Director {
    public Product buildProduct(ProductABuilder builder) {
        builder.addFeature1();
        builder.addFeature2();
        builder.addFeature3();
        builder.addFeature4();
        return builder.buildProduct();
    }

    public Product buildProductDocumentation(ProductDocumentationBuilder builder) {
        builder.addFeature1();
        builder.addFeature2();
        builder.addFeature3();
        builder.addFeature4();
        return builder.buildProduct();
    }
}
