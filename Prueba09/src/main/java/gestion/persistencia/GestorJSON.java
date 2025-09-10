package gestion.persistencia;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GestorJSON {
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static void guardar(Object data, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            gson.toJson(data, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> T cargar(String filename, Class<T> clase) {
        try (FileReader reader = new FileReader(filename)) {
            return gson.fromJson(reader, clase);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
