public class Country extends Continent {
    private String capital;
    private String currency;
    private String language;
    private String states;
    private String governmentType;

    public Country(String name, long population, String climate, double area, double gdp,
                   String capital, String currency, String language, String states, String governmentType) {
        super(name, population, climate, area, gdp);
        this.capital = capital;
        this.currency = currency;
        this.language = language;
        this.states = states;
        this.governmentType = governmentType;
    }

    // Getters and Setters for all fields

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }

    public String getGovernmentType() {
        return governmentType;
    }

    public void setGovernmentType(String governmentType) {
        this.governmentType = governmentType;
    }
}
