package namegenerator_irma;

import java.util.Scanner;

public class NameGenerator_Irma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //kahoot name parts
        String first_part = "";
        String second_part = "";
        String third_part = "";

        
        System.out.println("Welcome to Kahoot Name Generator! ");
        
        //part I
        System.out.println("What color socks are you wearing? ");
        String color = input.nextLine();
        color.toLowerCase();
        
        if(color.equals("yellow"))
        {
            first_part = "Green";
        }else if (color.equals("green"))
        {
            first_part = "Yellow";
        }else if (color.equals("red"))
        {
            first_part = "Blue";
        }else if (color.equals("blue"))
        {
            first_part = "Red";
        }else if (color.equals("black"))
        {
            first_part = "White";
        }else if (color.equals("white"))
        {
            first_part = "Black";
        }else
        {
            first_part = "Rainbow";
        }
        
        //part II
        System.out.println("Enter the day you were born on? (1-31) ");
        int birthday = input.nextInt();
        
        if(birthday >= 1 && birthday <= 4)
        {
            second_part = "Wolf";
        }else if (birthday >= 5 && birthday <= 10)
        {
            second_part = "Kitty";
        }else if (birthday >= 11 && birthday <= 17)
        {
            second_part = "Mayo";
        }else if (birthday >= 18 && birthday <= 23)
        {
            second_part = "Ranch";
        }else if (birthday >= 24 && birthday <= 27)
        {
            second_part = "Jelly";
        }else if (birthday >= 28 && birthday <= 30)
        {
            second_part = "Dog";
        }else
        {
            second_part = "Mouse";
        }
        
        //part III
        System.out.println("What's your favorite fast food restaurant? ");
        input.nextLine();
        String food = input.nextLine();
        food.toLowerCase();
        
        if(food.equals("mcdonald's"))
        {
            third_part = "111";
        }else if (food.equals("wendy's"))
        {
            third_part = "222";
        }else if (food.equals("subway"))
        {
            third_part = "333";
        }else if (food.equals("pizza hut"))
        {
            third_part = "444";
        }else if (food.equals("burger king"))
        {
            third_part = "555";
        }else if (food.equals("kfc"))
        {
            third_part = "666";
        }else
        {
            third_part = "777";
        }
        
        //result name
        String kahoot_name = first_part + second_part + third_part;
        System.out.println("Your Kahoot Name is: " + kahoot_name);
           
    }
    
}

//Irma Preldzic
