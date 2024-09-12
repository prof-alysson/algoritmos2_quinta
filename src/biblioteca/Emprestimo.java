package src.biblioteca;

import java.util.Date;

public class Emprestimo {
    private String nomeLeitor;
    private Date dataDevolucao;
    private Livro livroEmprestado;

    public Emprestimo(Livro livro, String leitor, Date devolucao){
        livro.emprestar();
        this.livroEmprestado = livro;
        this.nomeLeitor = leitor;
        this.dataDevolucao = devolucao;
    }

}
