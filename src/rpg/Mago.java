package src.rpg;

public class Mago extends Classe{
    Mago(Integer HP, Integer SP){
        super(HP, SP);
    }
    public void castarMagia(String magia){
        System.out.println(magia);
    }
}
