package creational.abstractFactory;

public class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("WindowsButton > render");
    }
}
