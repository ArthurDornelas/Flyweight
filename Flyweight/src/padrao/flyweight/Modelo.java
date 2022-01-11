package padrao.flyweight;

public class Modelo {
    private String serial;
    private String marca;
    private String processador;
    private String gpu;

    public Modelo(String serial, String marca, String processador, String gpu) {
        this.serial = serial;
        this.marca = marca;
        this.processador = processador;
        this.gpu = gpu;
    }

    public String getSerial() {
        return serial;
    }

    public String getMarca() {
        return marca;
    }

    public String getProcessador() {
        return processador;
    }

    public String getGpu() {
        return gpu;
    }
}
