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
public class EVA2_17_COMPOSICIONVEHICULO {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Car carro=new Car();
      
      System.out.println(carro);
      carro.setColor("Rojo");
      carro.setModel("Q5 2024");
      carro.setPrice(548655.12314);
      carro.setSignature("Audi");
      Motor chompa=new Motor(0, 200);
      carro.setChompa(chompa);
      
      System.out.println(carro);
   }
   
}
