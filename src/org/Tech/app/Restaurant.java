package org.Tech.app;

import java.util.Scanner;

public class Restaurant {
	public static void main(String[] args)
    {
         
        Scanner input = new Scanner(System.in);
         
        // title
        System.out.println(" Paradise ");
         
        //ask how many people in group  
        System.out.println("First tell me how many people are in your group: ");
        int numDiner = input.nextInt();
         
        //size an array of type String
        String dinerNameArray[] = new String[numDiner];
         
        //ask for name of each diner and store in dinerArray
        for( int i = 0; i < dinerNameArray.length; i++)
        {
            System.out.print("Enter the name of diner #" + (i+1) + ":");
            dinerNameArray[i] = input.nextLine();   
            input.nextLine();
        }//end for
         
         
        System.out.println("Now each person will need to order an item from each menu category.");
        System.out.println("I will ask each diner for all their menu selections.");
        input.nextLine();
     
         
        for (int i = 0; i < dinerNameArray.length; i++)
        {
            System.out.print(dinerNameArray[i] + ", please make your selections from the following menus:");
            input.nextLine();
             
            //create array for sub-menus
        String[] appetizerArray = {"No Selection", "Chicken Biriyani", "Chicken Special Biriyani", "Chicken Dum Biriyani", "Mutton Biriyani"};
        double[] appetizerPriceArray = new double [5];
        appetizerPriceArray [0] = 0.00;
        appetizerPriceArray [1] = 150.00; 
        appetizerPriceArray [2] = 199.99;
        appetizerPriceArray [3] = 249.99;
        appetizerPriceArray [4] = 199.50;
         
         
         
                 
        System.out.print("Please select one item from the Appetizer menu.");
        System.out.println();
        System.out.println("1. **No Selection** Rup.0.00");
        System.out.println("2. Chicken Biriyani Rup.150.00");
        System.out.println("3. Chicken Special Biriyani Rup.199.99");
        System.out.println("4. Chicken Dum Biriyani Rup.249.99");
        System.out.println("5.  Mutton Biriyani Rup.199.50");
        System.out.println("Please enter your selection #: ");
        int userInput = input.nextInt(); 
        String[] appetizerPriceArray1 = new String[userInput];
          input.nextLine();
        System.out.println("Thank you, " + dinerNameArray[i] + ". Your order consists of:");
        System.out.println(userInput); 
        input.nextLine();   

}
    }

}
