package eva2_7;

public class EVA2_7 {

   public static void main(String[] args) {
      Empleado emp = new Empleado("Luis", "Guerrero", 2000);
      EmpleadoBase EmpBase = new EmpleadoBase("E42DMM", 30.0, 2000);
      System.out.println(EmpBase.calcularSalario());
   }
   
}
