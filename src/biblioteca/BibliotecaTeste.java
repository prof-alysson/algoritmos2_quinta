package src.biblioteca;

import java.util.Date;

public class BibliotecaTeste {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro = new Livro();
        livro.setAutor("Machado de Asis");
        livro.setTitulo("Memórias póstumas de Brás Cubas");
        livro.setAnoPublicacao(2023);
        livro.setBiblioteca(biblioteca);
        biblioteca.setLivro(livro);

        Livro outroLivro = new Livro();
        outroLivro.setTitulo("O Senhor dos Anéis");
        outroLivro.setAnoPublicacao(2003);
        outroLivro.setAutor("J. R. R. Tokien");
        outroLivro.setBiblioteca(biblioteca);
        biblioteca.setLivro(outroLivro);

        Livro maisUmLivro = new Livro();
        maisUmLivro.setAnoPublicacao(2019);
        maisUmLivro.setAutor("Musashi");
        maisUmLivro.setTitulo("Os cinco anéis");
        maisUmLivro.setBiblioteca(biblioteca);
        biblioteca.setLivro(maisUmLivro);


        Date dataDevolucao =  new Date(2024, 9, 15);
        Emprestimo emprestimo = new Emprestimo(livro, "Amadeus", dataDevolucao);;

        Date novaData = new Date(2024, 9, 22);
        Emprestimo outroEmprestimo = new Emprestimo(maisUmLivro, "Carlos", novaData);;

        for (Livro l : livro.todosLivrosEmprestados()){
            System.out.printf("Livros emprestado: " + l.getTitulo() + '\n');
        };

    }
}
