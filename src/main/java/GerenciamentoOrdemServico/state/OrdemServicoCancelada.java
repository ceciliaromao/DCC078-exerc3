package GerenciamentoOrdemServico.state;

public class OrdemServicoCancelada extends OrdemServicoEstado {
    private OrdemServicoCancelada() {};
    private static OrdemServicoCancelada instance = new OrdemServicoCancelada();
    public static OrdemServicoCancelada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Cancelada";
    }
}
