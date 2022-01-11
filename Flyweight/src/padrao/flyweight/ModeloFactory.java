package padrao.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ModeloFactory {
    private static Map<String, Modelo> modelos = new HashMap<>();

    public static Modelo getModelo(String serial, String marca, String processador, String gpu) {
        Modelo modelo = modelos.get(serial);
        if (modelo == null) {
            modelo = new Modelo(serial, marca, processador, gpu);
            modelos.put(serial, modelo);
        }
        return modelo;
    }

    public static int getTotalModelos() {
        return modelos.size();
    }
}
