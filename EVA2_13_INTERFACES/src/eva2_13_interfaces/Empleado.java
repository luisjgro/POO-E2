/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_13_interfaces;

/**
 *
 * @author invitado
 */
public class Empleado extends pERSONA implements MostrarDatos{
   private String clave;

   public Empleado(String clave, String name, String l_name) {
      super(name, l_name);
      this.clave = clave;
   }

   public Empleado() {
      super();
      this.clave = "--";
      
   }

   public String getClave() {
      return clave;
   }

   public void setClave(String clave) {
      this.clave = clave;
   }

   @Override
   public void imrprimirDatos() {
      System.out.println("Nombre: "+getName());
      System.out.println("Nombre: "+getL_name());
      System.out.println("Nombre: "+getClave());
   }
   
}
