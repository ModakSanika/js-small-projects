class Book {
    private String title;
    private String author;
    private int publication_year;
    public String genre;
    public double cost;

    // Constructor1
    Book(String title, String author, int publication_year, String genre, double cost) {
        this.author = author;
        this.title = title;
        this.publication_year = publication_year;
        this.genre = genre;
        this.cost = cost;
    }

    // Constructor2
    Book(String title, String author) {
        this.author = author;
        this.title = title;
    }

    // Constructor3
    Book(String title, String author, int publication_year) {
        this.author = author;
        this.title = title;
        this.publication_year = publication_year;
    }

    // Constructor4
    Book(String title, String author, int publication_year, String genre) {
        this.author = author;
        this.title = title;
        this.publication_year = publication_year;
        this.genre = genre;
    }

    // Constructor5
    Book(String title, String author, short publication_year, String genre, double cost) {
        this.author = author;
        this.title = title;
        this.publication_year = publication_year;
        this.genre = genre;
        this.cost = cost;
    }

    public void displayInfo() {
        System.out.println("Title: " + (title ));
        System.out.println("Author: " + (author));
        System.out.println("Publication Year: " + (publication_year ));
        System.out.println("Genre: " + (genre ));
        System.out.println("Cost: " + (cost ));
    }

}
