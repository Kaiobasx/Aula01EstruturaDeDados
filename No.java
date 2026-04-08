public class No<Tipo> {
    
    private Tipo elemento;
    private No<Tipo> proximo;

    // Construtor 1
    public No(Tipo elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }

    // Construtor 2
    public No(Tipo elemento, No<Tipo> proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    // Métodos de Acesso
    public Tipo getElemento() {
        return elemento;
    }

    public void setElemento(Tipo elemento) {
        this.elemento = elemento;
    }

    public No<Tipo> getProximo() {
        return proximo;
    }

    public void setProximo(No<Tipo> proximo) {
        this.proximo = proximo;
    }

    // Método de Exibição
    @Override
    public String toString() {
        return "No{" + "elemento=" + elemento + ", proximo=" + proximo + '}';
    }
}
