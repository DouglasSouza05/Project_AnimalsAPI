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
    String message = "Array JSON Vazio / Sem Objetos.";
    String taxonomyMessage = "Chave Não Encontrada / Nula No Objeto Taxonomy.";

    @Before
    public void setup() {
        // Criando o contexo do meu teste com o MOCK (SERVIÇO MOCK)
        animalsService = new MockAnimalsService();
        search = new SearchAnimals(animalsService);
    }

    @Test
    public void testSearchCheetah() throws IOException {
        String cheetah = search.searchAnimals("Cheetah");
        JsonArray jsonArray = JsonParser.parseString(cheetah).getAsJsonArray();

        if (jsonArray.size() > 0) {
            JsonObject jsonObject = jsonArray.get(0).getAsJsonObject();
            String nameValue = jsonObject.get("name").getAsString();
            assertEquals("Cheetah", nameValue);
        } else {
            fail(message);
        }
    }

    @Test
    public void testSearchCheetahTaxonomy() throws IOException {
        String cheetah = search.searchAnimals("Cheetah");
        JsonArray jsonArray = JsonParser.parseString(cheetah).getAsJsonArray();

        if (jsonArray.size() > 0) {
            JsonObject jsonObject = jsonArray.get(0).getAsJsonObject();
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
        String kangaroo = search.searchAnimals("Kangaroo");
        JsonArray jsonArray = JsonParser.parseString(kangaroo).getAsJsonArray();

        if (jsonArray.size() > 0) {
            JsonObject jsonObject = jsonArray.get(0).getAsJsonObject();
            String nameValue = jsonObject.get("name").getAsString();
            assertEquals("Kangaroo", nameValue);
        } else {
            fail(message);
        }
    }

    @Test
    public void testSearchKangarooTaxonomy() throws IOException {
        String cheetah = search.searchAnimals("Kangaroo");
        JsonArray jsonArray = JsonParser.parseString(cheetah).getAsJsonArray();

        if (jsonArray.size() > 0) {
            JsonObject jsonObject = jsonArray.get(0).getAsJsonObject();
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
        String kangaroo = search.searchAnimals("Kangaroo");
        JsonArray jsonArray = JsonParser.parseString(kangaroo).getAsJsonArray();

        if (jsonArray.size() > 0) {
            JsonObject jsonObject = jsonArray.get(1).getAsJsonObject();
            String nameValue = jsonObject.get("name").getAsString();
            assertEquals("Kangaroo Rat", nameValue);
        } else {
            fail(message);
        }
    }

    @Test
    public void testSearchKangarooRatTaxonomy() throws IOException {
        String cheetah = search.searchAnimals("Kangaroo");
        JsonArray jsonArray = JsonParser.parseString(cheetah).getAsJsonArray();

        if (jsonArray.size() > 0) {
            JsonObject jsonObject = jsonArray.get(1).getAsJsonObject();
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
        String kangaroo = search.searchAnimals("Kangaroo");
        JsonArray jsonArray = JsonParser.parseString(kangaroo).getAsJsonArray();

        if (jsonArray.size() > 0) {
            JsonObject jsonObject = jsonArray.get(2).getAsJsonObject();
            String nameValue = jsonObject.get("name").getAsString();
            assertEquals("Tree Kangaroo", nameValue);
        } else {
            fail(message);
        }
    }

    @Test
    public void testSearchTreeKangarooTaxonomy() throws IOException {
        String cheetah = search.searchAnimals("Kangaroo");
        JsonArray jsonArray = JsonParser.parseString(cheetah).getAsJsonArray();

        if (jsonArray.size() > 0) {
            JsonObject jsonObject = jsonArray.get(2).getAsJsonObject();
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
