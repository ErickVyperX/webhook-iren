package org.recordatory.iren;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.FileWriter;
import java.io.BufferedWriter;

public class Main {
    public static void main(String[] args) {
        // Leer la entrada del usuario desde la consola
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder input = new StringBuilder();

        try {
            String line;
            while ((line = reader.readLine()) != null) {
                input.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Convertir la entrada JSON en un objeto Java
        String jsonData = input.toString();
        // Procesar el evento como desees, por ejemplo, guardarlo en un archivo
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt", true));
            writer.append(jsonData);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
