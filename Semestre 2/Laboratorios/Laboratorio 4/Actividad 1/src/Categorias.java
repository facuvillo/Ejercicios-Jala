

import java.util.ArrayList;
import java.util.List;

public class Categorias <T extends Producto>{

    private String nombreCategoria;
    public List<T> listaProductos;

    public Categorias(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
        this.listaProductos = new ArrayList<>();
    }

    //Getters y Setter

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public List<T> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<T> listaProductos) {
        this.listaProductos = listaProductos;
    }

    // Agregar y eliminar de la lista
    public void agregarProducto(T producto){
        listaProductos.add(producto);
    }

    public void eliminarProducto(T producto){
        listaProductos.remove(producto);
    }

    //Busqueda
    public String buscarProducto(T producto){
        boolean flag = false;
        int count = 0;
        for (int i=0; i<listaProductos.size()-1;i++){
            if(producto == listaProductos.get(count)){
                flag = true;
                break;
            }
        }

        if(!flag){
            return "No se encuentra en el sistema";
        }else{
            return listaProductos.get(count).toString();
        }
    }

    //Ordenamiento burbuja
    public void ordernarProductos(String atributo){
        T aux;
        switch (atributo){
            case "id":
                for(int i=0 ; i<listaProductos.size()-1; i++){
                    for(int j=0; j<listaProductos.size()-1; j++){
                        if(listaProductos.get(j).idProducto > listaProductos.get(j + 1).idProducto){
                            aux = listaProductos.get(j);
                            listaProductos.set(j, listaProductos.get(j + 1));
                            listaProductos.set(j+1,aux);
                        }
                    }
                }
                break;
            case "nombre":
                for(int i=0 ; i<listaProductos.size()-1; i++){
                    for(int j=0; j<listaProductos.size()-1; j++){
                        if(listaProductos.get(j).nombre.toLowerCase().charAt(0) > listaProductos.get(j + 1).nombre.toLowerCase().charAt(0)){
                            aux = listaProductos.get(j);
                            listaProductos.set(j, listaProductos.get(j + 1));
                            listaProductos.set(j+1,aux);
                        }
                    }
                }
                break;
            case "precio":
                for(int i=0 ; i<listaProductos.size()-1; i++){
                    for(int j=0; j<listaProductos.size()-1; j++){
                        if(listaProductos.get(j).precio > listaProductos.get(j + 1).precio){
                            aux = listaProductos.get(j);
                            listaProductos.set(j, listaProductos.get(j + 1));
                            listaProductos.set(j+1,aux);
                        }
                    }
                }
                break;
        }
    }

    @Override
    public String toString() {
        return "Categorias{" +
                "nombreCategoria='" + nombreCategoria + '\'' +
                ", listaProductos=" + listaProductos +
                '}';
    }
}
