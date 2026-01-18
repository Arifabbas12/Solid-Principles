package DesignPattern;

class DatabaseConnection {
    private static DatabaseConnection instance=null;

    private DatabaseConnection() {
        // private constructor to prevent instantiation
        System.out.println("Singleton is Instantiated.");
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    
}
public class Singleton {
    public static void main(String[] args) {
        DatabaseConnection.getInstance();
         
    }
}
