public class Main {
    public static void main(String[] args) {
        // Creating Book objects using different constructors
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Book book4 = new Book("Moby Dick", "Herman Melville", 1851, "Adventure", 15.99);
        Book book5 = new Book("War and Peace", "Leo Tolstoy", (short) 1869, "Historical Fiction", 20);

        // Displaying information about the books
        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();
        book4.displayInfo();
        book5.displayInfo();
    }}