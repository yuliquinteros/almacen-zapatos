package interfaces;

import modelos.Almacen;
import modelos.Comprador;
import modelos.Producto;
import modelos.Vendedor;

import java.util.List;

public interface IBuscar {

    List<Producto> buscarZapatoPorColor(List<Producto> productos, String color);
    List<Producto> buscarZapatoPorTalla(List<Producto> productos, int talla);
    List<Producto> buscarZapatoPorGenero(List<Producto> productos, char genero);
    List<Producto> buscarZapatoPorTipo(List<Producto> productos, String tipo);
    List<Producto> buscarGeneroTipoTalla(List<Producto> productos, char genero, String tipo, int talla);

}
