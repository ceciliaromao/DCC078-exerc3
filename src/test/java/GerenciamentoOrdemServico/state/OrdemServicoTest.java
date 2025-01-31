package GerenciamentoOrdemServico.state;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrdemServicoTest {
    OrdemServico ordemServico;

    @BeforeEach
    public void setUp() {
        ordemServico = new OrdemServico();
    }

    // Ordem de Serviço Criada
    @Test
    public void naoDeveCriarOrdemServicoCriada() {
        ordemServico.setEstado(OrdemServicoCriada.getInstance());
        assertFalse(ordemServico.criar());
    }

    @Test
    public void deveAprovarOrdemServicoCriada() {
        ordemServico.setEstado(OrdemServicoCriada.getInstance());
        assertTrue(ordemServico.aprovar());
        assertEquals(OrdemServicoAprovada.getInstance(), ordemServico.getEstado());
    }

    @Test
    public void naoDeveIniciarOrdemServicoCriada() {
        ordemServico.setEstado(OrdemServicoCriada.getInstance());
        assertFalse(ordemServico.iniciar());
    }

    @Test
    public void naoDeveConcluirOrdemServicoCriada() {
        ordemServico.setEstado(OrdemServicoCriada.getInstance());
        assertFalse(ordemServico.concluir());
    }

    @Test
    public void deveCancelarOrdemServicoCriada() {
        ordemServico.setEstado(OrdemServicoCriada.getInstance());
        assertTrue(ordemServico.cancelar());
        assertEquals(OrdemServicoCancelada.getInstance(), ordemServico.getEstado());
    }

    // Ordem de Serviço Aprovada
    @Test
    public void naoDeveCriarOrdemServicoAprovada() {
        ordemServico.setEstado(OrdemServicoAprovada.getInstance());
        assertFalse(ordemServico.criar());
    }

    @Test
    public void naoDeveAprovarOrdemServicoAprovada() {
        ordemServico.setEstado(OrdemServicoAprovada.getInstance());
        assertFalse(ordemServico.aprovar());
    }

    @Test
    public void deveIniciarOrdemServicoAprovada() {
        ordemServico.setEstado(OrdemServicoAprovada.getInstance());
        assertTrue(ordemServico.iniciar());
        assertEquals(OrdemServicoEmAndamento.getInstance(), ordemServico.getEstado());
    }

    @Test
    public void naoDeveConcluirOrdemServicoAprovada() {
        ordemServico.setEstado(OrdemServicoAprovada.getInstance());
        assertFalse(ordemServico.concluir());
    }

    @Test
    public void deveCancelarOrdemServicoAprovada() {
        ordemServico.setEstado(OrdemServicoAprovada.getInstance());
        assertTrue(ordemServico.cancelar());
        assertEquals(OrdemServicoCancelada.getInstance(), ordemServico.getEstado());
    }

    // Ordem de Serviço Em Andamento
    @Test
    public void naoDeveCriarOrdemServicoEmAndamento() {
        ordemServico.setEstado(OrdemServicoEmAndamento.getInstance());
        assertFalse(ordemServico.criar());
    }

    @Test
    public void naoDeveAprovarOrdemServicoEmAndamento() {
        ordemServico.setEstado(OrdemServicoEmAndamento.getInstance());
        assertFalse(ordemServico.aprovar());
    }

    @Test
    public void naoDeveIniciarOrdemServicoEmAndamento() {
        ordemServico.setEstado(OrdemServicoEmAndamento.getInstance());
        assertFalse(ordemServico.iniciar());
    }

    @Test
    public void deveConcluirOrdemServicoEmAndamento() {
        ordemServico.setEstado(OrdemServicoEmAndamento.getInstance());
        assertTrue(ordemServico.concluir());
        assertEquals(OrdemServicoConcluida.getInstance(), ordemServico.getEstado());
    }

    @Test
    public void deveCancelarOrdemServicoEmAndamento() {
        ordemServico.setEstado(OrdemServicoEmAndamento.getInstance());
        assertTrue(ordemServico.cancelar());
        assertEquals(OrdemServicoCancelada.getInstance(), ordemServico.getEstado());
    }

    // Ordem de Serviço Concluida
    @Test
    public void naoDeveCriarOrdemServicoConcluida() {
        ordemServico.setEstado(OrdemServicoConcluida.getInstance());
        assertFalse(ordemServico.criar());
    }

    @Test
    public void naoDeveAprovarOrdemServicoConcluida() {
        ordemServico.setEstado(OrdemServicoConcluida.getInstance());
        assertFalse(ordemServico.aprovar());
    }

    @Test
    public void naoDeveIniciarOrdemServicoConcluida() {
        ordemServico.setEstado(OrdemServicoConcluida.getInstance());
        assertFalse(ordemServico.iniciar());
    }

    @Test
    public void naoDeveConcluirOrdemServicoConcluida() {
        ordemServico.setEstado(OrdemServicoConcluida.getInstance());
        assertFalse(ordemServico.concluir());
    }

    @Test
    public void naoDeveCancelarOrdemServicoConcluida() {
        ordemServico.setEstado(OrdemServicoConcluida.getInstance());
        assertFalse(ordemServico.cancelar());
    }

    // Ordem de Serviço Cancelada
    @Test
    public void naoDeveCriarOrdemServicoCancelada() {
        ordemServico.setEstado(OrdemServicoCancelada.getInstance());
        assertFalse(ordemServico.criar());
    }

    @Test
    public void naoDeveAprovarOrdemServicoCancelada() {
        ordemServico.setEstado(OrdemServicoCancelada.getInstance());
        assertFalse(ordemServico.aprovar());
    }

    @Test
    public void naoDeveIniciarOrdemServicoCancelada() {
        ordemServico.setEstado(OrdemServicoCancelada.getInstance());
        assertFalse(ordemServico.iniciar());
    }

    @Test
    public void naoDeveConcluirOrdemServicoCancelada() {
        ordemServico.setEstado(OrdemServicoCancelada.getInstance());
        assertFalse(ordemServico.concluir());
    }

    @Test
    public void naoDeveCancelarOrdemServicoCancelada() {
        ordemServico.setEstado(OrdemServicoCancelada.getInstance());
        assertFalse(ordemServico.cancelar());
    }
}
