package eva2_2_herencia;

public class Clientes {
   private String nombre;
   private String apellidoPaterno;
   private String apellidoMaterno;
   private int edad;
   private String rfc;
   
   public Clientes(){
      nombre = "Sin nombre";
      apellidoPaterno = "Sin apellido";
      apellidoMaterno = "Sin apellido";
      edad = 0;
      rfc = "Sin datos";
   }
   
   public Clientes(String nombre, String apellidoPaterno, String apellidoMaterno, int edad, String rfc){
      this.nombre = nombre;
      this.apellidoPaterno = apellidoPaterno;
      this.apellidoMaterno = apellidoMaterno;
      this.edad = edad;
      this.rfc = rfc;
   }
   
   public void setNombre(String nombre){
      this.nombre = nombre;
   }
   
   public String getNombre() {
      return nombre;
   }
   
   public void setApePat(String apellidoPaterno){
      this.apellidoPaterno = apellidoPaterno;
   }
   
   public String getApePat(){
      return apellidoPaterno;
   }
   
   public void setApeMat(String apellidoMaterno){
      this.apellidoMaterno = apellidoMaterno;
   }
   
   public String getApeMat(){
      return apellidoMaterno;
   }
   
   public void setEdad(int edad){
      this.edad = edad;
   }
   
   public int getEdad(){
      return edad;
   }
   
   public void setRFC(String rfc){
      this.rfc = rfc;
   }
   
   public String getRFC(){
      return rfc;
   }
   
}
