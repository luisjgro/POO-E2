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
public class EVA2_20_VEHICULO {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Vehiculo car=new Vehiculo();
      car.setMarca("Ford");
      car.setModelo("Mustang");
      car.setYear(2018);
      MotorGasolina mypower= new MotorGasolina();
      car.setMotor(mypower);
      System.out.println(car);
   }
   
}
