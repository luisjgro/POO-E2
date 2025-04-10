/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_12_final;

/**
 *
 * @author invitado
 */
public class EVA2_12_FINAL {
final static int VALOR=100;
   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      
      //FINAL ES UNA PALABRA RESERVADA
      //Constante: solo se puede usar una vez
      //VALOR=30; no se puede modificar
      Docente docente=new Docente();//No impide crear objetos 
      
      
   }
   
}

class Persona{}
class Empleado extends Persona{}
final class Docente extends Empleado{}//La herencia se termina aqui
//--class DocenteKinder extends Docente{}-- No se puuede hederar