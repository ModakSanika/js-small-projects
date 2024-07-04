package Throws;
import java.io.IOException;
import java.sql.SQLException;

public class MySQLException {
    public void data() throws SQLException, IOException, ClassNotFoundException {
        MyIOException io = new MyIOException();
        io.display();
        throw new SQLException("SQLException thrown in SQLExceptionHandler");
    }
}
