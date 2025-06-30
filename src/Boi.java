public class Boi {

    private final String nome;
    private final int idade;
    private final double peso;

    public Boi(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public int getIdade() {
        return idade;
    }


    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return String.format("Boi { nome: '%s', idade: %d anos, peso: %.2f kg }", nome, idade, peso);
    }
}
