package GerenciamentoOrdemServico.state;

public class OrdemServico {
    private String descricao;
    private OrdemServicoEstado estado;

    public OrdemServico() {
        this.estado = OrdemServicoCriada.getInstance();
    }

    public void setEstado(OrdemServicoEstado estado) {
        this.estado = estado;
    }

    public boolean criar(){
        return estado.criar(this);
    }

    public boolean aprovar(){
        return estado.aprovar(this);
    }

    public boolean iniciar(){
        return estado.iniciar(this);
    }

    public boolean concluir(){
        return estado.concluir(this);
    }

    public boolean cancelar(){
        return estado.cancelar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public OrdemServicoEstado getEstado() {
        return estado;
    }
}
