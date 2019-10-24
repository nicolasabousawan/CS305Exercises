import java.io.IOException;

public class WeatherServiceSolution2 {
    private final HttpClient client;

    /*
    This solution allows you to set the http Client be using a constructor
    The Weather method is untouched and can be called between the constructors
    This is considered a better design than refactoring a method to become testable
    This design adds a function and preserves the original method

    variable = WeatherServiceSolution2(client);
    variable.weather()
    ASSET ^^
    variable = WeatherServiceSolution2(client2);
    variable.weather()
    ASSET ^^
     */
    public WeatherServiceSolution2(HttpClient client) {
        this.client = client;
    }

    public Weather getWeatherToday() {
        String data;
        try {
            data = client.get("http://example.org/weather/today");
        } catch (IOException e) {
            return Weather.UNKNOWN;
        }

        switch (data) {
            case "Sunny":
                return Weather.SUNNY;

            case "Rainy":
                return Weather.RAINY;

            case "Snowy":
                return Weather.SNOWY;

            case "???":
                return Weather.ITS_RAINING_MEN_HALLELUJAH;

            default:
                return Weather.UNKNOWN;
        }
    }
}
