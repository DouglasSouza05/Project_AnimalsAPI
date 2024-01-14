package animalsAPI;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import java.io.IOException;
import org.junit.Before;
import org.junit.Test;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class TestSearchAnimals {

    AnimalsService animalsService;
    SearchAnimals search;
    String message = "Array JSON Vazio ou Sem Objetos.";
    String taxonomyMessage = "Chave Não Encontrada ou Nula No Objeto.";
    JsonArray jsonArrayCheetah;
    JsonArray jsonArrayKangaroo;
    String cheetah;
    String kangaroo;

    @Before
    public void setup() throws IOException {

        // animalsService = new AnimalsClient();
        animalsService = new MockAnimalsService();
        search = new SearchAnimals(animalsService);

        cheetah = search.searchAnimals("Cheetah");
        kangaroo = search.searchAnimals("Kangaroo");

        // Transformando String em Json Array (Array com Objetos Json)
        jsonArrayCheetah = JsonParser.parseString(cheetah).getAsJsonArray();
        jsonArrayKangaroo = JsonParser.parseString(kangaroo).getAsJsonArray();
    }

    @Test
    public void testSearchCheetah() throws IOException {

        if (jsonArrayCheetah.size() > 0) {
            // Pegando primeiro objeto do Json Array
            JsonObject jsonObject = jsonArrayCheetah.get(0).getAsJsonObject();
            String nameValue = jsonObject.get("name").getAsString();
            assertEquals("Cheetah", nameValue);
        } else {
            fail(message);
        }
    }

    @Test
    public void testSearchCheetahTaxonomy() throws IOException {

        if (jsonArrayCheetah.size() > 0) {
            JsonObject jsonObject = jsonArrayCheetah.get(0).getAsJsonObject();
            JsonObject taxonomyObject = jsonObject.getAsJsonObject("taxonomy");
            JsonElement element = taxonomyObject.get("order");

            if (element != null && !element.isJsonNull()) {
                String value = element.getAsString();
                assertEquals("Carnivora", value);
            } else {
                fail(taxonomyMessage);
            }
        } else {
            fail(message);
        }
    }

    @Test
    public void testSearchKangaroo() throws IOException {

        if (jsonArrayKangaroo.size() > 0) {
            JsonObject jsonObject = jsonArrayKangaroo.get(0).getAsJsonObject();
            String nameValue = jsonObject.get("name").getAsString();
            assertEquals("Kangaroo", nameValue);
        } else {
            fail(message);
        }
    }

    @Test
    public void testSearchKangarooTaxonomy() throws IOException {

        if (jsonArrayKangaroo.size() > 0) {
            JsonObject jsonObject = jsonArrayKangaroo.get(0).getAsJsonObject();
            JsonObject taxonomyObject = jsonObject.getAsJsonObject("taxonomy");
            JsonElement element = taxonomyObject.get("order");

            if (element != null && !element.isJsonNull()) {
                String value = element.getAsString();
                assertEquals("Diprotodontia", value);
            } else {
                fail(taxonomyMessage);
            }
        } else {
            fail(message);
        }
    }

    @Test
    public void testSearchKangarooRat() throws IOException {

        if (jsonArrayKangaroo.size() > 0) {
            JsonObject jsonObject = jsonArrayKangaroo.get(1).getAsJsonObject();
            String nameValue = jsonObject.get("name").getAsString();
            assertEquals("Kangaroo Rat", nameValue);
        } else {
            fail(message);
        }
    }

    @Test
    public void testSearchKangarooRatTaxonomy() throws IOException {

        if (jsonArrayKangaroo.size() > 0) {
            JsonObject jsonObject = jsonArrayKangaroo.get(1).getAsJsonObject();
            JsonObject taxonomyObject = jsonObject.getAsJsonObject("taxonomy");
            JsonElement element = taxonomyObject.get("order");

            if (element != null && !element.isJsonNull()) {
                String value = element.getAsString();
                assertEquals("Rodentia", value);
            } else {
                fail(taxonomyMessage);
            }
        } else {
            fail(message);
        }
    }

    @Test
    public void testSearchTreeKangaroo() throws IOException {

        if (jsonArrayKangaroo.size() > 0) {
            JsonObject jsonObject = jsonArrayKangaroo.get(2).getAsJsonObject();
            String nameValue = jsonObject.get("name").getAsString();
            assertEquals("Tree Kangaroo", nameValue);
        } else {
            fail(message);
        }
    }

    @Test
    public void testSearchTreeKangarooTaxonomy() throws IOException {

        if (jsonArrayKangaroo.size() > 0) {
            JsonObject jsonObject = jsonArrayKangaroo.get(2).getAsJsonObject();
            JsonObject taxonomyObject = jsonObject.getAsJsonObject("taxonomy");
            JsonElement element = taxonomyObject.get("order");

            if (element != null && !element.isJsonNull()) {
                String value = element.getAsString();
                assertEquals("Diprotodontia", value);
            } else {
                fail(taxonomyMessage);
            }
        } else {
            fail(message);
        }
    }

}
