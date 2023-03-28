package one.digitalinnovation;

public class CalculadoraFacade {
    private static CalculadoraFacade instance;
    private Operacao operacao;

    private CalculadoraFacade() {
        // construtor privado para evitar a criação de novas instâncias.
    }

    public static synchronized CalculadoraFacade getInstance() {
        if (instance == null) {
            instance = new CalculadoraFacade();
        }
        return instance;
    }

    public void setOperacao(Operacao operacao) {
        this.operacao = operacao;
    }

    public int calcular(int a, int b) {
        if (operacao == null) {
            throw new IllegalStateException("Nenhuma operação selecionada");
        }
        return operacao.executar(a, b);
    }
}