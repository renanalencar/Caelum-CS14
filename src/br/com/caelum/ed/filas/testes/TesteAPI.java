package br.com.caelum.ed.filas.testes;

import java.util.LinkedList;
import java.util.Queue;

import br.com.caelum.ed.objetos.Aluno;

public class TesteAPI {
    public static void main(String[] args) {
        Queue<Aluno> fila = new LinkedList<Aluno>();
        Aluno aluno = new Aluno();
        fila.offer(aluno);
        Aluno alunoRemovido = (Aluno)fila.poll();
        if(fila.isEmpty()){
            System.out.println("A fila está vazia");
        }
    }
}