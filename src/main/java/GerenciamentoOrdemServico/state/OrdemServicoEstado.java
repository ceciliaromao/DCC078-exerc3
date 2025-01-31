package GerenciamentoOrdemServico.state;

public abstract class OrdemServicoEstado {
    public abstract String getEstado();

    public boolean criar(OrdemServico ordemServico) {
        return false;
    }

    public boolean aprovar(OrdemServico ordemServico) {
        return false;
    }

    public boolean iniciar(OrdemServico ordemServico) {
        return false;
    }

    public boolean concluir(OrdemServico ordemServico) {
        return false;
    }

    public boolean cancelar(OrdemServico ordemServico) {
        return false;
    }
}
