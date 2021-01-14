package interfaces.implementaciones;

import interfaces.IPoblar;
import modelos.Almacen;
import modelos.Comprador;
import modelos.Producto;
import modelos.Vendedor;

import java.util.ArrayList;
import java.util.List;

public class PoblarImpl implements IPoblar {
    @Override
    public List<Vendedor> crearVendedor() {
        //1. Crear lista vacía

        List<Vendedor> vendedores = new ArrayList<>();

        //2. crear objetos
        Vendedor vendedor1 = new Vendedor("Juan", "Perez", 101);
        Vendedor vendedor2 = new Vendedor("Maria", "Costa", 102);

        vendedores.add(vendedor1);
        vendedores.add(vendedor2);

        return vendedores;
    }

    @Override
    public List<Comprador> crearComprador() {

        //1. Crear lista vacia
        List<Comprador> compradores = new ArrayList<>();

        //2. crear objetos
        Comprador comprador1 = new Comprador("Ana", "García", 501);
        Comprador comprador2 = new Comprador("Lucas", "Castro", 502);

        compradores.add(comprador1);
        compradores.add(comprador2);

        return compradores;
    }

    @Override
    public List<Producto> crearProducto() {
        //1. Crear lista vacia
        List<Producto> productos = new ArrayList<>();

        //2. crear objetos

        Producto zapato1 = new Producto(0001, "Blanco", 37, 'f', "Zapato", 3000);
        Producto sandalia1 = new Producto(1001, "beige", 37, 'f', "Sandalia", 2500);
        Producto zapatilla1 = new Producto(2001, "negro", 40, 'm', "Zapatilla", 3500);

        Producto zapato2 = new Producto(0002, "azul", 39, 'm', "Zapato", 4500);
        Producto sandalia2 = new Producto(1002, "rojo", 38, 'f', "Sandalia", 4000);
        Producto zapatilla2 = new Producto(2002, "negro", 36, 'f', "Zapatilla", 5000);


        Producto sandalia3 = new Producto(1003, "amarillo", 38, 'f', "Sandalia", 5000);
        Producto sandalia4 = new Producto(1003, "dorado", 38, 'f', "Sandalia", 6000);

        productos.add(zapato1);
        productos.add(sandalia1);
        productos.add(zapatilla1);
        productos.add(zapato2);
        productos.add(sandalia2);
        productos.add(zapatilla2);
        productos.add(sandalia3);
        productos.add(sandalia4);


        return productos;
    }

    @Override
    public List<Almacen> crearAlmacen() {

        //1. Crear lista vacia
        List<Almacen> almacenes = new ArrayList<>();

        //2. crear objetos

        Almacen almacen1 = new Almacen("Tienda 1");
        Almacen almacen2 = new Almacen("Tienda 2");

        almacenes.add(almacen1);
        almacenes.add(almacen2);


        return almacenes;
    }
}
