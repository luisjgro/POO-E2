/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_10_figuras;

/**
 *
 * @author invitado
 */
public class Circulo extends Figuras{
   private double radio;

   public Circulo(double radio) {
      this.radio = radio;
   }
   public Circulo() {
      this.radio = 1;
   }

   public double getRadio() {
      return radio;
   }

   public void setRadio(double radio) {
      this.radio = radio;
   }

   @Override
   public double calcularArea() {
     return Math.PI*(radio*radio);
   }

   @Override
   public double calcularPerimetro() {
      return 2*Math.PI*radio;
   }
   
   public void imprimirDatos(){
      System.out.println("Area: "+calcularArea());
      System.out.println("Perimetro: "+calcularPerimetro());
   }
   
   
   
}
