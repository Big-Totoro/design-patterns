package structural;

public class PostgreSqlDatabase implements Database {

    @Override
    public void selectAll() {
        System.out.println("Select all from database");
    }
}
