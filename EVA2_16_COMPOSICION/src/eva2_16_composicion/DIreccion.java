/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_16_composicion;

/**
 *
 * @author invitado
 */
public class DIreccion  {
   private String street;
   private int number;
   private String colonia;

   public DIreccion(String street, int number, String colonia) {
      this.street = street;
      this.number = number;
      this.colonia = colonia;
   }

   public DIreccion() {
      this.street = "";
      this.number = 0;
      this.colonia = "";
   }

   public String getStreet() {
      return street;
   }

   public void setStreet(String street) {
      this.street = street;
   }

   public int getNumber() {
      return number;
   }

   public void setNumber(int number) {
      this.number = number;
   }

   public String getColonia() {
      return colonia;
   }

   public void setColonia(String colonia) {
      this.colonia = colonia;
   }
   
   
}
