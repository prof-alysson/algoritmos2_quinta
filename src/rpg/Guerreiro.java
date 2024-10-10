package src.rpg;

public class Guerreiro extends Classe {
    Guerreiro(Integer HP, Integer SP){
        super(HP, SP);
    }

    public void usarArmadura(String armadura){
        System.out.println(armadura);
    }
}
