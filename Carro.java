/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author osval
 */
public class Carro extends Vehiculo {
    // A T R I B U T O S
    private short puertas;   
    private String combustible;
    private boolean electrico;
    
    // M E T O D O S
    
    // Constructor default
    public Carro(){
        super();
        puertas = 4;
        combustible = "Gasolina"; // Disel
        electrico = true;
    }
    
    // Con parametros
    public Carro(String marca, String modelo, int year, double precio, boolean transmision,
                        short puertas, String combustible, boolean electrico){
        
        super(marca, modelo, year, precio, transmision);
        this.puertas = puertas;
        this.combustible = combustible;
        this.electrico = electrico;
    }
    
    //Getters and Setters
    public short getPuertas() {
        return puertas;
    }

    public void setPuertas(short puertas) {
        this.puertas = puertas;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public boolean isElectrico() {
        return electrico;
    }

    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }
    
    public String obtnerDatos(){
        
        return super.obtenerDatos() + "\n" + 
               "Puertas: " + puertas + "\n" +
               "Combustible: " + combustible + "\n" +
               "Electrico: " + (electrico ? "Si" : "No");
    }
    
    public void actualizarDatos(short puertas, String combustible, boolean transmision){
        this.puertas = puertas;
        this.combustible = combustible;
        this.electrico = electrico;
    }
    
}
