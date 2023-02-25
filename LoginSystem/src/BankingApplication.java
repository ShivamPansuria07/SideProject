import java.util.Scanner;

public class BankingApplication {
	public static void bank(){
		int balance = 0;
		int amount = 0;
		int previousTransaction = 0;
		String customerName;
		String customerId;
		
		
		
		//System.out.println("Welcome, your ID is " +username);
		System.out.println("\n");
		
		System.out.println("A : Check Your Balance");
		System.out.println("B : Deposit");
		System.out.println("C : Withdraw");
		System.out.println("D : Previous Transaction");
		System.out.println("E : Exit The System");
		//this is not working :P
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
			System.out.println("Enter Your Option");
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
			String option = scanner.nextLine();
			if(option != null) {
			switch (option) {
			
			case "A":
				System.out.println("-------------------------------------------------------");
				System.out.println("Balance = "+balance);
				System.out.println("-------------------------------------------------------");
				System.out.println("\n");
				break;
				
			case "B":
				System.out.println("-------------------------------------------------------");
				System.out.println("Enter an amount to deposit ");
				System.out.println("-------------------------------------------------------");
				
				amount = scanner.nextInt();
					if(amount != 0) {
						balance = balance + amount;
						previousTransaction = amount;
					}
				
				System.out.println("\n");
				break;
				
			case "C":
				System.out.println("-------------------------------------------------------");
				System.out.println("Enter an amount to withdraw ");
				System.out.println("-------------------------------------------------------");
				
				int amount2 = scanner.nextInt();
				
					if(amount != 0) {
						balance = balance - amount;
						previousTransaction = -amount;
					}
				
				System.out.println("\n");
				break;
				
			case "D":
				System.out.println("-------------------------------------------------------");
				if(previousTransaction > 0) {
					System.out.println("Deposited: " + previousTransaction);
				}
				else if(previousTransaction < 0) {
					System.out.println("Withdraw: " +Math.abs(previousTransaction));
				}
				
				else {
					System.out.println("No Transaction Occured");
				}
				System.out.println("-------------------------------------------------------");
				System.out.println("\n");
				break;
				
			case "E" :
				System.out.println("=========================================================================================================");
				break;

			default:
				System.out.println("Invalid Option!! Please Enter Correct Opton...");
				break;
			}		
			}
			if(option == "E") {
				System.out.println("Thank You for Using our Services.....!!");
				break;
			}
		}

	}
}




