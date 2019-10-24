import java.io.IOException;

public class WeatherServiceAndroidSol {
    HttpClient client;

    public WeatherServiceAndroidSol(){
        this.client = HttpFactory.getClient();
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
