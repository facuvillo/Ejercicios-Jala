public class Main {
    public static void main(String[] args) {
        Servidor servidor = new Servidor(5);

        servidor.recibirPeticion(new Peticion("Tarea 4", 3));
        servidor.recibirPeticion(new Peticion("Tarea 2", 2));
        servidor.recibirPeticion(new Peticion("Tarea 1", 1));
        servidor.recibirPeticion(new Peticion("Tarea 3", 1));
        servidor.recibirPeticion(new Peticion("Tarea 5", 1));

        servidor.recibirPeticion(new Peticion("Tarea 6", 2));
        servidor.recibirPeticion(new Peticion("Tarea 7", 3));
        servidor.recibirPeticion(new Peticion("Tarea 8", 1));
        servidor.recibirPeticion(new Peticion("Tarea 9", 2));
        servidor.recibirPeticion(new Peticion("Tarea 10", 3));
        servidor.recibirPeticion(new Peticion("Tarea 11", 10));
        servidor.recibirPeticion(new Peticion("Tarea 12", 1));
        servidor.recibirPeticion(new Peticion("Tarea 13", 3));
        servidor.recibirPeticion(new Peticion("Tarea 14", 2));
        servidor.recibirPeticion(new Peticion("Tarea 15", 3));

        servidor.ejecutar();
    }
}
