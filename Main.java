import java.util.*;

public class Main{
    
    public static void main(String[]){
        boolean infiniteLoop = true;
        double[] accountBalance = new double[1000];
        
        String[] accountName = new String[1000];
        int option, size = 100;
        
        while (infiniteLoop){
            System.out.println("Welcome to Bloxxy Banking Services.");
            System.out.println("Banking Menu");
            System.out.println("1-> Add the Customer");
            System.out.println("2-> Change the Customer Name");
            System.out.println("3-> Check account Balance");
            System.out.println("4-> Update Account Balance");
            System.out.println("5-> Summary of All Accounts");
            System.out.println("6-> Quit");
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your option to proceed ahead :");
            
            option = sc.nextInt();
            
            if(option == 1){
                System.out.println("\n Enter Customer Name");
                String name = sc.nextLine();
                accountName[size] = name;
                System.out.println("Enter Opening Balance Amount: ");
                double amt = sc.nextDouble();
                accountBalance[size] = amt;
                System.out.println("Account Created Successfully");
                System.out.println("Account Details ;- \n");
                System.out.println("Account Numebr :- "+(size));
                System.out.println("Account Name: ",+ accountName[size]);
                System.out.println("Account Balance:", + accountBalance[size] + "Rs \n");
                System.out.println("=====================================");
                
                size = size + 1; 
            }
            else if (option == 2){
            
            System.out.println("\nChange Customer Name Menu:  ");
            System.out.println("\nEnter your Account Number: ");
            int accountIndex;
            String temp;
            
            accountIndex = sc.nextInt();
            
            if(accountIndex > size){
                System.out.println("Account does not Exist");
                System.out.println("Terminating....")
                
            }
            else{
                temp = accountName[accountIndex];
                System.out.println("Enter the new name: ");
                String name = sc.nextLine();
                accountName[accountIndex] = name;
                System.out.println("Name is succesfully updated to from "+temp+"to"+"name"+".\n" );
            }
            else if(option == 3){
                
                System.out.println("\nCheck Account Balance Menu");
                System.out.println("\nEnter Your Account Number: ");
                
                int accountIndex;
                accountIndex = sc.nextInt();
                
                if(accountIndex > size){
                    System.out.println("Account Does Not Exist.");
                    System.out.println("Terminating the Account :I");
                }
                else{
                    System.out.println(accountName[accountIndex]+ "Your balance is "+accountBalance[accountIndex] + "Rs");
                }
                else if(option == 4){
                    System.out.println("\nUpdate Account Balance Menu");
                    System.out.println("\Enter Your Account Number");
                    
                    int accountIndex;
                    accountIndex = sc.Next();
                }
            }
        }
            
        }
    
    }
}