package creational.factoryMethod;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("MacButton > render");
    }

    @Override
    public void onClick() {
        System.out.println("MacButton > onClick");
    }
}
