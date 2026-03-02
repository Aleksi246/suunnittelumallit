package t8;

import java.util.Scanner;

public class ShutTheBox extends Game{
    Player[] players;
    Scanner scanner = new Scanner(System.in);

    public void initializeGame(int numberOfPlayers){
        players = new Player[numberOfPlayers];

        for(int i = 0; i < numberOfPlayers;i++){
            players[i] = new Player();
        }
        for (Player player : players) {
            System.out.println(player);
        }
    }

    public void playSingleTurn(int player){

        System.out.println("player " + (player+1) + " turn");

        //roll dice
        int die1 = (int)(Math.random() * 6)+ 1;
        int die2 = (int)(Math.random() * 6)+ 1;

        logic(die1,die2,player);

        
    }

    public boolean endOfGame(){
        for (Player player : players) {
            boolean winner = true;
            for (int i : player.getNums()) {
                if(i != 0){
                    winner = false;
                }
            }
            if(winner){
                return true;
            }
        }
        return false;
    }

    public void displayWinner(){
        for (int i = 0; i < players.length; i++) {
            boolean winner = true;
            for (int j : players[i].getNums()) {
                if(j != 0){
                    winner = false;
                }
            }
            if(winner){
                System.out.println("winner is player " + (i+1));
                return;
            }
        }

    }




    public void logic(int die1, int die2, int player){
        int sum = die1 + die2;

        //check if any numbers can be flipped if not return
        //this proved to be a pain in the ass so i just have the user skip turn if there is no sums.

        //choose what numbers to flip

    

        int[] chosenInts = new int[5];

        boolean validinput = false;
        while(!validinput){
        // flush chosenints so values chosen before dont haunt us

        for (int i = 0; i < chosenInts.length ; i++) {
            chosenInts[i] = 0;
        }
        

        System.out.println(die1 + " + " + die2 + " = " + sum);
        System.out.println("your numbers: ");
        for(int num : players[player].getNums()){
            if(num != 0){
                System.out.print(num + " ");
            }
        }

        System.out.println("choose numbers to flip or skip turn");
        String input = scanner.nextLine();
        if (input.equals("")){
            System.out.println("turn skipped");
            return;
        }
        chosenInts[0] = Integer.parseInt(input);
        for (int i = 1; i < 5 ; i++) {
            
            input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            chosenInts[i] = Integer.parseInt(input);

        }
        //check that user doesnt input same number twice
        boolean hasDublicate = false;
        for (int i = 0; i < chosenInts.length; i++) {
            for (int j = i+1; j < chosenInts.length; j++) {
                if(chosenInts[i] == chosenInts[j] && chosenInts[i] != 0){
                    hasDublicate = true;
                }
        }
        }
        if(hasDublicate){
            System.out.println("cant choose same number multiple times");
            continue;
        }



        //check that chosenints sum to sum
        int sum2 = 0;
        for (int i : chosenInts) {
            sum2 += i;
        }
        if(sum2 != sum){
            System.out.println("ur chosen nums dont equal the sum of the die, try again");
            continue;
        }

        //check that all chosenints are in players getnums
        boolean numsvalid = true;
        boolean contains;
        for (int i : chosenInts) {
            contains = false;
            for (int j : players[player].getNums()) {
                if(i == j){
                    contains = true;
                }
            }
            if(!contains){
                numsvalid = false;
                System.out.println("one of the numbers you chose to flip isnt in the numbers you can flip over");
                break;
            }
        }
        if(!numsvalid){
            continue;
        }

         validinput = true;
        }

        
        // turn all ints equal to chosenints to 0 so they cant be picked again
        for (int i = 0; i < players[player].getNums().length; i++) {
            for (int j : chosenInts) {
                if(j == players[player].getNums()[i]){
                    players[player].getNums()[i] = 0;
                }
            }
            
        }
        // check if all palyers nums are flipped and player wins
        boolean allzero = true;
        for (int i : players[player].getNums()) {
            if(i != 0){
                allzero = false;
            }
        }
        if(allzero){
            return;
        }

        System.out.println("nice go again");
        playSingleTurn(player);

    }
}
