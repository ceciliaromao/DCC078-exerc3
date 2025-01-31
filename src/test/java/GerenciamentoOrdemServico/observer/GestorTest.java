package GerenciamentoOrdemServico.observer;

import GerenciamentoOrdemServico.state.OrdemServicoAprovada;
import GerenciamentoOrdemServico.state.OrdemServicoCriada;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GestorTest {
    @Test
    void deveNotificarUmGestor() {
        OrdemServico ordem = new OrdemServico("Troca de filtro do ar condicionado", 149.99, OrdemServicoCriada.getInstance().getEstado());
        Gestor gestor = new Gestor("Gestor 1");
        gestor.criarOrdem(ordem);
        ordem.mudarEstado(OrdemServicoAprovada.getInstance().getEstado());
        assertEquals("Gestor 1, estado da ordem de serviço atualizado: OrdemServico{descricao= Troca de filtro do ar condicionado, valor= 149.99, estado= Aprovada}", gestor.getUltimaNotificacao());
    }

    @Test
    void deveNotificarGestores() {
        OrdemServico ordem = new OrdemServico("Troca de filtro do ar condicionado", 149.99, OrdemServicoCriada.getInstance().getEstado());
        Gestor gestor1 = new Gestor("Gestor 1");
        Gestor gestor2 = new Gestor("Gestor 2");
        gestor1.criarOrdem(ordem);
        gestor2.criarOrdem(ordem);
        ordem.mudarEstado(OrdemServicoAprovada.getInstance().getEstado());
        assertEquals("Gestor 1, estado da ordem de serviço atualizado: OrdemServico{descricao= Troca de filtro do ar condicionado, valor= 149.99, estado= Aprovada}", gestor1.getUltimaNotificacao());
        assertEquals("Gestor 2, estado da ordem de serviço atualizado: OrdemServico{descricao= Troca de filtro do ar condicionado, valor= 149.99, estado= Aprovada}", gestor2.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarGestor() {
        OrdemServico ordem = new OrdemServico("Troca de filtro do ar condicionado", 149.99, OrdemServicoCriada.getInstance().getEstado());
        Gestor gestor = new Gestor("Gestor 1");
        ordem.mudarEstado(OrdemServicoAprovada.getInstance().getEstado());
        assertEquals(null, gestor.getUltimaNotificacao());
    }

    @Test
    void deveNotificarGestorOrdemA() {
        OrdemServico ordemA = new OrdemServico("Troca de filtro do ar condicionado", 149.99, OrdemServicoCriada.getInstance().getEstado());
        OrdemServico ordemB = new OrdemServico("Troca de filtro de água", 49.99, OrdemServicoCriada.getInstance().getEstado());
        Gestor gestor1 = new Gestor("Gestor 1");
        Gestor gestor2 = new Gestor("Gestor 2");
        gestor1.criarOrdem(ordemA);
        gestor2.criarOrdem(ordemB);
        ordemA.mudarEstado(OrdemServicoAprovada.getInstance().getEstado());
        assertEquals("Gestor 1, estado da ordem de serviço atualizado: OrdemServico{descricao= Troca de filtro do ar condicionado, valor= 149.99, estado= Aprovada}", gestor1.getUltimaNotificacao());
        assertEquals(null, gestor2.getUltimaNotificacao());
    }
}
