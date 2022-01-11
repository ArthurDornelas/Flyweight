package test;

import org.junit.jupiter.api.Test;
import padrao.flyweight.Loja;
import padrao.flyweight.ModeloFactory;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class LojaTest {
    @Test
    void deveRetornarAlunos() {
        Loja loja = new Loja();
        loja.adicionar("Strike", "1", "Dell", "i3", "1070");
        loja.adicionar("Force", "2", "Asus","i5", "1080");
        loja.adicionar("Gaming", "3", "Dell","i7", "3070");
        loja.adicionar("Work", "2", "Asus","i5", "1080");

        List<String> saida = Arrays.asList(
                "Computador{nome='Strike', marca='Dell', processador='i3', gpu='1070'}",
                "Computador{nome='Force', marca='Asus', processador='i5', gpu='1080'}",
                "Computador{nome='Gaming', marca='Dell', processador='i7', gpu='3070'}",
                "Computador{nome='Force', marca='Asus', processador='i5', gpu='1080'}");

        assertEquals(saida, loja.obterComputadores());
    }

    @Test
    void deveRetornarTotalCidades() {
        Loja loja = new Loja();
        loja.adicionar("Strike", "1", "Dell", "i3", "1070");
        loja.adicionar("Force", "2", "Asus","i5", "1080");
        loja.adicionar("Gaming", "3", "Dell","i7", "3070");
        loja.adicionar("Force", "2", "Asus","i5", "1080");

        assertEquals(3, ModeloFactory.getTotalModelos());
    }
}
