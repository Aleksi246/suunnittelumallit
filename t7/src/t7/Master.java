package t7;

public class Master extends State{
    
    
    public Master(Character character){
        super(character);
    }

    public void action(){
        System.out.println("you beat game!");
        String[] choises =  {"new game"};
        this.getCharacter().printStats();

        switch (this.getCharacter().readUserChoice(choises)) {
            case 1:
                this.getCharacter().setLvlNa();
                this.getCharacter().startNew();
        
        }
    }
    
}
