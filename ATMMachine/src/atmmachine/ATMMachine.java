package atmmachine;

import java.util.Scanner;

/**
 *
 * @author arifur.rahman
 */
public class ATMMachine {

    public static void main(String[] args) {

        String userName = "Ami Alif";
        String password = "1234Abcd";
        String bankName = "AA Bank Limited";
        double userBalance = 5000;

        Scanner bankScanner = new Scanner(System.in);
        System.out.println("Welcome to " + bankName);
        
        System.out.println("Please Enter Your PIN Number ");
        String enteredPassword = bankScanner.nextLine();
        
        if (enteredPassword.equalsIgnoreCase(password)) {
            System.out.println("Account Name Holder : " + userName);
            System.out.println("Please choose the following options ");
            
            System.out.println("1 - Show Balance , 2 - Deposit Amount , 3 - Withdraw Amount");
            int userChoice = bankScanner.nextInt();
            
            if (userChoice == 1) {
                System.out.println("Your Current Balance is " + userBalance);
            } else if (userChoice == 2) {
                System.out.println("Please Enter The Amount To Deposit ");
                double depositAmount = bankScanner.nextDouble();
                
                userBalance += depositAmount;
                System.out.println("You have successfully deposited " + depositAmount
                        + " \nNow your balnce is " + userBalance);
            } else if (userChoice == 3) {
                System.out.println("Please Enter the Amount to Witdraw");
                double withdrawAmount = bankScanner.nextDouble();
                
                if (withdrawAmount > userBalance) {
                    System.out.println("Insufficient Balance. Please Try Again");
                } else {
                    userBalance -= withdrawAmount;
                    System.out.println("You have successfully withdraw " + withdrawAmount
                            + " \nNow your balnce is " + userBalance);
                }
            }

        }

    }

}
