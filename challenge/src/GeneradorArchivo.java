import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GeneradorArchivo {

    public void guardarJson(List<ConversorMoneda> moneda) throws IOException {
        Gson gson= new GsonBuilder().setPrettyPrinting().create();
        FileWriter escritura=new FileWriter("conversor.json");
        escritura.write(gson.toJson(moneda));
        escritura.close();

    }
}
