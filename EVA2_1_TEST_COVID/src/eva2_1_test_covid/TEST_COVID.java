/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_1_test_covid;

public class TEST_COVID {
   private int edad;
   private boolean enfermedad;
   private int peso;
   private double estatura;
   private double IMC;
   
   public TEST_COVID(){
   edad = 0;
   enfermedad = false;
   peso = 0;
   estatura = 0;
   }
   
   TEST_COVID(int edad, boolean enfermedad, int peso, double estatura){
      this.edad = edad;
      this.enfermedad = enfermedad;
      this.estatura = estatura;
      this.peso = peso;
   }
   
   public void setEdad(int edad){
      this.edad=edad;
   }
   
   public int getEdad (){
      return edad;
   }
   
   public void setEnfermedad(boolean enfermedad){
      this.enfermedad=enfermedad;
   }
   
   public boolean getEnfermedad (){
      return enfermedad;
   }
   
   public void setPeso(int peso){
      this.peso=peso;
   }
   
   public int getPeso (){
      return peso;
   }
   
   public void setEstatura(double estatura){
      this.estatura=estatura;
   }
   
   public double getEstatura (){
      return estatura;
   }
   
   private double calcularIMC (){
      return peso / (estatura * estatura);
   }
   
   public void calcularPersonaRiesgo(){
      double IMC = calcularIMC();
      System.out.println(IMC);
      if(edad >= 65 || enfermedad == true || IMC > 30){
         System.out.println("PERSONA DE RIESGO");
      }else{
         System.out.println("PERSONA SIN RIESGO");
      }
   }
}
