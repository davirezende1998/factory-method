import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VeiculoCarroTest {
    @Test
    void deveCadastrarCarro() {
        InterfaceVeiculo veiculo = VeiculoFactory.obterVeiculo("Carro");
        assertEquals("Carro cadastrado", veiculo.cadastrar());
    }

    @Test
    void deveRemoverCarro() {
        InterfaceVeiculo veiculo = VeiculoFactory.obterVeiculo("Carro");
        assertEquals("Carro removido", veiculo.remover());
    }
}