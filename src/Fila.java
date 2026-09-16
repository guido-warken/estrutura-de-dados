public class Fila {

    private VetorNota vetor;

    public Fila() {
        this.vetor = new VetorNota();
    }

    public Fila(int capacidadeInicial) {
        this.vetor = new VetorNota(capacidadeInicial);
    }

    public void enfileirar(Nota nota) {
        vetor.adicionar(nota);
    }

    public void desenfileirar() {
        if (vazia()) {
            throw new IllegalStateException("A fila está vazia");
        }

        vetor.remover(0);
    }

    public Nota frente() {
        if (vazia()) {
            throw new IllegalStateException("A fila está vazia");
        }

        return vetor.toArray()[0];
    }

    public boolean vazia() {
        return vetor.tamanho() == 0;
    }

    public int tamanho() {
        return vetor.tamanho();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fila (frente -> fim): ");
        sb.append(vetor);
        return sb.toString();
    }
}
