/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_20_vehiculo;

/**
 *
 * @author invitado
 */
public class Vehiculo {
   private String marca;
   private String modelo;
   private int year;
   private Motor motor;

   public Vehiculo(String marca, String modelo, int year, Motor motor) {
      this.marca = marca;
      this.modelo = modelo;
      this.year = year;
      this.motor = motor;
   }

   public Vehiculo() {
   this.marca = "------";
      this.modelo = "------";
      this.year =0 ;
      this.motor = null ;
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

   public int getYear() {
      return year;
   }

   public void setYear(int year) {
      this.year = year;
   }

   public Motor getMotor() {
      return motor;
   }

   public void setMotor(Motor motor) {
      this.motor = motor;
   }
   
   @Override
   public String toString(){
      String cade ="Marca: "+ marca+ "\n"+
              "Modelo: "+ modelo+ "\n"+
              "Year: "+ year+ "\n"+
              "Motor: "+ motor.tipoMotor()+ "\n";
         return cade;     
   }
   
   
}
