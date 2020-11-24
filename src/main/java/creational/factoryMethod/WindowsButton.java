package creational.factoryMethod;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("WindowsButton > Render");
    }

    @Override
    public void onClick() {
        System.out.println("WindowsButton > onClick");
    }
}
