package src.biblioteca;

import java.util.ArrayList;

public class Livro {
    private String titulo;
    private String autor;
    private Integer anoPublicacao;
    private Boolean emprestado = false;
    Biblioteca estaEmUma;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void setBiblioteca(Biblioteca ondeEsta) {
        this.estaEmUma = ondeEsta;
    }

    public void emprestar(){
        this.emprestado = true;
    }

    public String getTitulo() {
        return this.titulo;
    }
    public String getAutor() {
        return this.autor;
    }
    public Integer getAnoPublicacao() {
        return this.anoPublicacao;
    }
    public Boolean estaDisponivel() {
        return !this.emprestado; // retorna se o livro está disponível (não emprestado)
    }

    public ArrayList<Livro> todosLivrosEmprestados(){
        ArrayList<Livro> livros = new ArrayList<Livro>();
        for (Livro livro : this.estaEmUma.todosLivros() ){
            if(!livro.estaDisponivel()){
                livros.add(livro);
            }
        }
        return livros;
    }
}
