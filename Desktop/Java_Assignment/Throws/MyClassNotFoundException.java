package Throws;
public class MyClassNotFoundException {
    public void show() throws ClassNotFoundException {
        Class.forName("Validate");
    }
}
