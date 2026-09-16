public class Nota {

    private int valor;

    public int getValor() {
        return valor;
    }

    public Nota(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Nota " + valor;
    }
}
