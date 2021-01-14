package interfaces;

import modelos.Producto;

import java.util.List;

public interface IDescuento {

    double aplicarDescuento (List<Producto> productos);

}
