package t7;

public class Novice extends State{
    final private int LVLCAP = 100;

    public Novice(Character character){
        super(character);
    }

    public void action(){
        String[] choises =  {"train"};

        this.getCharacter().printStats();

        switch (this.getCharacter().readUserChoice(choises)) {
            case 1:
                this.getCharacter().train();
                if(this.getCharacter().getXp() >= LVLCAP){
                    this.getCharacter().setLvlI();
                }
                break;
        
        }

    }
}
