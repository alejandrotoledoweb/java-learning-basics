public class CocheMain {

    public static void main(String[] args) {

        String coche = "alfa romero";
        Coche cocheObj = new Coche("rojo", "honda", "civic", 1430.45, 5.4);
        Coche cocheObj2 = new Coche();
        cocheObj.acelerar(45);

        System.out.println(cocheObj);
        System.out.println(cocheObj2);
        cocheObj.color = "azul";
        System.out.println(cocheObj);



        CocheElectrico cocheElectrico = new CocheElectrico("Ejemplo motor");

        cocheElectrico.motorElectrico = "Ejemplo motor";
        cocheElectrico.color = "verde";
        cocheElectrico.fabricante = "Honda";
        cocheElectrico.modelo = "civic";

        CocheElectrico cocheElectrico2 = new CocheElectrico("azul", "alfa " +
                "romero", "js2", 1400d, 4.54, "TXZ");


        System.out.println(cocheElectrico2);

        cocheElectrico2.acelerar(50);
        System.out.println(cocheElectrico2);

    }
}
