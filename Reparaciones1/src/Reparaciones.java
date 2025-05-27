/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alexi
 */
public class Reparaciones {
   private String cliente;
   private String marca;
   private String modelo;
   private short year;
   private String tipoReparacion;
  private int fecha;
  
  public Reparaciones(){
     cliente = "Alexis";
     marca = "Chevrolet";
     modelo = "Malibu";
     year = 2010;
     tipoReparacion = "balanceo";
     fecha = 01/01/2025;
  }
  public Reparaciones(String cliente, String marca, String modelo, short year, String tipoReparacion, int fecha){
     this.cliente = cliente;
     this.marca = marca;
     this.modelo = modelo;
     this.year = year;
     this.tipoReparacion = tipoReparacion;
     this.fecha = fecha;
  }

   public String getCliente() {
      return cliente;
   }

   public void setCliente(String cliente) {
      this.cliente = cliente;
   }

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

   public short getYear() {
      return year;
   }

   public void setYear(short year) {
      this.year = year;
   }

   public String getTipoReparacion() {
      return tipoReparacion;
   }

   public void setTipoReparacion(String tipoReparacion) {
      this.tipoReparacion = tipoReparacion;
   }

   public int getFecha() {
      return fecha;
   }

   public void setFecha(int fecha) {
      this.fecha = fecha;
   }
  public void obtenerDatos(String cliente, String marca,String modelo, short year,int fecha){
     this.cliente = cliente;
     this.marca = marca;
     this.modelo = modelo;
     this.year = year;
     this.fecha = fecha;
  }
  public String obtenerDatos(){
     return "Cliente: " + cliente + "\n Marca: " + marca + "\n Modelo: " + modelo + "\n Año: " + year + "\n Fecha: " + fecha;
     
  }
}
