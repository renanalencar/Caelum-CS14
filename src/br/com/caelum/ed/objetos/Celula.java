package br.com.caelum.ed.objetos;

public class Celula {
    private Celula proxima;
    private Object elemento;
    private Celula anterior;
    
    /* Construtor */
    public Celula(Celula proxima, Object elemento) {
        this.proxima = proxima;
        this.elemento = elemento;
    }

    /* Construtor */
    public Celula(Object elemento) {
        this.elemento = elemento;
    }

    /* Alterar o próximo elemento */
    public void setProxima(Celula proxima) {
        this.proxima = proxima;
    }

    /* Recuperar o próximo elemento */
    public Celula getProxima() {
        return proxima;
    }

    /* Recuperar o elemento */
    public Object getElemento() {
        return elemento;
    }

    /* */
    public Celula getAnterior() {
        return anterior;
    }

    /* */
    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }
}