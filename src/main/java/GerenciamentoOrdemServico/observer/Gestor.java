package GerenciamentoOrdemServico.observer;

import java.util.Observable;
import java.util.Observer;

public class Gestor implements Observer {
    private String nome;
    private String ultimaNotificacao;

    public Gestor(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void criarOrdem(OrdemServico ordem) {
        ordem.addObserver(this);
    }

    @Override
    public void update(Observable ordem, Object arg) {
        this.ultimaNotificacao = this.nome + ", estado da ordem de serviço atualizado: " + ordem.toString();
    }
}
