# 📄🪙 Conversor de Monedas en Java

## 💡 Descripción

Este es un proyecto en Java que permite convertir monedas usando una API externa. El usuario elige una opción desde un menú y se realiza la conversión usando tasas oficiales de cambio proporcionadas por [ExchangeRate-API](https://www.exchangerate-api.com/).

---

## ⚙️ Tecnologías utilizadas

- Java 11 o superior  
- API pública de [ExchangeRate-API](https://www.exchangerate-api.com/)  
- Biblioteca externa [Gson](https://github.com/google/gson) para manejar JSON  

---

## 📦 Archivos principales

- `Principal.java`: Clase principal. Muestra el menú, recibe opciones y cantidades, y coordina el proceso de conversión.
- `Conversor.java`: Se encarga de conectarse a la API, extraer la tasa de cambio y calcular el resultado.
- `Conversion.java`: Guarda el resultado de la conversión (origen, destino, cantidad y resultado).
- `Moneda.java`: Guarda la respuesta JSON de la API con las tasas de cambio.

---

## 🔧 Requisitos previos

- Tener Java instalado (versión 11 o superior).
- Tener una cuenta gratuita en [exchangerate-api.com](https://www.exchangerate-api.com/) para obtener tu **API Key**.
- Agregar la biblioteca Gson a tu proyecto (`gson-2.x.jar` o similar).

---

## 🚀 Instrucciones para ejecutar

1. **Descarga o clona** este repositorio o los archivos `.java`.
2. **Agrega tu API Key** en el archivo `Main.java`, en la siguiente línea:

```java
String apiKey = "TU_API_KEY";
```

## 📋 Opciones disponibles en el menú
```java
1) Dólar =>> Peso argentino
2) Peso argentino =>> Dólar
3) Dólar =>> Real brasileño
4) Real brasileño =>> Dólar
5) Dólar =>> Peso mexicano
6) Peso mexicano =>> Dólar
7) Salir
```

## 👨‍💻 Autor
Este conversor fue desarrollado como parte de un reto educativo para practicar el uso de APIs y manejo de JSON  en Java.
