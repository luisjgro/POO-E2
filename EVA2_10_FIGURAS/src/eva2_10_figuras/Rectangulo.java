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
public class Rectangulo extends Figuras {
   private double base;
   private double height;

   public Rectangulo(double base, double height) {
      this.base = base;
      this.height = height;
   }
   public Rectangulo() {
      this.base = 1;
      this.height = 2;
   }

   public double getBase() {
      return base;
   }

   public void setBase(double base) {
      this.base = base;
   }

   public double getHeight() {
      return height;
   }

   public void setHeight(double height) {
      this.height = height;
   }

   @Override
   public double calcularArea() {
      return base*height;
   }

   @Override
   public double calcularPerimetro() {
      return (2*base)+(2*height);
   }
   
   public void imrpimirDatos(){
      System.out.println("Area: "+calcularArea());
      System.out.println("Perimetro: "+calcularPerimetro());
   }
   
   
}
