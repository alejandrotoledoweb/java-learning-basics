public class Funciones {

  public static void main(String[] args) {

    holaMundo();
    holaMundoConNombre("Alex");
    holaMundoConNombre("Donatelo");

    String saludo = devolverHello();
    System.out.println(saludo);
  }

  private static void holaMundo() {
    System.out.println("Hola mundo desde private");
  }
  private static void holaMundoConNombre(String name) {
    System.out.println("Hola " + name);
  }

  private static String devolverHello() {
    return "Hello";
  }
}
