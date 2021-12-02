import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VeiculoCaminhaoTest {
    @Test
    void deveCadastrarCaminhao() {
        InterfaceVeiculo veiculo = VeiculoFactory.obterVeiculo("Caminhao");
        assertEquals("Caminhão cadastrado", veiculo.cadastrar());
    }

    @Test
    void deveRemoverCaminhao() {
        InterfaceVeiculo veiculo = VeiculoFactory.obterVeiculo("Caminhao");
        assertEquals("Caminhão removido", veiculo.remover());
    }
}