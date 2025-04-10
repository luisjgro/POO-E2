package eva2_3;

public class EmpleadoTemporal extends Empleado{
   private int NumContra;
   private int horas;

   public EmpleadoTemporal(int NumContra, int horas) {
      this.NumContra = NumContra;
      this.horas = horas;
   }
   
   public EmpleadoTemporal(){
      NumContra = 0;
      horas = 0;
   }

   public int getNumContra() {
      return NumContra;
   }

   public void setNumContra(int NumContra) {
      this.NumContra = NumContra;
   }

   public int getHoras() {
      return horas;
   }

   public void setHoras(int horas) {
      this.horas = horas;
   }
   
}
