package modelos;

public class Vendedor extends Persona {
    private int idVendedor;

    public Vendedor(String nombre, String apellido, int idVendedor) {
        super(nombre, apellido);
        this.idVendedor = idVendedor;
    }

    public Vendedor(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "idVendedor=" + idVendedor +
                '}';
    }
}
