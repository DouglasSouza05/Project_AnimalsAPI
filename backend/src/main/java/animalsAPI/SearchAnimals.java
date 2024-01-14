package animalsAPI;

import java.io.IOException;

public class SearchAnimals {

    private AnimalsClient animalsClient;

    public SearchAnimals(AnimalsClient animalsClient) {
        this.animalsClient = animalsClient;
    }

    public String searchAnimals(String name) throws IOException {
        String clientApiResponse = animalsClient.getAnimalsAPI(name);
        return clientApiResponse;
    }
}
