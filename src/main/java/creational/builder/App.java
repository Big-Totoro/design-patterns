package creational.builder;

public class App {
    public static void main(String[] args) {
        Director director = new Director();
        System.out.println("> Create the product");
        ProductABuilder productABuilder = new ProductABuilder();
        Product product = director.buildProduct(productABuilder);
        System.out.println(product.getFeatures());

        System.out.println("> Create the product documentation");
        ProductDocumentationBuilder documentationBuilder = new ProductDocumentationBuilder();
        Product productDocumentation = director.buildProductDocumentation(documentationBuilder);
        System.out.println(productDocumentation.getFeatures());
    }
}
