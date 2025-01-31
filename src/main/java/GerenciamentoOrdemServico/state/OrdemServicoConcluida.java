package GerenciamentoOrdemServico.state;

public class OrdemServicoConcluida extends OrdemServicoEstado {
    private OrdemServicoConcluida() {};
    private static OrdemServicoConcluida instance = new OrdemServicoConcluida();
    public static OrdemServicoConcluida getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Concluida";
    }
}
