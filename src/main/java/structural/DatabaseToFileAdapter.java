package structural;

public class DatabaseToFileAdapter implements Database {

    private File file;

    public DatabaseToFileAdapter() {
        file = new File();
    }

    @Override
    public void selectAll() {
        file.readAllFile();
    }
}
