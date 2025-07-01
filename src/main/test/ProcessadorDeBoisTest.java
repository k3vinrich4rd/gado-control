package main.test;

import main.Boi;
import main.ProcessadorDeBois;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProcessadorDeBoisTest {

    private ProcessadorDeBois processadorDeBois;
    private Boi boi1;
    private Boi boi2;
    private Boi boi3;

    @BeforeEach
    void setup() {
        processadorDeBois = new ProcessadorDeBois();
    }

    @Test
    @DisplayName("Deve adicionar um boi com sucesso à lista")
    void adicionarBoiComSucesso() {
        boi1 = new Boi("Boi1", 10, 500.0);
        processadorDeBois.adicionarBoi(boi1);
        List<Boi> bois = processadorDeBois.getBois();
        assertEquals(1, bois.size());
        assertEquals(boi1, bois.get(0));
    }

    @Test
    @DisplayName("Deve retornar soma de peso zero ao adicionar boi com peso padrão")
    void somaDePesoDeUmBoiEmpty() {
        boi3 = new Boi();
        processadorDeBois.adicionarBoi(boi3);
        assertEquals(0.0, processadorDeBois.somaPeso());
    }

    @Test
    @DisplayName("Deve somar corretamente o peso de um boi")
    void somaDePesoDeUmBoi() {
        boi1 = new Boi("Boi1", 20, 300.0);
        processadorDeBois.adicionarBoi(boi1);
        assertEquals(300.0, processadorDeBois.somaPeso());
    }

    @Test
    @DisplayName("Deve somar corretamente o peso de dois bois")
    void somaDePesoDeDoisBoi() {
        boi1 = new Boi("Boi1", 20, 500.0);
        boi2 = new Boi("Boi2", 20, 2500.0);
        processadorDeBois.adicionarBoi(boi1);
        processadorDeBois.adicionarBoi(boi2);
        assertEquals(3000.0, processadorDeBois.somaPeso());
    }

    @Test
    @DisplayName("Deve retornar soma de idade zero ao adicionar boi com idade padrão")
    void somaDaIdadeDeUmBoiEmpty() {
        boi3 = new Boi();
        processadorDeBois.adicionarBoi(boi3);
        assertEquals(0, processadorDeBois.somaIdade());
    }

    @Test
    @DisplayName("Deve somar corretamente a idade de um boi")
    void somaDeIdadeDeUmBoi() {
        boi1 = new Boi("Boi1", 20, 500.0);
        processadorDeBois.adicionarBoi(boi1);
        assertEquals(20, processadorDeBois.somaIdade());
    }

    @Test
    @DisplayName("Deve somar corretamente a idade de dois bois")
    void somaDeIdadeDeDoisBoi() {
        boi1 = new Boi("Boi1", 20, 500.0);
        boi2 = new Boi("Boi2", 10, 2500.0);
        processadorDeBois.adicionarBoi(boi1);
        processadorDeBois.adicionarBoi(boi2);
        assertEquals(30, processadorDeBois.somaIdade());
    }

    @Test
    @DisplayName("Deve retornar média de peso zero ao adicionar boi com peso padrão")
    void mediaPesoEmpty() {
        boi3 = new Boi();
        processadorDeBois.adicionarBoi(boi3);
        assertEquals(0.0, processadorDeBois.mediaPeso());
    }

    @Test
    @DisplayName("Deve calcular corretamente a média de peso de dois bois")
    void mediaPesoBois() {
        boi1 = new Boi("Boi1", 20, 500.0);
        boi2 = new Boi("Boi2", 20, 2500.0);
        processadorDeBois.adicionarBoi(boi1);
        processadorDeBois.adicionarBoi(boi2);
        assertEquals(1500.0, processadorDeBois.mediaPeso(), 0.0001);
    }

    @Test
    @DisplayName("Deve retornar média de idade zero ao adicionar boi com idade padrão")
    void mediaIdadeEmpty() {
        boi3 = new Boi();
        processadorDeBois.adicionarBoi(boi3);
        assertEquals(0.0, processadorDeBois.mediaIdade(), 0.0001);
    }

    @Test
    @DisplayName("Deve calcular corretamente a média de idade de dois bois")
    void mediaIdadeBois() {
        boi1 = new Boi("Boi1", 10, 500.0);
        boi2 = new Boi("Boi2", 20, 2500.0);
        processadorDeBois.adicionarBoi(boi1);
        processadorDeBois.adicionarBoi(boi2);
        assertEquals(15.0, processadorDeBois.mediaIdade(), 0.0001);
    }

    @Test
    @DisplayName("Deve retornar null ao buscar boi mais jovem em lista vazia")
    void boiMaisJovemNull() {
        Boi boi = processadorDeBois.boiMaisJovem();
        assertNull(boi);
    }

    @Test
    @DisplayName("Deve retornar o boi mais jovem corretamente")
    void boiMaisJovem() {
        boi1 = new Boi("Boi1", 10, 500.0);
        boi2 = new Boi("Boi2", 20, 2500.0);
        processadorDeBois.adicionarBoi(boi1);
        processadorDeBois.adicionarBoi(boi2);
        assertEquals(10, processadorDeBois.boiMaisJovem().getIdade());
    }

    @Test
    @DisplayName("Deve retornar null ao buscar boi mais velho em lista vazia")
    void boiMaisVelhoNull() {
        Boi boi = processadorDeBois.boiMaisVelho();
        assertNull(boi);
    }

    @Test
    @DisplayName("Deve retornar o boi mais velho corretamente")
    void boiMaisVelho() {
        boi1 = new Boi("Boi1", 10, 500.0);
        boi2 = new Boi("Boi2", 20, 2500.0);
        processadorDeBois.adicionarBoi(boi1);
        processadorDeBois.adicionarBoi(boi2);
        assertEquals(20, processadorDeBois.boiMaisVelho().getIdade());
    }

    @Test
    @DisplayName("Deve retornar null ao buscar boi mais leve em lista vazia")
    void boiMaisLeveNull() {
        Boi boi = processadorDeBois.boiMaisLeve();
        assertNull(boi);
    }

    @Test
    @DisplayName("Deve retornar o boi mais leve corretamente")
    void boiMaisLeve() {
        boi1 = new Boi("Boi1", 10, 500.0);
        boi2 = new Boi("Boi2", 20, 2500.0);
        processadorDeBois.adicionarBoi(boi1);
        processadorDeBois.adicionarBoi(boi2);
        assertEquals(500.0, processadorDeBois.boiMaisLeve().getPeso());
    }

    @Test
    @DisplayName("Deve retornar null ao buscar boi mais pesado em lista vazia")
    void boiMaisPesadoNull() {
        Boi boi = processadorDeBois.boiMaisPesado();
        assertNull(boi);
    }

    @Test
    @DisplayName("Deve retornar o boi mais pesado corretamente")
    void boiMaisPesado() {
        boi1 = new Boi("Boi1", 10, 500.0);
        boi2 = new Boi("Boi2", 20, 2500.0);
        processadorDeBois.adicionarBoi(boi1);
        processadorDeBois.adicionarBoi(boi2);
        assertEquals(2500.0, processadorDeBois.boiMaisPesado().getPeso());
    }

    @Test
    @DisplayName("Deve exibir corretamente o toString do main.ProcessadorDeBois")
    void testToString() {
        boi1 = new Boi("Boi1", 5, 500.0);
        boi2 = new Boi("Boi2", 7, 700.0);
        processadorDeBois.adicionarBoi(boi1);
        processadorDeBois.adicionarBoi(boi2);

        String expected = "main.ProcessadorDeBois {\n" +
                "  Bois: " + Arrays.asList(boi1, boi2) + "\n" +
                "}";

        assertEquals(expected, processadorDeBois.toString());
    }
}