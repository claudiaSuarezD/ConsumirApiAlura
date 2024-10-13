import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaApi {

    public Conversor consultarConversor(String monedaComienzo, String monedaFinal){
        URI direccion= URI.create("https://v6.exchangerate-api.com/v6/e564098e43d76487f649824c/pair/"+monedaComienzo+"/"+monedaFinal);
        HttpClient cliente= HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try{
            HttpResponse<String> response=cliente
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Conversor.class);
        }catch(Exception e){
            throw new RuntimeException("No encontre este servicio");
        }
    }
}
