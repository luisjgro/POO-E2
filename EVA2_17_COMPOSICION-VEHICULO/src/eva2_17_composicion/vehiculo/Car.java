/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_17_composicion.vehiculo;

/**
 *
 * @author invitado
 */
public class Car {
   private String signature;
   private String model;
   private String color;
   private double price;
   private Motor chompa;

    public Car() {
       this.signature = "----";
      this.model = "---";
      this.color = "--";
      this.price = 0.0;
      this.chompa=new Motor();
   }

   public Car(String signature, String model, String color, double price) {
     
      this.signature = signature;
      this.model = model;
      this.color = color;
      this.price = price;
      this.chompa=new Motor();
   }

  
   public String getSignature() {
      return signature;
   }

   public void setSignature(String signature) {
      this.signature = signature;
   }

   public String getModel() {
      return model;
   }

   public void setModel(String model) {
      this.model = model;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public double getPrice() {
      return price;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   public Motor getChompa() {
      return chompa;
   }

   public void setChompa(Motor chompa) {
      this.chompa = chompa;
   }
   
   
   @Override
   public String toString(){
      return "Datos del Vehiculo: \n"+
             "Marca: "+ signature+ "\n"+
             "Modelo: "+ model+ "\n"+
             "Precio: "+ price+ "\n"+
             "Tipo de motor: "+ chompa.getType_motor()+ "\n"+
             "Potencia: "+ chompa.getPower()+ "\n";
              
   }
}
