package br.com.caelum.ed.pilhas.testes;

import br.com.caelum.ed.objetos.Peca;
import br.com.caelum.ed.pilhas.PilhaParametrizada;

public class Teste {
    public static void main(String[] args) {
        PilhaParametrizada<Peca> pilha = new PilhaParametrizada<Peca>();
        Peca peca = new Peca();
        pilha.insere(peca);
        Peca pecaRemove = pilha.remove();
        if (pilha.vazia()) {
            System.out.println("A pilha está vazia");
        }
        PilhaParametrizada<String> pilha2 = new PilhaParametrizada<String>();
        pilha2.insere("Adalberto");
        pilha2.insere("Maria");
        String maria = pilha2.remove();
        String adalberto = pilha2.remove();
        System.out.println(maria);
        System.out.println(adalberto);
    }
}