import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        List<City> cityList = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("resources\\city_ru.csv")).useDelimiter("[;]")) {
            scanner.next();
            while (scanner.hasNext()) {
                String name = scanner.next();
                String region = scanner.next();
                String district = scanner.next();
                int population = scanner.nextInt();
                String tempFoundation = scanner.next();
                String[] foundation = tempFoundation.split("(\\r\\n|\\r|\\n)");
                cityList.add(new City(name, region, district, population, foundation[0]));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        cityList.forEach(System.out::println);
    }
}