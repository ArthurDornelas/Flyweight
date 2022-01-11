package padrao.flyweight;

public class Computador {
    private String nome;
    private Modelo modelo;

    public Computador(String nome, Modelo modelo) {
        this.nome = nome;
        this.modelo = modelo;
    }

    public String obterComputador() {
        return "Computador{" +
                "nome='" + this.nome + '\'' +
                ", marca='" + modelo.getMarca() + '\''+
                ", processador='" + modelo.getProcessador() + '\''+
                ", gpu='" + modelo.getGpu() + '\''+
                '}';
    }

}
