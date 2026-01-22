package DesignPattern;

class DatabaseConnection {
    private static DatabaseConnection instance=null;

    private DatabaseConnection() {
        // private constructor to prevent instantiation
        System.out.println("Singleton is Instantiated.");
    }

   synchronized public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
}
public class Singleton {
    public static void main(String[] args) {
       DatabaseConnection db1 = DatabaseConnection.getInstance();
       DatabaseConnection db2 = DatabaseConnection.getInstance();

       if (db1 == db2) {
           System.out.println("Both references point to the same instance.");
       } else {
           System.out.println("Different instances exist.");
       }
         
    }
}
