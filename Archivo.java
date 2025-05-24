/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author osval
 */
public class Archivo {

    private static final String RUTA = "vehiculos.txt";

    /**
     * Guarda una línea en el archivo y muestra mensaje de éxito/error
     */
        public void guardar(Vehiculo vehiculo, String rutaArchivo) {

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
                bw.write(vehiculo.obtenerDatos()); // usamos el método que devuelve los datos
                bw.newLine();
                bw.newLine(); // separación
            } catch (IOException e) {
                System.out.println("Error al guardar: " + e.getMessage());
            }
        }
        
        public String leer(String rutaArchivo) {
        StringBuilder contenido = new StringBuilder();
        
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                contenido.append(linea).append("\n");
            }
        } catch (IOException e) {
            return "Error al leer el archivo: " + e.getMessage();
        }
        
        return contenido.toString();
    }
}
