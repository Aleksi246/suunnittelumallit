package t7;

public abstract class State {
    private Character character;

    public State(Character character){
        this.character = character;

    }

    public Character getCharacter(){
        return this.character;
    }

    abstract void action();
    
}
