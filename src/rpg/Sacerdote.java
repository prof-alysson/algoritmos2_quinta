package src.rpg;

public class Sacerdote extends Classe {

    Sacerdote (Integer HP, Integer SP){
        super(HP, SP);
    }

    public void fazerMilager(String milagre){
        System.out.println(milagre);
    }

}
