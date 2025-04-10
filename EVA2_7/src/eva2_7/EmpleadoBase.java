package eva2_7;

public class EmpleadoBase extends Empleado{
   private String numEmp;
   private double bono;
   private double salario;

   public EmpleadoBase(String numEmp, double bono, double salario) {
      this.numEmp = numEmp;
      this.bono = bono;
      this.salario = salario;
   }

   public EmpleadoBase(){
      numEmp = "Sin numero";
      bono = 0;
   }
   
   public String getNumEmp() {
      return numEmp;
   }

   public void setNumEmp(String numEmp) {
      this.numEmp = numEmp;
   }

   public double getBono() {
      return bono;
   }

   public void setBono(double bono) {
      this.bono = bono;
   } 
   
   @Override
   public double calcularSalario(){
      return (getSalario() + ((bono /100.0) * getSalario()));
   }
}
