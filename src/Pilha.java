public class Pilha {

    private VetorNota vetor;

    public Pilha() {
        this.vetor = new VetorNota();
    }

    public Pilha(int capacidadeInicial) {
        this.vetor = new VetorNota(capacidadeInicial);
    }

    public void empilhar(Nota nota) {
        vetor.adicionar(nota);
    }

    public void desempilhar() {
        if (vazia()) {
            throw new IllegalStateException("A pilha está vazia");
        }

        int ultimaPosicao = vetor.tamanho() - 1;
        vetor.remover(ultimaPosicao);
    }

    public Nota topo() {
        if (vazia()) {
            throw new IllegalStateException("A pilha está vazia");
        }

        int ultimaPosicao = vetor.tamanho() - 1;
        return vetor.toArray()[ultimaPosicao];
    }

    public boolean vazia() {
        return vetor.tamanho() == 0;
    }

    public int tamanho() {
        return vetor.tamanho();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pilha (base -> topo): ");
        sb.append(vetor);
        return sb.toString();
    }
}
