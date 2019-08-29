package br.com.caelum.ed.listasligadas.exercicios;

public class ListaLigada {
    private Celula primeira;
    private Celula ultima;
    private int totalDeElementos;
    
    public void adiciona(Object elemento) {
        // Implementação
    }
    
    public void adiciona(int posicao, Object elemento) {
        // Implementação
    }
    
    public Object pega(int posicao) {
        return null;
    }

    public void remove(int posicao) {
        // Implementação
    }
    
    public int tamanho() {
        return 0;
    }

    public boolean contem(Object o) {
        return false;
    }

    public void adicionaNoComeco(Object elemento) {
        // Implementação
    }
    
    public void removeDoComeco() {
        // Implementação
    }
    
    public void removeDoFim() {
        // Implementação
    }
    
    public String toString() {
        // Verificando se a Lista está vazia
        if(this.totalDeElementos == 0){
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        Celula atual = primeira;
        // Percorrendo até o penúltimo elemento.
        for (int i = 0; i < this.totalDeElementos - 1; i++) {
            builder.append(atual.getElemento());
            builder.append(", ");
            atual = atual.getProxima();
        }
        // último elemento
        builder.append(atual.getElemento());
        builder.append("]");
        return builder.toString();
    }
}
