package t7;

public class End extends State{

    public End(Character character){
        super(character);
    }

    public void action(){
        System.out.println("you died :(");
        String[] choises =  {"new game"};
        this.getCharacter().printStats();

        switch (this.getCharacter().readUserChoice(choises)) {
            case 1:
                this.getCharacter().setLvlNa();
                this.getCharacter().startNew();
        
        }
    }
}
