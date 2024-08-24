import java.util.HashMap;
import java.util.Map;

class Voto {
    private String candidato;
    private String identificador;

    public Voto(String candidato, String identificador) {
        this.candidato = candidato;
        this.identificador = identificador;
    }

    public String getCandidato() {
        return candidato;
    }

    public String getIdentificador() {
        return identificador;
    }
}

public class Main {
    public static void main(String[] args) {
        Voto[] votos = {
                new Voto("Candidato A", "1"),
                new Voto("Candidato A", "1"), // Voto duplicado
                new Voto("Candidato B", "1"),
                new Voto("Candidato C", "1"),
                new Voto("Candidato A", "1"), // Voto duplicado
                new Voto("Candidato C", "1"), // Voto duplicado
                new Voto("Candidato B", "1"), // Voto duplicado
                new Voto("Candidato B", "2"),
                new Voto("Candidato A", "3"),
                new Voto("Candidato A", "4")
        };

        Map<String, Integer> escrutinio = new HashMap<>();

        for (Voto voto : votos) {
            escrutinio.put(voto.getCandidato(), escrutinio.getOrDefault(voto.getCandidato(), 0) + 1);
        }

        System.out.println("Escrutinio:");
        for (Map.Entry<String, Integer> entry : escrutinio.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }
}

