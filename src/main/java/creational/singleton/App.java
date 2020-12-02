package creational.singleton;

public class App {
    public static void main(String[] args) {
        System.out.println("> Singleton instance 1");
        Singleton singleton1 = Singleton.getInstance("Value 1");
        System.out.println(singleton1.getValue());

        System.out.println("> Singleton instance 2");
        Singleton singleton2 = Singleton.getInstance("Value 2");
        System.out.println(singleton2.getValue());
    }
}
