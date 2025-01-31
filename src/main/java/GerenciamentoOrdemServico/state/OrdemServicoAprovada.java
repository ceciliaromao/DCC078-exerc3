package GerenciamentoOrdemServico.state;

public class OrdemServicoAprovada extends OrdemServicoEstado {
    private OrdemServicoAprovada() {};
    private static OrdemServicoAprovada instance = new OrdemServicoAprovada();
    public static OrdemServicoAprovada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Aprovada";
    }

    public boolean iniciar(OrdemServico ordemServico) {
        ordemServico.setEstado(OrdemServicoEmAndamento.getInstance());
        return true;
    }

    public boolean cancelar(OrdemServico ordemServico) {
        ordemServico.setEstado(OrdemServicoCancelada.getInstance());
        return true;
    }
}