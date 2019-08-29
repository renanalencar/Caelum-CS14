package br.com.caelum.ed.filas.testes;

import br.com.caelum.ed.filas.Fila;
import br.com.caelum.ed.objetos.Aluno;

public class Teste {
    public static void main(String[] args) {
        Fila fila = new Fila();
        Aluno aluno = new Aluno();
        fila.insere(aluno);
        Aluno alunoRemovido = fila.remove();
        if (fila.vazia()) {
        System.out.println("A fila está vazia");
        }
    }
}