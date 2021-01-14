package modelos;

public class Almacen {
    private String idAlmacen;

    public Almacen(String idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    public String getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(String idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    @Override
    public String toString() {
        return "Almacen{" +
                "idAlmacen=" + idAlmacen +
                '}';
    }
}
