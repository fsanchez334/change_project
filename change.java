import java.util.Scanner;

public class Change{
  
    public static void main(String[] args){

        
         Scanner in=new Scanner(System.in);
         int DOLLAR_VALUE=100;
         int QUARTER_VALUE=25;
         int DIME_VALUE=10;
         int NICKLE_VALUE=5;
         int PENNY_VALUE=1;
      
        double numberOfPennies=0;
        double numberOfNickles=0;
        double numberOfDimes=0;
        double numberOfQuarters=0;

        System.out.print("What is the amount the customer has to pay? Please enter in pennies");
        int amountDue= in.nextInt(); 
        System.out.print("What is the amount that the customer has paid? Please enter in pennies"); 
        int amountPaid=in.nextInt();
        int change=(amountPaid-amountDue);
        System.out.println("The customer's change is" + " " + change);
      
      
      if(change>=DOLLAR_VALUE){
               int numberofDollars=change/DOLLAR_VALUE;
                int remainderOne=change%DOLLAR_VALUE;
                System.out.println("Customer will receive" + " " + (numberofDollars) + " " + "dollars");
                 
                {
                    if(remainderOne>=QUARTER_VALUE && remainderOne<DOLLAR_VALUE)
                     numberOfQuarters=remainderOne/QUARTER_VALUE;
                     int remainderTwo=remainderOne%QUARTER_VALUE;
                     System.out.println("Customer will receive" + " " + Math.round(numberOfQuarters) + " " + "quarters");
                     
          
                   if(remainderTwo>=DIME_VALUE && remainderTwo<QUARTER_VALUE)
                  
                     numberOfDimes=remainderTwo/DIME_VALUE;
                     int remainderThree=remainderTwo%DIME_VALUE;
                     System.out.println("Customer will receive " +  " " + Math.round(numberOfDimes) + " " + "dimes");
                   
                  
                    if(remainderThree>=NICKLE_VALUE && remainderThree<DIME_VALUE)
                    
                     numberOfNickles=remainderThree/NICKLE_VALUE;
                     int remainderFour=remainderThree%NICKLE_VALUE;
                     System.out.println("Customer will receive" + " " + Math.round(numberOfNickles) + " " + " nickles");
                        
                    
                      if (remainderFour>=PENNY_VALUE && remainderFour<NICKLE_VALUE)                
                        numberOfPennies=remainderFour/PENNY_VALUE;
                        int remainderFive=remainderFour%PENNY_VALUE;
                        System.out.println("Customer will receive" + " " + Math.round(numberOfPennies)+ " " + "pennies");       
 
       
      	        }
         }	
    }
}    
