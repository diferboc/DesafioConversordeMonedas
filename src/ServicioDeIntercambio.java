import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ServicioDeIntercambio {
// llamo a la clase exchangerateresponse que es la que contendra la respuesta de Json a clase java

    public ExchangeRateResponse obtenerTasas() throws IOException, InterruptedException {


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/f1510194f8d146a38eabc01d/latest/USD"))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();
        ExchangeRateResponse respuestaJava = gson.fromJson(response.body(), ExchangeRateResponse.class);

        return respuestaJava;

    }
}
