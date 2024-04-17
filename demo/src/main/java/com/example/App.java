package com.example;

import java.net.*;
import java.util.Scanner;
import java.io.*;
import com.google.gson.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner options = new Scanner(System.in);
        float amount = 0;
        String menu = "1. EUR a USD\n2. BOB a USD\n3. ARS a USD\n4. BRL a USD\n5. CLP a USD\n6. PEN a USD\n7. MXN a USD\n8. Salir\n";
        System.out.println(menu);
        int option = options.nextInt();
        while (option != 8 && option > 0) {
            switch (option) {
                case 1:
                    System.out.println("\nConversión de EUR a USD");
                    System.out.print("Ingrese la cantidad a convertir:");
                    amount = options.nextFloat();
                    URL url = new URL(
                            "https://v6.exchangerate-api.com/v6/ce02ecbd19ba9f0680ac34e6/pair/EUR/USD/"
                                    + amount);

                    HttpURLConnection con = (HttpURLConnection) url.openConnection();
                    con.setRequestMethod("GET");
                    con.setRequestProperty("Content-Type", "application/json");

                    int status = con.getResponseCode();
                    if (status == 200) {
                        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                        String inputLine;
                        StringBuilder response = new StringBuilder();
                        while ((inputLine = in.readLine()) != null) {
                            response.append(inputLine);
                        }
                        in.close();

                        JsonObject jsonObject = JsonParser.parseString(response.toString()).getAsJsonObject();
                        if (jsonObject.get("result").getAsString().equals("success")) {
                            float conversionResult = jsonObject.get("conversion_result").getAsFloat();
                            System.out.println(amount + " EUR a USD es: " + conversionResult + "\n");
                        } else {
                            System.out.println("Error en la conversión");
                        }
                    } else {
                        System.out.println("Error en la conexión");
                    }

                    break;
                case 2:
                    System.out.println("\nConversión de BOB a USD");
                    System.out.print("Ingrese la cantidad a convertir:");
                    amount = options.nextFloat();
                    URL url2 = new URL(
                            "https://v6.exchangerate-api.com/v6/ce02ecbd19ba9f0680ac34e6/pair/BOB/USD/"
                                    + amount);
                    HttpURLConnection con2 = (HttpURLConnection) url2.openConnection();
                    con2.setRequestMethod("GET");
                    con2.setRequestProperty("Content-Type", "application/json");
                    int status2 = con2.getResponseCode();
                    if (status2 == 200) {
                        BufferedReader in = new BufferedReader(new InputStreamReader(con2.getInputStream()));
                        String inputLine;
                        StringBuilder response = new StringBuilder();
                        while ((inputLine = in.readLine()) != null) {
                            response.append(inputLine);
                        }
                        in.close();
                        JsonObject jsonObject = JsonParser.parseString(response.toString()).getAsJsonObject();
                        if (jsonObject.get("result").getAsString().equals("success")) {
                            float conversionResult = jsonObject.get("conversion_result").getAsFloat();
                            System.out.println(amount + " BOB a USD es: " + conversionResult + "\n");
                        } else {
                            System.out.println("Error en la conversión");
                        }
                    } else {
                        System.out.println("Error en la llamada");
                    }
                    break;
                case 3:
                    System.out.println("\nConversión de ARS a USD");
                    System.out.print("Ingrese la cantidad a convertir:");
                    amount = options.nextFloat();
                    URL url3 = new URL(
                            "https://v6.exchangerate-api.com/v6/ce02ecbd19ba9f0680ac34e6/pair/ARS/USD/"
                                    + amount);
                    HttpURLConnection con3 = (HttpURLConnection) url3.openConnection();
                    con3.setRequestMethod("GET");
                    con3.setRequestProperty("Content-Type", "application/json");
                    int status3 = con3.getResponseCode();
                    if (status3 == 200) {
                        BufferedReader in = new BufferedReader(new InputStreamReader(con3.getInputStream()));
                        String inputLine;
                        StringBuilder response = new StringBuilder();
                        while ((inputLine = in.readLine()) != null) {
                            response.append(inputLine);
                        }
                        in.close();
                        JsonObject jsonObject = JsonParser.parseString(response.toString()).getAsJsonObject();
                        if (jsonObject.get("result").getAsString().equals("success")) {
                            float conversionResult = jsonObject.get("conversion_result").getAsFloat();
                            System.out.println(amount + " ARS a USD es: " + conversionResult + "\n");
                        } else {
                            System.out.println("Error en la conversión");
                        }
                    } else {
                        System.out.println("Error en la llamada");
                    }
                    break;

                case 4:
                    System.out.println("\nConversión de BRL a USD");
                    System.out.print("Ingrese la cantidad a convertir:");
                    amount = options.nextFloat();
                    URL url4 = new URL(
                            "https://v6.exchangerate-api.com/v6/ce02ecbd19ba9f0680ac34e6/pair/BRL/USD/"
                                    + amount);
                    HttpURLConnection con4 = (HttpURLConnection) url4.openConnection();
                    con4.setRequestMethod("GET");
                    con4.setRequestProperty("Content-Type", "application/json");
                    int status4 = con4.getResponseCode();
                    if (status4 == 200) {
                        BufferedReader in = new BufferedReader(new InputStreamReader(con4.getInputStream()));
                        String inputLine;
                        StringBuilder response = new StringBuilder();
                        while ((inputLine = in.readLine()) != null) {
                            response.append(inputLine);
                        }
                        in.close();
                        JsonObject jsonObject = JsonParser.parseString(response.toString()).getAsJsonObject();
                        if (jsonObject.get("result").getAsString().equals("success")) {
                            float conversionResult = jsonObject.get("conversion_result").getAsFloat();
                            System.out.println(amount + " BRL a USD es: " + conversionResult + "\n");
                        } else {
                            System.out.println("Error en la conversión");
                        }
                    } else {
                        System.out.println("Error en la llamada");
                    }
                    break;

                case 5:
                    System.out.println("\nConversión de CLP a USD");
                    System.out.print("Ingrese la cantidad a convertir:");
                    amount = options.nextFloat();
                    URL url5 = new URL(
                            "https://v6.exchangerate-api.com/v6/ce02ecbd19ba9f0680ac34e6/pair/CLP/USD/"
                                    + amount);
                    HttpURLConnection con5 = (HttpURLConnection) url5.openConnection();
                    con5.setRequestMethod("GET");
                    con5.setRequestProperty("Content-Type", "application/json");
                    int status5 = con5.getResponseCode();
                    if (status5 == 200) {
                        BufferedReader in = new BufferedReader(new InputStreamReader(con5.getInputStream()));
                        String inputLine;
                        StringBuilder response = new StringBuilder();
                        while ((inputLine = in.readLine()) != null) {
                            response.append(inputLine);
                        }
                        in.close();
                        JsonObject jsonObject = JsonParser.parseString(response.toString()).getAsJsonObject();
                        if (jsonObject.get("result").getAsString().equals("success")) {
                            float conversionResult = jsonObject.get("conversion_result").getAsFloat();
                            System.out.println(amount + " CLP a USD es: " + conversionResult + "\n");
                        } else {
                            System.out.println("Error en la conversión");
                        }
                    } else {
                        System.out.println("Error en la llamada");
                    }
                    break;

                case 6:
                    System.out.println("\nConversión de PEN a USD");
                    System.out.print("Ingrese la cantidad a convertir:");
                    amount = options.nextFloat();
                    URL url6 = new URL(
                            "https://v6.exchangerate-api.com/v6/ce02ecbd19ba9f0680ac34e6/pair/PEN/USD/"
                                    + amount);
                    HttpURLConnection con6 = (HttpURLConnection) url6.openConnection();
                    con6.setRequestMethod("GET");
                    con6.setRequestProperty("Content-Type", "application/json");
                    int status6 = con6.getResponseCode();
                    if (status6 == 200) {
                        BufferedReader in = new BufferedReader(new InputStreamReader(con6.getInputStream()));
                        String inputLine;
                        StringBuilder response = new StringBuilder();
                        while ((inputLine = in.readLine()) != null) {
                            response.append(inputLine);
                        }
                        in.close();
                        JsonObject jsonObject = JsonParser.parseString(response.toString()).getAsJsonObject();
                        if (jsonObject.get("result").getAsString().equals("success")) {
                            float conversionResult = jsonObject.get("conversion_result").getAsFloat();
                            System.out.println(amount + " PEN a USD es: " + conversionResult + "\n");
                        } else {
                            System.out.println("Error en la conversión");
                        }
                    } else {
                        System.out.println("Error en la llamada");
                    }
                    break;
                case 7:
                    System.out.println("\nConversión de MXN a USD");
                    System.out.print("Ingrese la cantidad a convertir:");
                    amount = options.nextFloat();
                    URL url7 = new URL(
                            "https://v6.exchangerate-api.com/v6/ce02ecbd19ba9f0680ac34e6/pair/MXN/USD/"
                                    + amount);
                    HttpURLConnection con7 = (HttpURLConnection) url7.openConnection();
                    con7.setRequestMethod("GET");
                    con7.setRequestProperty("Content-Type", "application/json");
                    int status7 = con7.getResponseCode();
                    if (status7 == 200) {
                        BufferedReader in = new BufferedReader(new InputStreamReader(con7.getInputStream()));
                        String inputLine;
                        StringBuilder response = new StringBuilder();
                        while ((inputLine = in.readLine()) != null) {
                            response.append(inputLine);
                        }
                        in.close();
                        JsonObject jsonObject = JsonParser.parseString(response.toString()).getAsJsonObject();
                        if (jsonObject.get("result").getAsString().equals("success")) {
                            float conversionResult = jsonObject.get("conversion_result").getAsFloat();
                            System.out.println(amount + " MXN a USD es: " + conversionResult + "\n");
                        } else {
                            System.out.println("Error en la conversión");
                        }
                    } else {
                        System.out.println("Error en la llamada");
                    }
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }

            System.out.println(menu);
            option = options.nextInt();
        }
        System.out.println("Saliendo del sistema...");
        options.close();
    }
}
