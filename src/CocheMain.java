public class CocheMain {

    public static void main(String[] args) {

        String coche = "alfa romero";
        Coche cocheObj = new Coche("rojo", "honda", "civic", 1430.45, 5.4);

        cocheObj.acelerar(45);

        System.out.println(cocheObj);
        cocheObj.color = "azul";
        System.out.println(cocheObj);

    }
}
