import java.util.HashMap;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	PasswordIndicator pi = new PasswordIndicator();
	Scanner scanner = new Scanner(System.in);
	System.out.println("Welcome! Please sign up by entering following credentials to begin your banking expierence.");
	System.out.println("Create a UserID:");
	String username = scanner.nextLine();
	System.out.println("Create a Password:");
	String password = scanner.nextLine();
	scanner.close();
	pi.printStrongNess(password);
		//IDandPasswords idandPasswords = new IDandPasswords();
		HashMap<String,String> logininfo = new HashMap<String,String>();
		logininfo.put(username, password);	
		LoginPage loginPage = new LoginPage(logininfo);

	}
}
