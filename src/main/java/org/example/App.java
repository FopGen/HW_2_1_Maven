package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
public class App 
{
    public static void main( String[] args ) throws IOException {

        User gladkiy = new User("Evgen","Gladkiy");
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        String jsonString = gson.toJson(gladkiy);
        System.out.println(jsonString);

    }
}
