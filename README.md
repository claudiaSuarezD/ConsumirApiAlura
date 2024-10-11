# ConsumirApiAlura

## Objetivo

Aprender a consumir una API desde el lenguaje java mediante la actividad conversión de moneda. 

## Conversor de Monedas

Esta es una aplicación de consola en Java que permite convertir entre diferentes monedas utilizando la API de ExchangeRate-API.

## Características 

- Conversión de moneda a otra moneda de acuerdo a su taza de cambio. Las principales monedas utilizadas son: 

-- Dolar (USD) 
-- Pesos Argentinos (ARS)
-- Real Brasileño (BRL)
-- Pesos Colombianos (COP)

- Las conversiones se guardan en un archivo.json
- Manejo de errores de entrada.

## Estructura del Proyecto

- En la carpeta src consiste de 5 clases las cuales se subdivide la actividad.

- `Main.java`: Punto de entrada de la aplicación.
- `ConversorMonedas.java`: Clase que representa los atributos y metodos del conversor de moneda.
- `ConsultarApi.java`: Clase que recibe los parametros para realizar la consulta de la tasa de conversión desde la API .
- `Conversor.java`: Clase record que representa la tasa de conversión que permite la comunicacion entre la clase y la API en sus atributos.
- `GenerarArchivo.java`: Clase que guarda las conversiones en un archivo JSON.

## Entorno de desarrollo

- Intellij IDEA 

## Tecnologías utilizadas

**Java**: Lenguaje de programación
- jdk 17: Descárgalo [Instalacion JDK java](https://download.oracle.com/java/17/latest/jdk-17_windows-x64_bin.exe ( sha256)).

**Gson**: Biblioteca para manejar JSON
- Jar version 2.11.0 [jar gson](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.11.0).

## Uso
- Inicia en la clase principal Main y ejecuta el programa
- En la consola aparecera un menú
- Selecciona una opción del menú que usted desea ingresar
- Una vez ingresado en la opción registre la cantidad que desea convertir
- El programa mostrar el resultado de la conversión  y continuara de nuevo con el menú
- Finalice el programa con la opción de menu salir.
- Al finalizar el programa guardara la información en un archivo gson.

## Agradecimiento

Alura Latam por brindar este proceso de aprendizaje. 
