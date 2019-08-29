package br.com.caelum.ed.filas.testes;

import br.com.caelum.ed.filas.FilaParametrizada;
import br.com.caelum.ed.objetos.Aluno;

public class TesteParametrizadaErro {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        FilaParametrizada<String> filaDeString = new FilaParametrizada<String>();
        // este código não compila
        filaDeString.insere(aluno);
    }
}