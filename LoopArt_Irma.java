package loopart_irma;

import java.util.Scanner;

public class LoopArt_Irma {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the password: ");
        String password = s.nextLine();
        
        while(!password.equals("SillyNugget")){
            System.out.println("Incorrect. Try again!");
            password = s.nextLine();
        }
        
        System.out.println("Enter a number between 2-10: ");
        int grid_number = s.nextInt();
        
        //1. 
        for(int i = 0; i<grid_number; i++){
            System.out.print("@");
        }
        System.out.println();
        System.out.println();
       
        //2.
        for(int i = 0; i<grid_number; i++){
            for(int j = 1; j<=grid_number; j++){
                System.out.print("@"); 
            }
            System.out.println();
        }
        
        //3. 
        for(int i = 0; i<=grid_number; i++){
            for(int j = 0; j<i; j++){
                System.out.print("@"); 
            }
            System.out.println();
        }
        System.out.println();
        
        //EXTRA CREDIT
        for(int i = 0; i<=grid_number; i++){
            for(int j = i; j<grid_number; j++){
                System.out.print("@"); 
            }
            System.out.println();
        }
        
    }
    
}
//Irma Preldzic