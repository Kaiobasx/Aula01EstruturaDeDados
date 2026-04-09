public class ListaDuplamenteEncadeada<Tipo> {
    
    private No<Tipo> inicio;
    private No<Tipo> fim;
    private int tamanho;

    public ListaDuplamenteEncadeada() {
        this.tamanho = 0;
    }

    // Métodos de Acesso
    public No<Tipo> getInicio() { return inicio; }
    public No<Tipo> getFim() { return fim; }
    public int getTamanho() { return tamanho; }

    // Adiciona sempre no final
    public void adiciona(Tipo elemento) {
        No<Tipo> celula = new No<>(elemento);
        
        if (this.tamanho == 0) {
            this.inicio = celula;
            this.fim = celula;
        } else {
            this.fim.setProximo(celula); // O antigo fim aponta para a nova célula
            celula.setAnterior(this.fim); // A nova célula aponta para trás (antigo fim)
            this.fim = celula; // A nova célula vira o novo fim
        }
        this.tamanho++;
    }

    // Busca um elemento por posição
    public No<Tipo> get(int posicao) {
        No<Tipo> atual = this.inicio;
        for (int i = 0; i < posicao; i++) {
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        }
        return atual;
    }

    // Remove um elemento
    public void remover(Tipo elemento) {
        No<Tipo> atual = this.inicio;
        
        for (int i = 0; i < this.tamanho; i++) {
            if (atual.getElemento().equals(elemento)) {
                
                if (this.tamanho == 1) { 
                    // Caso 1: Só tem 1 elemento na lista
                    this.inicio = null;
                    this.fim = null;
                } else if (atual == inicio) { 
                    // Caso 2: Removendo o primeiro
                    this.inicio = atual.getProximo();
                    this.inicio.setAnterior(null); // O novo início não tem ninguém antes dele
                } else if (atual == fim) { 
                    // Caso 3: Removendo o último
                    this.fim = atual.getAnterior();
                    this.fim.setProximo(null); // O novo fim não tem ninguém depois dele
                } else { 
                    // Caso 4: Removendo do meio
                    // O de trás aponta para o da frente, pulando o atual
                    atual.getAnterior().setProximo(atual.getProximo());
                    // O da frente aponta para o de trás, pulando o atual
                    atual.getProximo().setAnterior(atual.getAnterior());
                }
                
                atual = null;
                this.tamanho--;
                break;
            }
            atual = atual.getProximo();
        }
    }

    // Método para imprimir a lista do início ao fim
    @Override
    public String toString() {
        if (this.tamanho == 0) return "Lista Vazia";
        
        StringBuilder builder = new StringBuilder("[");
        No<Tipo> atual = this.inicio;
        for (int i = 0; i < this.tamanho - 1; i++) {
            builder.append(atual.getElemento()).append(" <-> ");
            atual = atual.getProximo();
        }
        builder.append(atual.getElemento()).append("]");
        return builder.toString();
    }
}