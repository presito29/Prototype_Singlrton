package prototype;

import java.util.ArrayList;
import java.util.List;

public class DB extends Prototype {
    private String connection;
    private List<String> tables;

    public DB(String connectionString, List<String> tables) {
        this.connection = connectionString;
        this.tables = tables;
    }

    public void addTable(String tableName) {
        tables.add(tableName);
    }


    public void displayTables() {
        System.out.println("Database Tables: " + String.join(", " + tables));
    }


    @Override
    public Prototype clone(boolean shallow) {
        if (shallow) {
            return new DB(this.connection, this.tables);
        } else {
            List<String> clonedTables = new ArrayList<>(this.tables);
            return new DB(this.connection, clonedTables);
        }
    }
}
