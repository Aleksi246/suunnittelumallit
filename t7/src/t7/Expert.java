package t7;

public class Expert extends State{
    final private int LVLCAP = 300;
    
    public Expert(Character character){
        super(character);
    }

    public void action(){
        String[] choises =  {"train","meditate","fight"};
        this.getCharacter().printStats();
        switch (this.getCharacter().readUserChoice(choises)) {
            case 1:
                this.getCharacter().train();
                if(this.getCharacter().getXp() >= LVLCAP){
                    this.getCharacter().setLvlM();
                }
                break;
            case 2:
                this.getCharacter().meditate();
                break;
            case 3:
                this.getCharacter().fight();
                if(this.getCharacter().getXp() >= LVLCAP){
                    this.getCharacter().setLvlM();
                }
        }
        
    }
    
}
