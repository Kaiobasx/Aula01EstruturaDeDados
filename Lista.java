public class Lista {

    public static void main(String[] args) {
        
        ListaEncadeada<String> lista = new ListaEncadeada<>();
        
        // Testando a inserção
        lista.adiciona("Claudio");
        lista.adiciona("Camila");
        lista.adiciona("Miguel");
        lista.adiciona("Elis");

        System.out.println(lista);
        System.out.println("Tamanho da Lista = " + lista.getTamanho());
        System.out.println("Início da Lista = " + lista.getInicio().getElemento());
        System.out.println("Fim da Lista = " + lista.getFim().getElemento());

        // Testando a remoção
        lista.remover("Claudio");
        lista.remover("Camila");
        lista.remover("Miguel");
        lista.remover("Elis");

        System.out.println(lista);
        System.out.println("Tamanho da Lista = " + lista.getTamanho());
        
        /* Atenção: Se todos os elementos forem removidos (tamanho = 0), 
        tentar acessar lista.getInicio().getElemento() ou lista.getFim().getElemento()
        vai gerar um NullPointerException, conforme demonstrado no final da aula.
        */
    }
}