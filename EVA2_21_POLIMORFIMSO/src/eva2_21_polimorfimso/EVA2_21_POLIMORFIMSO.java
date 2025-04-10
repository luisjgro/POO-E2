/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_21_polimorfimso;

/**
 *
 * @author invitado
 */
public class EVA2_21_POLIMORFIMSO {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      System.out.println("OBJETO SERPIENTE");
      Serpiente serp= new Serpiente();
      serp.respirarOxigeno(); //ANIMAL
      serp.tenerSangreFria();//Reptil
      serp.seArrastra();//Serpiente
      
      System.out.println(" ");
      System.out.println(" ");
      System.out.println(" ");
      System.out.println(" ");
      System.out.println("OBJETO GATO");
      Gato cat= new Gato();
      cat.respirarOxigeno();//ANIMAL
      cat.tenerPelo();//MAMIFERO
      cat.tenerSangreCaliente();//MAMIFERO
      cat.tenerGarrasRetractiles();//GATO
      System.out.println(" ");
      System.out.println(" ");
      System.out.println(" ");
      System.out.println("Polimorfismo:");
      Reptil reptil=new Serpiente();
      reptil.respirarOxigeno();
      reptil.tenerSangreFria();
      
      Serpiente serp2=(Serpiente)reptil;
      serp2.respirarOxigeno();
      serp2.tenerSangreFria();
      serp2.seArrastra();
      System.out.println(" ");
      System.out.println(" ");
      System.out.println(" ");
      System.out.println("Objeto de tipo Serpiente");
      Animal animal= new Serpiente();
      System.out.println(" ");
      System.out.println(" ");
      System.out.println(" ");
      System.out.println("Polimorfismo fallido:");
     // Serpiente sep= new Animal();//animal no es una serpiente menso
      
      
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