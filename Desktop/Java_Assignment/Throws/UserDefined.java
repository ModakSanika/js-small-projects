package Throws;
import java.sql.SQLException;
import java.io.IOException;

public class UserDefined {
    public static void main(String[] args) {
        MySQLException sql = new MySQLException();

      
    try {
        sql.data();
    } catch (ClassNotFoundException e) {
        System.out.println("ClassNotFoundException occurred: " + e.getMessage());
    } catch (IOException e) {
        System.out.println("IOException occurred: " + e.getMessage());
    } catch (SQLException e) {
        System.out.println("SQLException occurred: " + e.getMessage());
    }
    }
}
