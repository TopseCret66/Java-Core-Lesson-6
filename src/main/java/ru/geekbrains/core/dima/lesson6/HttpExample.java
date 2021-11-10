package ru.geekbrains.core.dima.lesson6;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru.geekbrains.core.dima.lesson6.data.Data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class HttpExample {

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://dataservice.accuweather.com/forecasts/v1/daily/5day/295212?apikey=si9vpPT6D6nTaudzJ7gMYg4a5sm9KPuC");

        URLConnection urlConnection = url.openConnection();

        HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;

        //https://dataservice.accuweather.com/forecasts/v1/daily/5day/295212?apikey=si9vpPT6D6nTaudzJ7gMYg4a5sm9KPuC

        System.out.println(httpURLConnection.getResponseCode());
        System.out.println(httpURLConnection.getResponseMessage());

        BufferedReader in = new BufferedReader(
                new InputStreamReader(httpURLConnection.getInputStream()));

        StringBuilder response = new StringBuilder();
        String currentLine;

        while ((currentLine = in.readLine()) != null)
            response.append(currentLine);

        in.close();

        ObjectMapper om = new ObjectMapper();

        Data forecast = om.readValue(response.toString(), Data.class);

        Map<String, List<String>> headers = httpURLConnection.getHeaderFields();
        for (String k: headers.keySet()) {
            System.out.println("Ключ:" + k + " . Значение:" + headers.get(k));
        }



    }
}
