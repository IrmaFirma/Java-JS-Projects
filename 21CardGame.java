package pkg21cardgame_irma;

import java.util.Random;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //initial variables
        int playerTotal = 0;
        int computerTotal = 0;
        boolean playerFinished = false;
        boolean computerFinished = false;
        
        //user input to draw or pass
        Scanner input = new Scanner(System.in);
        
        //random numbers (1-10) 
        //player:
        Random rand = new Random();
        for(int i =0; i<2; i++){
            int random_player1 = rand.nextInt(11) + 1;
            playerTotal += random_player1;
            System.out.println("Player's first two cards: " + random_player1);
        }  
        //computer:
        for(int i =0; i<2; i++){
            int random_computer1 = rand.nextInt(11) + 1;
            computerTotal += random_computer1;
        }  
        
        while (!playerFinished && !computerFinished)
        {
            if(!playerFinished)
            {
                System.out.println("Do you want to draw another card or pass? d/p");
                char user_response = input.next().charAt(0);
                
                if(user_response == 'p') 
                {
                    playerFinished = true;
                }else
                {
                    int randomPlayerElse = rand.nextInt(11) + 1;
                    playerTotal += randomPlayerElse;
                    
                    System.out.println("New card draw: " + randomPlayerElse);
                }  
            }
            if(!computerFinished)
            {
                //determine computer's choice
                char comp_answer = rand.nextBoolean() ? 'd' : 'p';
                if(comp_answer == 'p')
                {
                    computerFinished = true;
                }else
                {
                    int randomCompElse = rand.nextInt(11) + 1;
                    computerTotal += randomCompElse;
                }
            }
        }
        
        //display both scores
        System.out.println("Player total: " + playerTotal);
        System.out.println("Computer total: " + computerTotal);
      
        
        //determine scoring
        if (playerTotal > 21 && computerTotal > 21)
            System.out.println("You both lose!");
        else if (playerTotal > 21)
            System.out.println("You lose!");
        else if (computerTotal > 21)
            System.out.println("You win!");
        else if (playerTotal == computerTotal)
            System.out.println("It's a tie!");
        else if (playerTotal > computerTotal)
            System.out.println("You win!");
        else
            System.out.println("You lose!");
        
        
    }
    
}

//Irma Preldzic
