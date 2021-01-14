package ejecutores;

import interfaces.IBuscar;
import interfaces.IDescuento;
import interfaces.IPoblar;
import interfaces.implementaciones.BuscarImpl;
import interfaces.implementaciones.DescuentoImpl;
import interfaces.implementaciones.PoblarImpl;
import modelos.Comprador;
import modelos.Producto;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //1. instancia la interfaz y la impl (padre = new hijo)- (interfaz = new impl)
        IPoblar poblar = new PoblarImpl();
        IBuscar buscar = new BuscarImpl();

        List<Producto> productos = poblar.crearProducto();
        List<Comprador> compradores = poblar.crearComprador();

        String color = "negro";
        List<Producto> zapatosPorColor = buscar.buscarZapatoPorColor(productos, color);
        //System.out.println("Los productos con color " + color + " encontrados son: " + zapatosPorColor);


        int talla = 38;
        List<Producto> zapatosPorTalla = buscar.buscarZapatoPorTalla(productos, talla);
        //System.out.println("Los productos de talla " + talla + " encontrados son: " + zapatosPorTalla);

        char genero = 'f';
        List<Producto> zapatosPorGenero = buscar.buscarZapatoPorGenero(productos, genero);
        //System.out.println("Los productos según el género " + genero + " encontrados son: " + zapatosPorGenero);

        String tipo = "Sandalia";
        List<Producto> zapatosPorTipo = buscar.buscarZapatoPorTipo(productos, tipo);
        //System.out.println("Los productos según el tipo " + tipo + " encontrados son: " + zapatosPorTipo);

        List<Producto> productosComprados = new ArrayList<>();

      /*  productosComprados.add(zapatosPorColor.get(0));
        productosComprados.add(zapatosPorGenero.get(1));
        productosComprados.add(zapatosPorTalla.get(0));
        productosComprados.add(zapatosPorTipo.get(0));

        System.out.println("Los productos seleccionados por usted son: " + productosComprados);
*/
        //Búsqueda combinada
        List<Producto> busquedaCombinada = buscar.buscarGeneroTipoTalla(productos, genero, tipo, talla);

        System.out.println("Los productos disponibles según su búsqueda son: \n" + busquedaCombinada);

        //Compra
        productosComprados.add(busquedaCombinada.get(2));
        productosComprados.add(busquedaCombinada.get(1));
        productosComprados.add(busquedaCombinada.get(0));
        System.out.println("Productos comprados son : \n " + productosComprados);

        // Se aplica descuento
        IDescuento precioFinal = new DescuentoImpl();
        precioFinal.aplicarDescuento(productosComprados);

    }
}

