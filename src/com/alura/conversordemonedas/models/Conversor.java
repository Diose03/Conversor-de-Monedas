package com.alura.conversordemonedas.models;

import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

/**
 * Clase encargada de realizar la conversión de monedas utilizando la API de ExchangeRate.
 */

public class Conversor {

    private final String apiKey;

    //Constructor para definir nuestra APIKey
    public Conversor(String apiKey) {

        this.apiKey = apiKey;
    }

    public Conversion convierteMoneda(String origen, String destino, double cantidad) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + origen);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            Moneda moneda = new Gson().fromJson(response.body(), Moneda.class);

            Map<String, Double> tasas = moneda.getConversion_rates();
            Double tasa = tasas.get(destino);

            if (tasa == null) {
                throw new RuntimeException("Moneda destino no encontrada: " + destino);
            }

            double resultado = cantidad * tasa;
            return new Conversion(origen, destino, cantidad, resultado);

        } catch (Exception e) {
            throw new RuntimeException("Error al convertir moneda: " + e.getMessage());
        }
    }
}
