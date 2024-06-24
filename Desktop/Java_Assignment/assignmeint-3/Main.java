public class Main {
    public static void main(String[] args) {
        // Create a Continent
        Continent europe = new Continent("Europe", 741000000, "Temperate", 10180000, 22500.0);

        // Create a Country
        Country germany = new Country("Germany", 83190556, "Temperate", 357022.0, 3949.0,
                "Berlin", "Euro", "German", "16", "Federal Republic");

        // Create a State
        State california = new State("California", 39538223, "Mediterranean", 423970.0, 3200.0,
                "Sacramento", "USD", "English", "50", "Federal Republic",
                "Gavin Newsom", "University of California system");

        // Accessing information
        System.out.println("Continent: " + europe.getName());
        System.out.println("Country: " + germany.getName());
        System.out.println("Capital: " + germany.getCapital());
        System.out.println("State: " + california.getName());
        System.out.println("Governor: " + california.getGovernor());
    }
}
