package simplechatbot_irma;

import java.util.Scanner;


public class SimpleChatBot_Irma {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome to Irma's Chat Bot. To exit bot type in 'quit' ");
        Scanner input = new Scanner(System.in);
        
        System.out.println("Hi there! What's your name?");
        String response = input.nextLine(); //1
        
        int q = 1;
        boolean condition = true;
        if(response.equals("quit")) condition = false;
        
        while(condition)
        {
            if(response.equals("quit")) condition = false;
         
            if(q==1)
            {
                System.out.println("Hello " + response + "! How old are you?");
                response = input.nextLine();
                q++; //2
            }else if(q==2)
            {
                System.out.println("Cool. Do you have any pets?");
                response = input.nextLine();
                response.toLowerCase();
                q++; //3
            }else if(q==3)
            {
                if(response.equals("no"))
                {
                    System.out.println("Do you want a pet? ");
                    response = input.nextLine();
                    response.toLowerCase();
                    
                    if(response.equals("no"))
                    {
                            System.out.println("Oh that's cool too. How are you today? (ok/not okay)");
                            response = input.nextLine();
                            response.toLowerCase();
                            q++; //4 
                    }else
                    {
                        System.out.println("Are you a cat or a dog person?");
                        response = input.nextLine();
                        response.toLowerCase();
                        
                        if(response.equals("cat"))
                        {
                            System.out.println("meow! How are you today? (ok/not okay)");
                            response = input.nextLine();
                            response.toLowerCase();
                            q++; //4                     
                        }else
                        {
                            System.out.println("woof! How are you today? (ok/not okay)");
                            response = input.nextLine();
                            response.toLowerCase();
                            q++; //4 
                        }
                    }
                }else
                {
                    System.out.println("Great! What's your pet's name? ");
                    response = input.nextLine();
                    System.out.println("I love that name! How are you today? (ok/not okay)");
                    response = input.nextLine();
                    response.toLowerCase();
                    q++; //4
                }
            }else if(q==4)
            {
                if(response.equals("okay"))
                {
                    System.out.println("I'm glad! Have a nice day :)");
                    condition = false;
                }else
                {
                    System.out.println("Oh I'm so sorry. Hope you feel better!‚");
                    System.out.println("Sadness flies away on the wings of time.");                   
                    condition = false;
                }
            }
        }
    }
    
}
//Irma Preldzic 