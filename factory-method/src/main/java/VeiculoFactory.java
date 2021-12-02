public class VeiculoFactory {
    public static InterfaceVeiculo obterVeiculo(String veiculo) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("Veiculo" + veiculo);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Veículo inexistente");
        }
        if (!(objeto instanceof InterfaceVeiculo)) {
            throw new IllegalArgumentException("Veículo inválido");
        }
        return (InterfaceVeiculo) objeto;
    }
}