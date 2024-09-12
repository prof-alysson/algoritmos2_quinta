package src.biblioteca;

import java.util.ArrayList;

public class Biblioteca {

    ArrayList<Livro> livros = new ArrayList<Livro>();

    public void setLivro(Livro livro){
        livros.add(livro);
    }

    public ArrayList<Livro> todosLivros() {
        return livros;
    }
}
