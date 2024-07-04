package Throws;
import java.io.IOException;

public class MyIOException {
    public void display() throws IOException, ClassNotFoundException {
        MyClassNotFoundException obj = new MyClassNotFoundException();
        obj.show();
        throw new IOException("IOException thrown in MyIOException class");
    }
}
