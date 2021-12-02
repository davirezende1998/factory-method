import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class VeiculoFactoryTest {
    @Test
    void deveRetornarExcecaoParaVeiculoInexistente() {
        try {
            InterfaceVeiculo veiculo = VeiculoFactory.obterVeiculo("Motorhome");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Veículo inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaVeiculoInvalido() {
        try {
            InterfaceVeiculo veiculo = VeiculoFactory.obterVeiculo("Barco");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Veículo inválido", e.getMessage());
        }
    }
}
