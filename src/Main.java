public class Main {
    public static void main (String[] args) {

        ProcessadorDeBois processadorDeBois = new ProcessadorDeBois();
        processadorDeBois.adicionarBoi(new Boi("Mapfre",5, 5000));
        processadorDeBois.adicionarBoi(new Boi("Fairfax",15, 1000));
        System.out.println("Soma total peso dos bois: " + processadorDeBois.somaPeso());
        System.out.println("Soma total idade dos bois: " + processadorDeBois.somaIdade());
        System.out.println("Média de pesos dos bois: " + processadorDeBois.mediaPeso());
        System.out.println("Média das idades dos bois: " + processadorDeBois.mediaIdade());
        System.out.println("Boi com a menor idade na lista: " + processadorDeBois.boiMaisJovem());
        System.out.println("Boi com a maior idade na lista: " + processadorDeBois.boiMaisVelho());
        System.out.println("Boi com maior peso na lista: " + processadorDeBois.boiMaisPesado());
        System.out.println("Boi com menor peso na lista: " + processadorDeBois.boiMaisLeve());
        System.out.println(processadorDeBois);


    }
}
