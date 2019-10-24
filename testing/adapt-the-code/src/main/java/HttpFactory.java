public class HttpFactory {
    private static HttpClient client = new RealHttpClient();

    public static HttpClient getClient() {
        return client;
    }

    public static void setClient(HttpClient client) {
        HttpFactory.client = client;
    }
    /*
    This implementation allows you to create a system of getters and
    setters and then allows you to maniplate the dependency using the
    "factory" object. Unless you use the setClient method to manually manipulate
    the code, the factory automattically set the default client to the system internet
    service.
    For testing you simply add the setClient Method to change the client for the tests

    WeatherService(); >> constructor automatically calls the factory and is set to RealHttpCleint
    and from there you can set the client and change the client user
     */
}
