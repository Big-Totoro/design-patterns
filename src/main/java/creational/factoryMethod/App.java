package creational.factoryMethod;

public class App {

    public static void main(String[] args) {
        System.out.println("Render the Windows dialog");
        Dialog windowsDialog = new WindowsDialog();
        windowsDialog.render();

        System.out.println("Render the Mac dialog");
        Dialog macDialog = new MacDialog();
        macDialog.render();
    }
}
