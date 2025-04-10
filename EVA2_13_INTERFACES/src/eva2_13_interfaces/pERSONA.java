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
public class pERSONA  {
   private String name;
   private String l_name;

   public pERSONA(String name, String l_name) {
      this.name = name;
      this.l_name = l_name;
   }
   public pERSONA() {
      this.name = "--";
      this.l_name = "--";
   }
   

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getL_name() {
      return l_name;
   }

   public void setL_name(String l_name) {
      this.l_name = l_name;
   }

  
}
