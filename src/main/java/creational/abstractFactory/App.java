package creational.abstractFactory;

public class App {
    public static void main(String[] args) {
        System.out.println("> Working with Windows GUI");
        GuiFactory windowsGuiFactory = new WindowsGuiFactory();
        Button button = windowsGuiFactory.createButton();
        button.render();
        CheckBox checkBox = windowsGuiFactory.createCheckBox();
        checkBox.check();

        System.out.println("> Working with Mac GUI");
        GuiFactory macGuiFactory = new MacGuiFactory();
        button = macGuiFactory.createButton();
        button.render();
        checkBox = macGuiFactory.createCheckBox();
        checkBox.check();
    }
}