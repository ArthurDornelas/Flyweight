package padrao.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Computador> computadores = new ArrayList<>();

    public void adicionar(String nomeComputador, String serial, String marca, String processador, String gpu) {
        Modelo modelo = ModeloFactory.getModelo(serial, marca, processador, gpu);
        Computador computador = new Computador(nomeComputador, modelo);
        computadores.add(computador);
    }

    public List<String> obterComputadores() {
        List<String> saida = new ArrayList<String>();
        for (Computador computador : this.computadores) {
            saida.add(computador.obterComputador());
        }
        return saida;
    }
}
