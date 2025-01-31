package GerenciamentoOrdemServico.observer;

import java.util.Observable;

public class OrdemServico extends Observable {
    private String descricao;
    private double valor;
    private String estado;

    public OrdemServico(String descricao, double valor, String estado) {
        this.descricao = descricao;
        this.valor = valor;
        this.estado = estado;
    }

    public void mudarEstado(String novoEstado) {
        this.estado = novoEstado;
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "OrdemServico{" +
                "descricao= " + descricao +
                ", valor= " + valor +
                ", estado= " + estado +
                '}';
    }
}
