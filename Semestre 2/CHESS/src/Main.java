public class Main {

    public static void main(String[] args) {

        //Set inicial de los valores.

        char[] listaLetras = {'a','d','b','h','g','k','p','o','j','e','i','n','f','l','m','c'};
        int[] listaNumeros = {5,8,15,16,1,2,9,10,11,6,7,13,14,3,4,12};

        String[] argumento1 = args[0].split("=");
        String[] argumento2 = args[1].split("=");
        String[] argumento3 = args[2].split("=");
        String[] argumento4 = args[3].split("=");
        String[] argumento5 = args[4].split("=");

        // Comprobaciones de valores de los argumentos.

        char ordenamiento = comprobarOrdenamiento(argumento1[1]);
        char tipoLista = comprobarTipoLista(argumento2[1]);
        char colorPiezas = comprobarColorPieza(argumento3[1]);
        int cantidadPiezas = comprobarCantidadPiezas(argumento4[1]);
        int velociadActualizacion = comprobarvelocidad(argumento5[1]);

        //Bloque que muentra los argumetnos ya seteados.

        System.out.println("Valores de argumentos:");
        System.out.println(ordenamiento);
        System.out.println(tipoLista);
        System.out.println(colorPiezas);
        System.out.println(cantidadPiezas);
        System.out.println(velociadActualizacion);

        //Prueba de ordenamiento de la lista numérica ascendente.

        System.out.println("-------LISTA NUMERICA--------");
        System.out.println("LISTA DESORDENADA:");
        for(int i=0;i<listaNumeros.length;i++){
            System.out.print(listaNumeros[i]+" ");
        }
        System.out.println(" ");
        System.out.println("\nLISTA ORDENADA:");
        ordenamientoBurbujaNumerosAscendente(listaNumeros);
        for(int i=0;i<listaNumeros.length;i++){
            System.out.print(listaNumeros[i]+" ");
        }

        //Prueba de ordenamiento de la lista caracter descendente.
        System.out.println(" ");
        System.out.println("\n-------LISTA CARACTERES--------");
        System.out.println("LISTA DESORDENADA:");
        for(int i=0;i<listaLetras.length;i++){
            System.out.print(listaLetras[i]+" ");
        }
        System.out.println(" ");
        System.out.println("\nLISTA ORDENADA:");
        ordenamientoBurbujaCaracteresDescendente(listaLetras);
        for(int i=0;i<listaLetras.length;i++){
            System.out.print(listaLetras[i]+" ");
        }



    }

    /*
    * Funciones de comprobaciones de valores de argumentos
    *
    * TO DO: Separarlas en otro archivo para mejor orden del código.
    * */

    public static char comprobarCaracter(String entrante){
        boolean banderaNoNumero = false;

        try{
            int valor = Integer.parseInt(entrante);
        }catch (Exception e){
            banderaNoNumero = true;
        }

        if(entrante.length() == 1 && banderaNoNumero == true){
            char valor = entrante.charAt(0);
            return valor;
        }
        return 0;
    }

    public static int comprobarNumeros(String entrante){
        try{
            int valor = Integer.parseInt(entrante);
            return valor;
        }catch (Exception e){
            System.out.println("No es un valor valido");
        }
        return 0;
    }

    public static char comprobarOrdenamiento(String entrante){
        char  valor  = comprobarCaracter(entrante.toLowerCase());


        if(valor == 'b'){
            return valor;
        }

        return 0;
    }

    public static char comprobarTipoLista(String entrante){
        char  valor  = comprobarCaracter(entrante.toLowerCase());

        if(valor == 'n' || valor == 'c'){
            return valor;
        }
        return 0;
    }

    public static char comprobarColorPieza(String entrante){
        char  valor  = comprobarCaracter(entrante.toLowerCase());

        if(valor == 'n' || valor == 'b'){
            return valor;
        }

        return 0;
    }

    public static int comprobarCantidadPiezas(String entrante){
        int  valor  = comprobarNumeros(entrante);

        if(valor >= 1 && valor <= 16){
            return valor;
        }
        return 0;
    }

    public static int comprobarvelocidad(String entrante){
        int  valor  = comprobarNumeros(entrante);

        if(valor >= 100 && valor <= 1000){
            return valor;
        }
        return 0;
    }

    /*
    * Funciones de ordenamiento tipo burbuja
    *
    * TO DO: - Buscar la manera de funcionar las funciones en una sola que ordene los dos tipos de listas
    *        - Buscar la manera de fucionar las funciones descendentes y ascendentes.
    *        - Buscar más tipos de ordenamiento para el proyecto
    * */


    public static char[] ordenamientoBurbujaCaracteresAscendente(char[] lista){
        char aux;
        for(int i=0 ; i<lista.length-1; i++){
            for(int j=0; j<lista.length-1; j++){
                if(lista[j] > lista[j+1]){
                    aux = lista[j];
                    lista[j] = lista[j+1];
                    lista[j+1] = aux;
                }
            }
        }
        return lista;
    }

    public static char[] ordenamientoBurbujaCaracteresDescendente(char[] lista){
        char aux;
        for(int i=0 ; i<lista.length-1; i++){
            for(int j=0; j<lista.length-1; j++){
                if(lista[j] < lista[j+1]){
                    aux = lista[j];
                    lista[j] = lista[j+1];
                    lista[j+1] = aux;
                }
            }
        }
        return lista;
    }

    public static int[] ordenamientoBurbujaNumerosAscendente(int[] lista){
        int aux;
        for(int i=0 ; i<lista.length-1; i++){
            for(int j=0; j<lista.length-1; j++){
                if(lista[j] > lista[j+1]){
                    aux = lista[j];
                    lista[j] = lista[j+1];
                    lista[j+1] = aux;
                }
            }
        }
        return lista;
    }

    public static int[] ordenamientoBurbujaNumerosDescendente(int[] lista){
        int aux;
        for(int i=0 ; i<lista.length-1; i++){
            for(int j=0; j<lista.length-1; j++){
                if(lista[j] < lista[j+1]){
                    aux = lista[j];
                    lista[j] = lista[j+1];
                    lista[j+1] = aux;
                }
            }
        }
        return lista;
    }



}