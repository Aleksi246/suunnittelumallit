package t7;

public class Intermediate extends State{
    final private int LVLCAP = 200;
    
    public Intermediate(Character character){
        super(character);
    }

    public void action(){
        String[] choises =  {"train","meditate"};
        this.getCharacter().printStats();
        switch (this.getCharacter().readUserChoice(choises)) {
            case 1:
                this.getCharacter().train();
                if(this.getCharacter().getXp() >= LVLCAP){
                    this.getCharacter().setLvlE();
                }
                break;
            case 2:
                this.getCharacter().meditate();
                break;
        
        }
        
    }
}
