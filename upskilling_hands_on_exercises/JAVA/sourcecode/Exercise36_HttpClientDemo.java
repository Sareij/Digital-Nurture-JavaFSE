import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Exercise36_HttpClientDemo {

    public static void main(String[] args) {

        try {
            // 1. Create HttpClient
            HttpClient client = HttpClient.newHttpClient();

            // 2. Create Request (GitHub API example)
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://api.github.com/users/octocat"))
                    .GET()
                    .build();

            // 3. Send Request and get Response
            HttpResponse<String> response = client.send(
                    request,
                    HttpResponse.BodyHandlers.ofString()
            );

            // 4. Print Status Code
            System.out.println("Status Code: " + response.statusCode());

            // 5. Print Response Body
            System.out.println("\nResponse Body:\n");
            System.out.println(response.body());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}