package creational.factoryMethod;

public abstract class Dialog {
    public void render() {
        Button okButton = createButton();
        okButton.render();
        okButton.onClick();
    }

    public abstract Button createButton();
}
