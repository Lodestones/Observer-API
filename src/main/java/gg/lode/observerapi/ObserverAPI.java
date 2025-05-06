package gg.lode.observerapi;

public class ObserverAPI {

    private static IObserverAPI api;

    public static void setApi(IObserverAPI api) {
        ObserverAPI.api = api;
    }

    public static IObserverAPI getApi() {
        return api;
    }

}
