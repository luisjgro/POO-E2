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
public class Motor {
   private int type_motor;
   private int power;

   public Motor(int type_motor, int power) {
      this.type_motor = type_motor;
      this.power = power;
   }

   public Motor() {
       this.type_motor = 0;
      this.power = 0;
   }

   public int getType_motor() {
      return type_motor;
   }

   public void setType_motor(int type_motor) {
      this.type_motor = type_motor;
   }

   public int getPower() {
      return power;
   }

   public void setPower(int power) {
      this.power = power;
   }
   
   
   
}
