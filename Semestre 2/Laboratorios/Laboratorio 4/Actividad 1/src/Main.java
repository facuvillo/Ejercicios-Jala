

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Categorias<Producto> electronica = new Categorias<>("Electrónica");
        Categorias<Producto> alimentos = new Categorias<>("Alimentos");

        Producto producto1 = new Producto(1,"Laptop", 10);
        Producto producto2 = new Producto(2,"Teléfono", 9);
        Producto producto3 = new Producto(3,"Manzana", 8);
        Producto producto4 = new Producto(4,"Leche", 7);
        Producto producto5 = new Producto(5,"Banana", 6);
        Producto producto6 = new Producto(6,"Tablet", 5);
        Producto producto7 = new Producto(7,"tomate", 4);
        Producto producto8 = new Producto(8,"lechuga", 3);
        Producto producto9 = new Producto(9,"Televisor", 2);
        Producto producto10 = new Producto(10,"Mando TV", 1);


        //Agregar a las categorias
        System.out.println(electronica.listaProductos.size());
        electronica.agregarProducto(producto2);
        electronica.agregarProducto(producto9);
        electronica.agregarProducto(producto6);
        electronica.agregarProducto(producto1);
        electronica.agregarProducto(producto10);
        System.out.println(electronica.listaProductos.size());

        alimentos.agregarProducto(producto3);
        alimentos.agregarProducto(producto4);
        alimentos.agregarProducto(producto8);
        alimentos.agregarProducto(producto7);
        alimentos.agregarProducto(producto5);

        //Buscar un producto
        System.out.println(alimentos.buscarProducto(producto3));

        //Ordenar lista por id general de producto
        System.out.println("LISTA DESORDENADA");
        for(int i=0;i<alimentos.listaProductos.size();i++){
            System.out.println(alimentos.listaProductos.get(i).toString());
        }
        System.out.println("LISTA ORDENADA");
        alimentos.ordernarProductos("id");
        for(int i=0;i<alimentos.listaProductos.size();i++){
            System.out.println(alimentos.listaProductos.get(i).toString());
        }

        //Bloque de eliminar producto de la lista
        System.out.println("LISTA CON PRODUCTO SIN BORRAR");
        for(int i=0;i<alimentos.listaProductos.size();i++){
            System.out.println(alimentos.listaProductos.get(i).toString());
        }

        alimentos.eliminarProducto(producto7);

        System.out.println("LISTA CON PRODUCTO BORRADO");
        for(int i=0;i<alimentos.listaProductos.size();i++){
            System.out.println(alimentos.listaProductos.get(i).toString());
        }
    }
}
