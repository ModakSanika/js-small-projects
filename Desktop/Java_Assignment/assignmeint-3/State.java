public class State extends Country {

    private String governor;
    private String education;

    public State(String name, long population, String climate, double area, double gdp,
                 String capital, String currency, String language, String states, String governmentType,
                 String governor, String education) {
        super(name, population, climate, area, gdp, capital, currency, language, states, governmentType);
        this.governor = governor;
        this.education = education;
    }

    // Getters and Setters for governor and education

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {
        this.governor = governor;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}
