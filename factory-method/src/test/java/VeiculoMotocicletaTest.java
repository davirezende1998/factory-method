import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VeiculoMotocicletaTest {
    @Test
    void deveCadastrarMotocicleta() {
        InterfaceVeiculo veiculo = VeiculoFactory.obterVeiculo("Motocicleta");
        assertEquals("Motocicleta cadastrada", veiculo.cadastrar());
    }

    @Test
    void deveRemoverMotocicleta() {
        InterfaceVeiculo veiculo = VeiculoFactory.obterVeiculo("Motocicleta");
        assertEquals("Motocicleta removida", veiculo.remover());
    }
}