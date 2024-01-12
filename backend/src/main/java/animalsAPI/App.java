package animalsAPI;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        AnimalsClient animalsClient = new AnimalsClient();
        String clientApiResponse = animalsClient.getAnimalsAPI("Fox");
        System.out.println(clientApiResponse);
    }
}
