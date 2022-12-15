public class City {
    String name;// – наименование города
    String region;// - регион
    String district;// – федеральный округ
    int population;// – количество жителей города
    String foundation;// – дата основания или первое упоминание


    public City(String name, String region, String district, int population, String foundation) {
        this.name = name;
        this.region = region;
        this.district = district;
        this.population = population;
        this.foundation = foundation;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", district='" + district + '\'' +
                ", population=" + population +
                ", foundation='" + foundation + '\'' +
                '}';
    }
}
