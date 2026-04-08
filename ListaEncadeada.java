public class ListaEncadeada<Tipo> {
    
    private No inicio;
    private No fim;
    private int tamanho;

    // Método Construtor
    public ListaEncadeada() {
        this.tamanho = 0;
    }

    // Métodos de Acesso
    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    public No getFim() {
        return fim;
    }

    public void setFim(No fim) {
        this.fim = fim;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    // Método de Exibição
    @Override
    public String toString() {
        return "ListaEncadeada{" + "inicio=" + inicio + '}';
    }

    // Método para adicionar elemento
    public void adiciona(Tipo elemento) {
        No<Tipo> celula = new No<Tipo>(elemento);
        if (this.inicio == null && this.fim == null) {
            this.inicio = celula;
            this.fim = celula;
        } else {
            this.fim.setProximo(celula);
            this.fim = celula;
        }
        this.tamanho++;
    }

    // Método para buscar o Nó
    public No get(int posicao) {
        No atual = this.inicio;
        for (int i = 0; i < posicao; i++) {
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        }
        return atual;
    }

    // Método para remover Nó (trata início, meio e fim)
    public void remover(Tipo elemento) {
        No anterior = null;
        No atual = this.inicio;
        
        for (int i = 0; i < this.getTamanho(); i++) {
            if (atual.getElemento().equals(elemento)) {
                
                if (this.tamanho == 1) { // Remover o único elemento
                    this.inicio = null;
                    this.fim = null;
                } else if (atual == inicio) { // Remover do início
                    this.inicio = atual.getProximo();
                    atual.setProximo(null);
                } else if (atual == fim) { // Remover do fim
                    this.fim = anterior;
                    anterior.setProximo(null);
                } else { // Remover do meio
                    anterior.setProximo(atual.getProximo());
                }
                
                atual = null;
                this.tamanho--;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }
}