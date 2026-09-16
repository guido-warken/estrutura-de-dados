public class VetorNota {

    private Nota[] notas;
    private int tamanho;

    public VetorNota() {
        this.notas = new Nota[10];
    }

    public VetorNota(int capacidadeInicial) {
        this.notas = new Nota[capacidadeInicial];
    }

    public void adicionar(Nota nota) {
        garantirEspaco();
        notas[tamanho] = nota;
        tamanho++;
    }

    public void adicionar(Nota nota, int posicao) {
        if (!posicaoValida(posicao)) {
            throw new IllegalArgumentException("A posição passada é inválida");
        }

        garantirEspaco();

        for (int i = tamanho; i > posicao; i--) {
            notas[i] = notas[i - 1];
        }
        notas[posicao] = nota;
        tamanho++;

    }

    public void remover(int posicao) {
        if (!posicaoValida(posicao)) {
            throw new IllegalArgumentException("A posição passada é inválida");
        }

        for (int i = posicao; i <= tamanho - 1; i++) {
            notas[i] = notas[i + 1];
        }
        tamanho--;
    }

    public Nota[] toArray() {
        return notas;
    }

    public int tamanho() {
        return tamanho;
    }

    private void garantirEspaco() {
        if (tamanho == notas.length) {
            Nota[] novo = new Nota[notas.length * 2];
            System.arraycopy(notas, 0, novo, 0, tamanho);
            notas = novo;
        }
    }

    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao < tamanho;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < tamanho; i++) {
            sb.append(notas[i].getValor());

            if (i < tamanho - 1) {
                sb.append(", ");
            }
        }

        sb.append("]");
        return sb.toString();
    }
}
