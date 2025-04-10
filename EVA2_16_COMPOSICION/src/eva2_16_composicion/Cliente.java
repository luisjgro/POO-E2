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
public class Cliente  {
   private String name;
   private String lname;
   private int edad;
   private DIreccion adress;//el cliente tiene una direccion

   public DIreccion getAdress() {
      return adress;
   }

   public void setAdress(DIreccion adress) {
      this.adress = adress;
   }

   public Cliente(String name, String lname, int edad) {
      this.name = name;
      this.lname = lname;
      this.edad = edad;
      this.adress=new DIreccion();
   }

   public Cliente() {
      this.name ="";
      this.lname = "";
      this.edad = 0;
      this.adress=new DIreccion();
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getLname() {
      return lname;
   }

   public void setLname(String lname) {
      this.lname = lname;
   }

   public int getEdad() {
      return edad;
   }

   public void setEdad(int edad) {
      this.edad = edad;
   }
   
   
}
