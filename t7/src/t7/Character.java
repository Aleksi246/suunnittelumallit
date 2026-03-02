package t7;

import java.util.Scanner;

public class Character {
    private String name;
    private int xp = 0;
    private int hp = 100;
    private State lvl;

    private State namingstate = new Namingstate(this);
    private State novice = new Novice(this);
    private State intermediate = new Intermediate(this);
    private State expert = new Expert(this);
    private State master = new Master(this);
    private State end = new End(this);

    public Scanner scanner = new Scanner(System.in);

    public Character(){
        this.lvl = namingstate;
    }

    public void operate(){
        while (true){
        this.lvl.action();
        }
    }


//reusable functions
    public int readUserChoice(String[] options) {
        // print options
        System.out.println("\nSelect an option:");
        for (int i = 1; i <= options.length; i++) {
            System.out.println(i + ". " + options[i-1]);
        }
        // read user input
        return scanner.nextInt();
    }

    public void printStats(){
        System.out.println("");
        System.out.println(this.name + " stats:");
        System.out.println("xp: " + this.xp);
        System.out.println("hp: " + this.hp);
    }


//setters
    public void setLvlNa(){
        this.lvl = namingstate;
    }
    public void setLvlN(){
        this.lvl = novice;
    }
    public void setLvlI(){
        this.lvl = intermediate;
    }
    public void setLvlE(){
        this.lvl = expert;
    }
    public void setLvlM(){
        this.lvl = master;
    }


    public void setName(String name){
        this.name = name;
    }
    public void train(){
        this.xp += 10;
    }
    public void meditate(){
        this.hp += 10;
    }
    public void fight(){
        this.hp -= 50;
        this.xp += 10;
        if (this.hp <= 0){
            this.lvl = end;
        }
    }
    public void startNew(){
        this.xp = 0;
        this.hp = 100;
    }

//getters
    public String getname(){
        return this.name;
    }
    public int getHp(){
        return this.hp;
    }
    public int getXp(){
        return this.xp;
    }
}
