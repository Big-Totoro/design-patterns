package creational.abstractFactory;

public class WindowsCheckBox implements CheckBox {

    @Override
    public void check() {
        System.out.println("WindowsCheckBox > check");
    }
}
