/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author osval
 */
public class Vehiculo { // Clase madre
    // A T R I B U T O S
    private String marca;
    private String modelo;
    private int year;
    double precio;
    boolean transmision;
    
    // M E T O D O S __ C O N S T R U C T O R E S
    // Default
    public Vehiculo(){ 
        marca = "Nissan";
        modelo = "Altima";
        year = 2006;
        precio = 130000.00;
        transmision = true;
    }
    
    // Con parametros
    public Vehiculo(String marca, String modelo, int year, double precio, boolean transmision){
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.precio = precio;
        this.transmision = transmision;
    }
    
    // G E T S_Y_S E T S

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isTransmision() {
        return transmision;
    }

    public void setTransmision(boolean transmision) {
        this.transmision = transmision;
    }
    
    public String obtenerDatos(){
        return "Marca: " + marca + "\n" 
               + "Modelo: " + modelo + "\n" 
               + "Año: " + year + "\n" 
               + "Precio: " + precio + "\n"
               + "Transmision: " + (transmision ? "Automatica" : "Estandar");
    }
    
    public void actualizarDatos(String marca, String modelo, int year, double precio, boolean transmision){
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.precio = precio;
        this.transmision = transmision;
    }
}
