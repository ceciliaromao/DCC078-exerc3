package GerenciamentoOrdemServico.state;

public class Main {
    public static void main(String[] args) {
        OrdemServico ordem = new OrdemServico();

        ordem.setDescricao("Troca de filtro do ar condicionado");
        System.out.println("Serviço: " + ordem.getDescricao());

        System.out.println("Estado atual: " + ordem.getNomeEstado() + " - " + ordem.getEstado());

        ordem.aprovar();
        System.out.println("Estado atual: " + ordem.getNomeEstado() + " - " + ordem.getEstado());

        ordem.iniciar();
        System.out.println("Estado atual: " + ordem.getNomeEstado() + " - " + ordem.getEstado());

        ordem.concluir();
        System.out.println("Estado atual: " + ordem.getNomeEstado() + " - " + ordem.getEstado());

        // Tentar cancelar após concluir
        if (!ordem.cancelar()) {
            System.out.println("Não é possível cancelar uma ordem já concluída.");
        }
        System.out.println("Estado atual: " + ordem.getNomeEstado() + " - " + ordem.getEstado());
    }
}
