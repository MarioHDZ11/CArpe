/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author osval
 */
public class Trailer extends Vehiculo {
    // Atributos
    private int carga;
    private short numEjes;
    //Metodos
    public Trailer(){
        super();
        carga = 850;
        numEjes = 3;
    }
    
    public Trailer(String marca, String modelo, int year, double precio, boolean transmision,
                          int carga, short numEjes){
        super(marca, modelo, year, precio, transmision);
        this.carga = carga;
        this.numEjes = numEjes;
    }
    
    //Getters y setters

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public short getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(short numEjes) {
        this.numEjes = numEjes;
    }
    
    public String obtenerDatos(){
        return super.obtenerDatos() + "\n" +
               "Carga: " + carga + "kg" +  "\n" + 
               "Ejes: " + numEjes;
    }
    
    public void actualizarDatos(int carga, short numEjes){
        this.carga = carga;
        this.numEjes = numEjes;
    }
}
