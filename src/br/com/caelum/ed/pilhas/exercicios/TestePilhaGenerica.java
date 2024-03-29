package br.com.caelum.ed.pilhas.exercicios;

import br.com.caelum.ed.objetos.Peca;

public class TestePilhaGenerica {
    public static void main(String[] args) {
        PilhaGenerica pilhaDePecas = new PilhaGenerica();
        Peca peca = new Peca();
        pilhaDePecas.insere(peca);
        Peca pecaRemovida = (Peca) pilhaDePecas.remove();
        if(peca != pecaRemovida){
            System.out.println("Erro: a peça removida não é igual " + " a que foi inserida");
        }
        if (!pilhaDePecas.vazia()) {
            System.out.println("Erro: A pilha não está vazia");
        }
    }
}