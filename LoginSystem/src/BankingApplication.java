import java.util.Scanner;

import javax.swing.JOptionPane;

public class BankingApplication {

	public BankingApplication(String userID) {
		int balance = 0;
		int amount = 0;
		int previousTransaction = 0;
		String customerName;
		String customerId;
		String option;

		do {
			option = JOptionPane.showInputDialog(null,
					"A : Check Your Balance \n B : Deposit \n C : Withdraw \n D : Previous Transaction \n E : Exit The System \n");
			switch (option) {
			case "A":

				JOptionPane.showMessageDialog(null, "Balance = " + balance);
				break;

			case "B":
				String d = JOptionPane.showInputDialog(null, "Enter an amount to deposit");
				amount = Integer.parseInt(d);
				if (amount != 0) {
					balance = balance + amount;
					previousTransaction = amount;
				}
				break;

			case "C":
				String w = JOptionPane.showInputDialog(null, "Enter an amount to withdraw");
				amount = Integer.parseInt(w);

				if (amount != 0) {
					balance = balance - amount;
					previousTransaction = -amount;
				}
				break;

			case "D":
				if (previousTransaction > 0) {
					JOptionPane.showMessageDialog(null, "Deposited: " + previousTransaction);
				} else if (previousTransaction < 0) {
					JOptionPane.showMessageDialog(null, "Withdraw: " + Math.abs(previousTransaction));
				}

				else {
					JOptionPane.showMessageDialog(null, "No transaction was found!");
				}
				break;

			case "E":
				JOptionPane.showMessageDialog(null, "Thanks for visiting.");
				option = "E";
				break;

			default:
				System.out.println("Invalid Option!! Please Enter Correct Opton...");
				break;
			}

		} while (option != "E");

	}

}
