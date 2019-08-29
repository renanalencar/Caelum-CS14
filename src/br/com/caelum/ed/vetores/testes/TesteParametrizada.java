package br.com.caelum.ed.vetores.testes;

import java.util.ArrayList;

import br.com.caelum.ed.objetos.Aluno;

public class TesteParametrizada {
    public static void main(String[] args) {
        ArrayList<Aluno> vetorSemGenerics = new ArrayList<Aluno>();
        ArrayList<Aluno> vetorComGenerics = new ArrayList<Aluno>();
        Aluno aluno = new Aluno();
        vetorSemGenerics.add(aluno);
        vetorComGenerics.add(aluno);
        Aluno a1 = (Aluno) vetorSemGenerics.get(0);
        Aluno a2 = vetorComGenerics.get(0);
    }
    }