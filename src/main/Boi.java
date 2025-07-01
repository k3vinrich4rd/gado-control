package main;

public class Boi {

    private String nome;
    private int idade;
    private double peso;

    public Boi(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public Boi() {

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
        return String.format("main.Boi { nome: '%s', idade: %d anos, peso: %.2f kg }", nome, idade, peso);
    }
}
