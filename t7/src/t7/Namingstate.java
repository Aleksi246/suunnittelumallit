package t7;



public class Namingstate extends State{


    public Namingstate(Character character){
    super(character);
    }
    

    public void action() {
        System.out.println("select a name: ");
        String name = this.getCharacter().scanner.nextLine();
        this.getCharacter().setName(name);

        this.getCharacter().setLvlN();
        
    }
}
