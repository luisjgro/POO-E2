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
public class EVA2_10_FIGURAS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Circulo bolitocha=new Circulo();//Declaramos objeo bolitocha default
      System.out.println(" ");
      System.out.println("Datos: ");
      System.out.println(" ");
      bolitocha.calcularArea();
      bolitocha.calcularPerimetro();
      bolitocha.imprimirDatos();
      
      Rectangulo Luis=new Rectangulo(2.54, 3.48);//Declaramos objeto luis con parametros
     
      System.out.println("---------");
      System.out.println(" ");
      System.out.println("Datos: ");
      System.out.println(" ");
      Luis.calcularArea();
      Luis.calcularPerimetro();
      Luis.imrpimirDatos();
      
   }
   
   
  
   
   
}
