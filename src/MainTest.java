import flyweight.ArbolFactory;
import main.Arbol;

public class MainTest {
    public static void main(String[] args) {

        ArbolFactory flyweight = new ArbolFactory();

        Arbol pino = flyweight.obtenerOCrearBosque(14.2, 25.3, "Verde");
        Arbol arceReal = flyweight.obtenerOCrearBosque(12.8, 47.8,  "Rojo");
        Arbol haya = flyweight.obtenerOCrearBosque(26.4, 32.1, "Rojo");
        Arbol nigra = flyweight.obtenerOCrearBosque(26.4, 32.1, "Rojo");
        Arbol eucalipto = flyweight.obtenerOCrearBosque(12.8, 47.8, "Verde");



        System.out.println(pino.toString());
        System.out.println(arceReal.toString());
        System.out.println(haya.toString());
        System.out.println(nigra.toString());
        System.out.println(eucalipto.toString());

    }
}