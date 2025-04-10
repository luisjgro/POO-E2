package eva2_3;

public class EVA2_3 {

   public static void main(String[] args) {
      Empleado empleado = new Empleado();
      Provedor prov = new Provedor();
      Cliente cliente = new Cliente();
      empleado.setNombre("Pedro Pica Piedra");
      System.out.println("Empleado: " + empleado.getNombre());
      empleado.setNumEmp(100);
      System.out.println("Numero de empleado: " + empleado.getNumEmp());
      System.out.println("-------");
      prov.setNombre("Walmart");
      System.out.println("Nombre: " + prov.getNombre());
      prov.setCredito(false);
      System.out.println("Credito: " + prov.getCredito());
      System.out.println("-------");
      cliente.setNombre("Luisito");
      System.out.println("Nombre: " + cliente.getNombre());
      cliente.setRazon("Fisica");
      System.out.println("Razón social: " + cliente.getRazon());
   }}