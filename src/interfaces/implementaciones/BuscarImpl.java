package interfaces.implementaciones;

import interfaces.IBuscar;
import modelos.Almacen;
import modelos.Producto;

import java.util.ArrayList;
import java.util.List;

public class BuscarImpl implements IBuscar {


    @Override
    public List<Producto> buscarZapatoPorColor(List<Producto> productos, String color) {
        //1. Crear lista vacia
        List<Producto> zapatosEncontrados = new ArrayList<>();

        //2. crear objetos
        for (Producto producto : productos) {
            if (producto.getColor().toUpperCase().equals(color)) {
                zapatosEncontrados.add(producto);
            }
        }

        return zapatosEncontrados;
    }

    @Override
    public List<Producto> buscarZapatoPorTalla(List<Producto> productos, int talla) {
        //1. Crear lista vacia
        List<Producto> zapatosEncontrados = new ArrayList<>();

        for (Producto producto : productos) {
            if (producto.getTalla() == talla) {
                zapatosEncontrados.add(producto);
            }
        }
        return zapatosEncontrados;

    }

    @Override
    public List<Producto> buscarZapatoPorGenero(List<Producto> productos, char genero) {
        //1. Crear lista vacia
        List<Producto> zapatosEncontrados = new ArrayList<>();

        for (Producto producto : productos) {
            if (producto.getGenero() == genero) {
                zapatosEncontrados.add(producto);
            }
        }
        return zapatosEncontrados;
    }

    @Override
    public List<Producto> buscarZapatoPorTipo(List<Producto> productos, String tipo) {
        //1. Crear lista vacia
        List<Producto> zapatosEncontrados = new ArrayList<>();

        for (Producto producto : productos) {
            if (producto.getTipo().toUpperCase().equals(tipo)) {
                zapatosEncontrados.add(producto);
            }
        }
        return zapatosEncontrados;
    }

    @Override
    public List<Producto> buscarGeneroTipoTalla(List<Producto> productos, char genero, String tipo, int talla) {
        //1. crear lista vacia
        List<Producto> zapatosEncontrados = new ArrayList<>();

        for (Producto producto : productos) {
            if (producto.getGenero() == (genero) && producto.getTipo().toUpperCase().equals(tipo.toUpperCase()) && producto.getTalla() == talla) {
                zapatosEncontrados.add(producto);
            }
        }
        return zapatosEncontrados;


    }
}
