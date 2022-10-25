package flyweight;

import main.Arbol;

import java.util.HashMap;
import java.util.Map;

public class ArbolFactory {

    Map<String, Arbol> arbolMap = new HashMap<>();

    public Arbol obtenerOCrearBosque(double alto, double ancho, String color) {

        String key = "key: " + alto + "|" + ancho + "|" + color;

        if (!arbolMap.containsKey(key)) {
            //Si no existe se crea la instacia
            Arbol arbol = new Arbol(alto, ancho, color);
            //La guardo
            arbolMap.put(key, arbol);
            System.out.println("Arbol Creado");
            //Devuelvo algo
            return arbolMap.get(key);
        } else {
            //retornar el mismo arbol que ya existe...
            System.out.println("Arbol obtenido");
            return arbolMap.get(key);
        }
    }
}
