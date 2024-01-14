package animalsAPI;

import java.io.IOException;

public class SearchAnimals {

    private AnimalsService animalsService;

    public SearchAnimals(AnimalsService animalsService) {
        this.animalsService = animalsService;
    }

    public String searchAnimals(String name) throws IOException {
        String clientApiResponse = animalsService.getAnimalsAPI(name);
        return clientApiResponse;
    }
}
