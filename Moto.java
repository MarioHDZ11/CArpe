/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author osval
 */
public class Moto extends Vehiculo{
    // A T R I B U T O S
    private String tipo;
    private int cilindraje;
    
    // M E T O D O S
    // Constructor sin parametros
    public Moto(){
        super();
        tipo = "Deportiva";
        cilindraje = 650;
    }
    
    public Moto(String marca, String modelo, int year, double precio, boolean transmision,
                       String tipo, int cilindraje){
        super(marca, modelo, year, precio, transmision);
        this.tipo = tipo;
        this.cilindraje = cilindraje;
    }
    
    // Getters y Setters
    public String getTipo(){
        return tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public int getCilindraje(){
        return cilindraje;
    }
    
    public void setCilindraje(int cilindraje){
        this.cilindraje = cilindraje;
    }
    
    public String obtenerDatos(){
   
        return super.obtenerDatos() + "\n" +
               "Tipo: " + tipo + "\n" +
               "Cilindraje: " + cilindraje;
    }
    
    public void actualizarDatos(String tipo, int cilindraje){
        this.tipo = tipo;
        this.cilindraje = cilindraje;
    }
}
