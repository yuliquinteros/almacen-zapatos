package interfaces;

import modelos.Almacen;
import modelos.Comprador;
import modelos.Producto;
import modelos.Vendedor;

import java.util.List;

public interface IPoblar {

    List<Vendedor> crearVendedor();

    List<Comprador> crearComprador();

    List<Producto> crearProducto();

    List<Almacen> crearAlmacen();


}
