package com.alura.conversordemonedas.models;
import java.util.Map;

/**
 * Guarda la respuesta JSON de la API con las tasas de cambio.
 */

public class Moneda {
    //Las variables necesarias para poder tomar de nuestro JSON y proceder a realizar la conversión
    private String result;
    private String base_code;
    private Map<String, Double> conversion_rates;

    //Para consultar sus valores, creamos getters
    public String getResult() {
        return result;
    }

    public String getBase_code() {
        return base_code;
    }

    public Map<String, Double> getConversion_rates() {
        return conversion_rates;
    }

}
