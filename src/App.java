public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("========== PILHA ==========");
        Pilha pilha = new Pilha();
        System.out.println("Pilha vazia? " + pilha.vazia());
        System.out.println(pilha);

        pilha.empilhar(new Nota(8));
        pilha.empilhar(new Nota(6));
        pilha.empilhar(new Nota(10));
        System.out.println(pilha);
        System.out.println("Tamanho: " + pilha.tamanho());
        System.out.println("Topo: " + pilha.topo().getValor());

        pilha.desempilhar();
        System.out.println("Apos desempilhar: " + pilha);
        System.out.println("Topo: " + pilha.topo().getValor());

        System.out.println("\n========== FILA ==========");
        Fila fila = new Fila();
        System.out.println("Fila vazia? " + fila.vazia());
        System.out.println(fila);

        fila.enfileirar(new Nota(8));
        fila.enfileirar(new Nota(6));
        fila.enfileirar(new Nota(10));
        System.out.println(fila);
        System.out.println("Tamanho: " + fila.tamanho());
        System.out.println("Frente: " + fila.frente().getValor());

        fila.desenfileirar();
        System.out.println("Apos desenfileirar: " + fila);
        System.out.println("Frente: " + fila.frente().getValor());

        System.out.println("\n========== ERROS ==========");
        Pilha pilhaVazia = new Pilha();
        try {
            pilhaVazia.desempilhar();
        } catch (IllegalStateException e) {
            System.out.println("desempilhar pilha vazia: " + e.getMessage());
        }

        Fila filaVazia = new Fila();
        try {
            filaVazia.frente();
        } catch (IllegalStateException e) {
            System.out.println("frente de fila vazia: " + e.getMessage());
        }
    }
}
