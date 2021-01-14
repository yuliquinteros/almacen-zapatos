package modelos;

public class Comprador extends Persona {
    private int numPedido;

    public Comprador(String nombre, String apellido, int numPedido) {
        super(nombre, apellido);
        this.numPedido = numPedido;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    @Override
    public String toString() {
        return "Comprador{" +
                "numPedido=" + numPedido +
                '}';
    }
}