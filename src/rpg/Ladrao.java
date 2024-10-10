package src.rpg;

public class Ladrao extends Classe {
    private Boolean visivel = true;

    Ladrao(Integer HP, Integer SP){
        super(HP, SP);
    }

    public void ficarInvisivel(){
        this.visivel = false;
    }
}
