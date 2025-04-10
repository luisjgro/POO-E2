package eva2_7;

public class Empleado {
   private String nombre;
   private String apellido;
   private double salario;
   
public Empleado() {
      this.nombre = "Sin nombre";
      this.apellido = "Sin apellido";
      this.salario = 0.0;
   }

   public Empleado(String nombre, String apellido, double salario) {
      this.nombre = nombre;
      this.apellido = apellido;
      this.salario = salario;
   }
   
   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getApellido() {
      return apellido;
   }

   public void setApellido(String apellido) {
      this.apellido = apellido;
   }

   public double getSalario() {
      return salario;
   }

   public void setSalario(double salario) {
      this.salario = salario;
   }
   
   public double calcularSalario (){
      return salario;
   }
}
