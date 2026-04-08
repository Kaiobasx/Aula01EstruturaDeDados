public class Teste {

    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor(5);

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");
        vetor.adiciona("elemento 4");
        vetor.adiciona("elemento 5");
        vetor.adiciona("elemento 6");
        vetor.adiciona("elemento 7");
        vetor.adiciona("elemento 8");
        vetor.adiciona("elemento 9");

        vetor.remove("elemento 1");
        System.out.println("Quantidade de dados no vetor: " + vetor.tamanho());
        System.out.println(vetor.toString());
        System.out.println(vetor.busca(1));
    }

}