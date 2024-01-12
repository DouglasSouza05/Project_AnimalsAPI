package animalsAPI;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class AnimalsClient {

    public final String apiUrl = "https://api.api-ninjas.com/v1/animals?name=";
    public final String apiKey = "1/fQglp/19H5bdDx+vFf7A==xKa6MhH3R9bpA86q";
    String statusCodeOk = "HTTP/1.1 200 OK";

    public String getAnimalsAPI(String name) throws IOException {

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(apiUrl + name);
        httpGet.setHeader("X-Api-Key", apiKey);
        CloseableHttpResponse animalsApiResponse = httpClient.execute(httpGet);

        try {
            if (animalsApiResponse.getStatusLine().toString().equals(statusCodeOk)) {
                System.out.println("Status Code Ok...");
                HttpEntity entity = animalsApiResponse.getEntity();
                // EntityUtils.consume(entity);
                return EntityUtils.toString(entity);
            } else {
                System.out.println("Status Code Not Ok...");
                System.out.println(animalsApiResponse.getStatusLine().toString());
            }
        } catch (ClientProtocolException exception) {
            System.out.println("Exception Lançado... \n");
            exception.printStackTrace();
        } finally {
            animalsApiResponse.close();
        }

        return "";
    }
}