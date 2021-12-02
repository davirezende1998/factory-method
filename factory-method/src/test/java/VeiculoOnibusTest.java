import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VeiculoOnibusTest {
    @Test
    void deveCadastrarOnibus() {
        InterfaceVeiculo veiculo = VeiculoFactory.obterVeiculo("Onibus");
        assertEquals("Ônibus cadastrado", veiculo.cadastrar());
    }

    @Test
    void deveRemoverOnibus() {
        InterfaceVeiculo veiculo = VeiculoFactory.obterVeiculo("Onibus");
        assertEquals("Ônibus removido", veiculo.remover());
    }
}