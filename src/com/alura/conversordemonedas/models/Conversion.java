package com.alura.conversordemonedas.models;

/**
 * Clase que representa una conversión de moneda realizada.
 */

public class Conversion {
    private String monedaOrigen;
    private String monedaDestino;
    private double cantidad;
    private double resultado;

    public Conversion(String monedaOrigen, String monedaDestino, double cantidad, double resultado) {
        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;
        this.cantidad = cantidad;
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return cantidad + " " + monedaOrigen + " = " + resultado + " " + monedaDestino;
    }
}
