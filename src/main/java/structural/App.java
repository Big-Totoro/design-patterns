package structural;

public class App {

    public static void main(String[] args) {
        DatabaseClient client = new DatabaseClient();

        System.out.println("Client works with PostgreSQL database");
        client.selectAllEmployee(new PostgreSqlDatabase());

        System.out.println("Client works with the file as it was with PostgreSQL");
        client.selectAllEmployee(new DatabaseToFileAdapter());
    }
}
