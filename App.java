import org.apache.hc.core5.net.URIBuilder;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpResponse;


public class App {

    private final static String API_URL = "https://api.github.com/users/Eyaditor";

    public static void main(String[] args) {
        URIBuilder uriBuilder = null;
        try {
            uriBuilder = new URIBuilder(API_URL);
            URI uri = uriBuilder.build();
            HttpResponse<String> response = HTTPHelper.sendGet(uri);
            if (response != null) {
                System.out.println(response.body());

            }

        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}