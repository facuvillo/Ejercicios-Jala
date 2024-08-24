public class SistemaBiblioteca {
    public static void main(String args[]) {
        Biblioteca biblioteca = new Biblioteca();
        Usuario usuario1 = new Usuario("Carlos", "carlos@example.com", "12345");
        Usuario usuario2 = new Usuario("Marta", "marta@example.com", "54321");

        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", "1234", 1605, "Novela");
        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "5678", 1967, "Realismo mágico");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.registrarUsuario(usuario1);
        biblioteca.registrarUsuario(usuario2);

        biblioteca.prestarLibro("1234", "Carlos", "carlos@example.com", "12345", "01-01-2024");
        biblioteca.prestarLibro("5678", "Marta", "marta@example.com", "54321", "01-02-2024");
        biblioteca.devolverLibro("1234", "Carlos", "carlos@example.com", "12345", "15-01-2024");

        biblioteca.mostrarLibrosDisponibles();
        biblioteca.mostrarUsuariosRegistrados();
    }
}

class Libro {
    String titulo;
    String autor;
    String ISBN;
    int anioPublicacion;
    String genero;
    boolean disponible;

    public Libro(String t, String a, String i, int anio, String g) {
        this.titulo = t;
        this.autor = a;
        this.ISBN = i;
        this.anioPublicacion = anio;
        this.genero = g;
        this.disponible = true;
    }

    public void mostrarInfoLibro() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", ISBN: " + ISBN + ", Año: " + anioPublicacion + ", Género: " + genero + ", Disponible: " + disponible);
    }
}

class Usuario {
    String nombre;
    String correo;
    String idUsuario;

    public Usuario(String n, String c, String id) {
        this.nombre = n;
        this.correo = c;
        this.idUsuario = id;
    }

    public void mostrarInfoUsuario() {
        System.out.println("Nombre: " + nombre + ", Correo: " + correo + ", ID: " + idUsuario);
    }
}

class Biblioteca {
    Libro[] listaLibros = new Libro[10];
    Usuario[] listaUsuarios = new Usuario[10];
    String[] listaPrestamos = new String[10];
    int contadorLibros = 0;
    int contadorUsuarios = 0;
    int contadorPrestamos = 0;

    public void agregarLibro(Libro l) {
        if (contadorLibros < listaLibros.length) {
            listaLibros[contadorLibros] = l;
            contadorLibros++;
        } else {
            System.out.println("No hay espacio para más libros.");
        }
    }

    public void registrarUsuario(Usuario u) {
        if (contadorUsuarios < listaUsuarios.length) {
            listaUsuarios[contadorUsuarios] = u;
            contadorUsuarios++;
        } else {
            System.out.println("No hay espacio para más usuarios.");
        }
    }

    public void prestarLibro(String ISBN, String nombreUsuario, String correoUsuario, String idUsuario, String fechaPrestamo) {
        for (int i = 0; i < contadorLibros; i++) { // Recorre libros.
            if (listaLibros[i].ISBN.equals(ISBN) && listaLibros[i].disponible) { // Verifica disponibilidad.
                for (int j = 0; j < contadorUsuarios; j++) { // Recorre usuarios.
                    if (listaUsuarios[j].nombre.equals(nombreUsuario) && listaUsuarios[j].correo.equals(correoUsuario) && listaUsuarios[j].idUsuario.equals(idUsuario)) {
                        listaPrestamos[contadorPrestamos] = "Usuario: " + nombreUsuario + " ha tomado prestado el libro con ISBN: " + ISBN + " el " + fechaPrestamo;
                        listaLibros[i].disponible = false; // Marca como no disponible.
                        contadorPrestamos++; // Incrementa contador de préstamos.
                        System.out.println(nombreUsuario + " ha tomado prestado el libro con ISBN: " + ISBN); // Mensaje.
                        return;
                    }
                }
                System.out.println("Usuario no registrado."); // Mensaje de error.
                return;
            }
        }
        System.out.println("Libro no disponible o no encontrado."); // Mensaje de error.
    }

    public void devolverLibro(String ISBN, String nombreUsuario, String correoUsuario, String idUsuario, String fechaDevolucion) { // Devuelve un libro.
        for (int i = 0; i < contadorLibros; i++) { // Recorre libros.
            if (listaLibros[i].ISBN.equals(ISBN) && !listaLibros[i].disponible) { // Verifica si fue prestado.
                for (int j = 0; j < contadorUsuarios; j++) { // Recorre usuarios.
                    if (listaUsuarios[j].nombre.equals(nombreUsuario) && listaUsuarios[j].correo.equals(correoUsuario) && listaUsuarios[j].idUsuario.equals(idUsuario)) {
                        for (int k = 0; k < contadorPrestamos; k++) { // Recorre préstamos.
                            if (listaPrestamos[k] != null && listaPrestamos[k].contains(ISBN) && listaPrestamos[k].contains(nombreUsuario)) {
                                listaPrestamos[k] = null; // Elimina el préstamo.
                                listaLibros[i].disponible = true; // Marca como disponible.
                                System.out.println(nombreUsuario + " ha devuelto el libro con ISBN: " + ISBN); // Mensaje.
                                return;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Error en la devolución del libro."); // Mensaje de error.
    }

    public void mostrarLibrosDisponibles() { // Muestra libros disponibles.
        for (int i = 0; i < contadorLibros; i++) { // Recorre libros.
            if (listaLibros[i].disponible) { // Verifica si está disponible.
                listaLibros[i].mostrarInfoLibro(); // Muestra información.
            }
        }
    }

    public void mostrarUsuariosRegistrados() { // Muestra usuarios registrados.
        for (int i = 0; i < contadorUsuarios; i++) { // Recorre usuarios.
            listaUsuarios[i].mostrarInfoUsuario(); // Muestra información.
        }
    }
}