public class Lista {

    public static void main(String[] args) {
        
        ListaDuplamenteEncadeada<String> lista = new ListaDuplamenteEncadeada<>();
        
        lista.adiciona("Claudio");
        lista.adiciona("Camila");
        lista.adiciona("Miguel");
        lista.adiciona("Elis");

        System.out.println("Lista Completa: " + lista);
        System.out.println("Tamanho: " + lista.getTamanho());
        System.out.println("Início: " + lista.getInicio().getElemento());
        System.out.println("Fim: " + lista.getFim().getElemento());

        System.out.println("\n--- Testando a Remoção ---");
        lista.remover("Camila"); // Removendo do meio
        System.out.println("Após remover Camila: " + lista);
        
        lista.remover("Claudio"); // Removendo do início
        System.out.println("Após remover Claudio: " + lista);
        System.out.println("Novo Início: " + lista.getInicio().getElemento());

        System.out.println("\n--- Percorrendo de Trás para Frente ---");
        // Isso só é possível por causa do ponteiro "anterior"!
        No<String> atual = lista.getFim();
        while (atual != null) {
            System.out.print(atual.getElemento() + " -> ");
            atual = atual.getAnterior();
        }
        System.out.println("null");
    }
}