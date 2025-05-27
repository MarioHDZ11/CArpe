/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.io.*;
import java.nio.file.Files;
import java.util.*;
import java.nio.file.*;

/**
 *
 * @author osval
 */
public class Archivo {

    private static final String ruta = "vehiculos.txt";

    public void guardarLinea(String linea, String ruta) throws IOException {
        Files.write(Paths.get(ruta), (linea + System.lineSeparator()).getBytes(),
           StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }

    public String leerTodo(String ruta) throws IOException {
        if (!Files.exists(Paths.get(ruta))) {
            return "";
        }
        return new String(Files.readAllBytes(Paths.get(ruta))).trim();
    }

    private Vehiculo convertirLineaAVehiculo(String linea) {
        String[] p = linea.split("\\|");
        if (p.length < 6) {
            return null;
        }

        String tipo = p[0];
        String marca = p[1];
        String modelo = p[2];
        int year = Integer.parseInt(p[3]);
        double precio = Double.parseDouble(p[4]);
        boolean transmision = Boolean.parseBoolean(p[5]);

        switch (tipo) {
            case "Carro":
                int puertas = Integer.parseInt(p[6]);
                String combustible = p[7];
                boolean electrico = Boolean.parseBoolean(p[8]);
                return new Carro(marca, modelo, year, precio, transmision,
                   (short) puertas, combustible, electrico);

            case "Moto":
                String tipoMoto = p[6];
                int cilindraje = Integer.parseInt(p[7]);
                return new Moto(marca, modelo, year, precio, transmision,
                   tipoMoto, cilindraje);

            case "Trailer":
                int carga = Integer.parseInt(p[6]);
                short ejes = Short.parseShort(p[7]);
                return new Trailer(marca, modelo, year, precio, transmision,
                   carga, ejes);

            default:
                return null;
        }
    }

    public boolean eliminarVehiculo(String marca, String modelo, String ruta) throws IOException {
        Path original = Paths.get(ruta);
        if (!Files.exists(original)) {
            return false;
        }

        List<String> lineas = Files.readAllLines(original);
        List<String> nuevasLineas = new ArrayList<>();

        boolean enBloque = false;
        boolean matchBloque = false;
        boolean eliminado = false;

        for (String l : lineas) {
            if (l.startsWith("Marca: ")) { 
                enBloque = true;
                matchBloque = l.contains("Marca: " + marca);
            }

            if (enBloque && l.startsWith("Modelo: ")) {
                matchBloque = matchBloque && l.contains("Modelo: " + modelo);
            }

            if (l.equals("---")) {    
                if (!matchBloque) {
                    nuevasLineas.add(l); 
                }
                enBloque = false;
                matchBloque = false;
                continue;
            }

            if (!enBloque || !matchBloque) {
                nuevasLineas.add(l);
            } else {
                eliminado = true;    
            }
        }

        Files.write(original, nuevasLineas);
        return eliminado;
    }
}

