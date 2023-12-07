package ua.matveenko.hw13;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStream;

public class Task1 {
    public static void main(String[] args) {
        String path = "box.json";
        String strings;
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        try (InputStream inputStream = classLoader.getResourceAsStream(path)) {
            assert inputStream != null;
            strings = new String(inputStream.readAllBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Gson gson = new Gson();
        System.out.println(gson.fromJson(strings, Box.class));
    }
}
