package animalsAPI;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {
        AnimalsService animalsService = new AnimalsClient();
        SearchAnimals search = new SearchAnimals(animalsService);
        System.out.println(search.searchAnimals("Kangaroo"));
    }
}
