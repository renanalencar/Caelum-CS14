package br.com.caelum.ed.filas;

import java.util.LinkedList;
import java.util.List;

import br.com.caelum.ed.objetos.Aluno;

public class Fila {
    private List<Aluno> alunos = new LinkedList<Aluno>();
    
    public void insere(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public Aluno remove() {
        return this.alunos.remove(0);
    }

    public boolean vazia() {
        return this.alunos.size() == 0;
    }
}