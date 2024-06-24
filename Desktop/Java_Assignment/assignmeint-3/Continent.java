class Continent{
    private String name;
    private long population;
    public String climate;
    private double area;
    public double gdp;

  public Continent(String name,long population,String climate,double area,double gdp){
       this.name=name;
       this.population=population;
       this.climate=climate;
       this.area=area;
       this.gdp = gdp;
    }
      // Getter and Setter methods

    // Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Population
    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    // Climate
    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    // Area
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    // GDP
    public double getGdp() {
        return gdp;
    }

    public void setGdp(double gdp) {
        this.gdp = gdp;
    }
}

