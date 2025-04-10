/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_22_instance_of;

/**
 *
 * @author invitado
 */
public class EVA2_22_INSTANCE_OF {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      
      Gato cat= new Gato();
      Serpiente serpetin= new Serpiente();
      
      
      
     public static void imprimir (Animal lepes){
         
      }
             
      
      
      
      
      
      
   }
   
   
   
}

class Animal{
public Animal(){
   System.out.println("Animal");
   
   
}

public void respirarOxigeno(){
   System.out.println("Rspirar oxigeno");
}
}

class Mamifero extends Animal{
public Mamifero(){
   System.out.println("Mamifero");
}
public void tenerPelo(){
   System.out.println("Tener Pelo");
}
public void tenerSangreCaliente(){
   System.out.println("Tener Sangre Caliente");
}
}

class Reptil extends Animal{
   public Reptil(){
      System.out.println("Reptil");
   }
   public void tenerSangreFria(){
      System.out.println("Tener sangre fria ");
   }
}

class Gato extends Mamifero{
   public Gato(){
      System.out.println("Gato");
   }
   public void tenerGarrasRetractiles(){
      System.out.println("Tener Garras Retractiles");
      
   }
}

class Serpiente extends Reptil{
   public Serpiente(){
      System.out.println("Serpiente");
   }
   
   public void seArrastra(){
      System.out.println("Se Arrastra");
   }
}
