package animalsAPI;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {
        AnimalsCalls animalsCalls = new AnimalsCalls();
        System.out.println(animalsCalls.searchAnimals("Eastern Lowland Gorilla"));
    }
}
