package animalsAPI;

import java.io.IOException;

public class AnimalsCalls {

    public String searchAnimals(String name) throws IOException {
        AnimalsClient animalsClient = new AnimalsClient();
        String clientApiResponse = animalsClient.getAnimalsAPI(name);
        return clientApiResponse;
    }
}
