package GerenciamentoOrdemServico.state;

public class OrdemServicoCriada extends OrdemServicoEstado {
    private OrdemServicoCriada() {};
    private static OrdemServicoCriada instance = new OrdemServicoCriada();
    public static OrdemServicoCriada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Criada";
    }

    public boolean aprovar(OrdemServico ordemServico) {
        ordemServico.setEstado(OrdemServicoAprovada.getInstance());
        return true;
    }

    public boolean cancelar(OrdemServico ordemServico) {
        ordemServico.setEstado(OrdemServicoCancelada.getInstance());
        return true;
    }
}
