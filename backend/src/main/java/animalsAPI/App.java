package animalsAPI;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {
        SearchAnimals animalsCalls = new SearchAnimals(new AnimalsClient());
        System.out.println(animalsCalls.searchAnimals("Cheetah"));
    }
}
