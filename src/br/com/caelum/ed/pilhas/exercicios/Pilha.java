package br.com.caelum.ed.pilhas.exercicios;

import java.util.LinkedList;
import java.util.List;
import br.com.caelum.ed.objetos.Peca;

public class Pilha {
    private List<Peca> pecas = new LinkedList<Peca>();
    
    public void insere(Peca peca) {
        this.pecas.add(peca);
    }

    public Peca remove() {
        return this.pecas.remove(this.pecas.size() - 1);
    }

    public boolean vazia() {
        return this.pecas.size() == 0;
    }
}