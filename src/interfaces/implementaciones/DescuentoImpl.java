package interfaces.implementaciones;

import interfaces.IDescuento;
import modelos.Producto;

import java.util.ArrayList;
import java.util.List;

public class DescuentoImpl implements IDescuento {


    @Override
    public double aplicarDescuento(List<Producto> productos) {

        double precioConDescuento = 0;
        double precioTotal = 0;

        for (Producto producto : productos) {
            precioTotal = precioTotal + producto.getPrecio();

        }
        System.out.println("El precio total es: " + precioTotal);
        if (productos.size() >= 3) {
            precioConDescuento = precioTotal * 0.9;
            System.out.println("Accediste al descuento!!! :D!");

            System.out.println("El precio con descuento es: " + precioConDescuento);
        } else {
            System.out.println("Mínimo 3 productos para acceder al descuento");

        }
        return precioConDescuento;

    }
}