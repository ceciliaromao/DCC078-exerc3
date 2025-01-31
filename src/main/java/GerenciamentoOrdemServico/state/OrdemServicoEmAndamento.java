package GerenciamentoOrdemServico.state;

public class OrdemServicoEmAndamento extends OrdemServicoEstado {
    private OrdemServicoEmAndamento() {};
    private static OrdemServicoEmAndamento instance = new OrdemServicoEmAndamento();
    public static OrdemServicoEmAndamento getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Em Andamento";
    }

    public boolean concluir(OrdemServico ordemServico) {
        ordemServico.setEstado(OrdemServicoConcluida.getInstance());
        return true;
    }

    public boolean cancelar(OrdemServico ordemServico) {
        ordemServico.setEstado(OrdemServicoCancelada.getInstance());
        return true;
    }
}
