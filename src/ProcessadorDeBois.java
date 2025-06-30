import java.util.ArrayList;
import java.util.List;

public class ProcessadorDeBois {

    private final List<Boi> bois = new ArrayList<>();

    public void adicionarBoi(Boi boi) {
        bois.add(boi);
    }

    public double somaPeso() {
        double soma = 0.0;
        for (Boi boi : bois) {
            soma += boi.getPeso();
        }
        return soma;
    }

    public int somaIdade() {
        int soma = 0;
        for (Boi boi : bois) {
            soma += boi.getIdade();

        }
        return soma;
    }

    public double mediaPeso() {
        if (bois.isEmpty()) return 0.0;
        return somaPeso() / bois.size();
    }

    public int mediaIdade() {
        if (bois.isEmpty()) return 0;
        return somaIdade() / bois.size();
    }

    public Boi boiMaisJovem() {
        if (bois.isEmpty()) return null;

        Boi boiMaisNovo = bois.get(0);
        for (Boi boi : bois) {
            if (boi.getIdade() < boiMaisNovo.getIdade()) {
                boiMaisNovo = boi;
            }
        }
        return boiMaisNovo;
    }

    public Boi boiMaisVelho() {
        if (bois.isEmpty()) return null;

        Boi boiMaisVelho = bois.get(0);

        for (Boi boi : bois) {
            if (boi.getIdade() > boiMaisVelho.getIdade()) {
                boiMaisVelho = boi;
            }
        }
        return boiMaisVelho;
    }

    public Boi boiMaisPesado() {
        if (bois.isEmpty()) return null;

        Boi boiMaisPesado = bois.get(0);

        for (Boi boi : bois) {
            if (boi.getPeso() > boiMaisPesado.getPeso()) {
                boiMaisPesado = boi;
            }
        }
        return boiMaisPesado;
    }

    public Boi boiMaisLeve() {
        if (bois.isEmpty()) return null;

        Boi boiMaisLeve = bois.get(0);
        for (Boi boi : bois) {
            if (boi.getPeso() < boiMaisLeve.getPeso()) {
                boiMaisLeve = boi;
            }
        }
        return boiMaisLeve;
    }

    @Override
    public String toString() {
        return "ProcessadorDeBois {\n" +
                "  Bois: " + bois + "\n" +
                "}";
    }
}
