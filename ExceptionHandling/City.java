package ExceptionHandling;

import java.util.HashMap;
import java.util.Map;

public class City {

    private static final int[] ZIPCODES = {848114, 848101, 800001};
    private static final String[] CITIES = {"Dalsinghsarai", "Samastipur", "Patna"};
    private static final Map<Integer, String> MAP = new HashMap<>();

    City() {
        for (int i = 0; i < CITIES.length; i++)
            MAP.put(ZIPCODES[i], CITIES[i]);
    }

    String findCityByZipCode(int zipCode) throws Exception {

        String city = MAP.get(zipCode);
        if (city == null)
            throw new CityNotFoundException();

        return "CITY FOUND: " + city;
    }

    public static void main(String[] args) {
        try {
            System.out.println(new City().findCityByZipCode(848114));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

/*

OUTPUT:

EXECUTION 1:

CITY FOUND: Dalsinghsarai

EXECUTION 2:

ExceptionHandling.CityNotFoundException: CITY NOT FOUND.
	at ExceptionHandling.City.findCityByZipCode(City.java:27)
	at ExceptionHandling.City.main(City.java:34)

 */

