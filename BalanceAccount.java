import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int MyBalanceAccount = 1000000;
		
		String retry;
		do{
		System.out.println("Balance Account: $" + MyBalanceAccount);
		System.out.println("Enter Withdrawal Amount: ");
		int withdraw = sc.nextInt();
		
		if(withdraw <= 0){
			System.out.println("Error! Enter Valid Amount");	
			}if (withdraw <= MyBalanceAccount){
			MyBalanceAccount -= withdraw;
			System.out.println("Withdrawal Successfully!");
			System.out.println("Withdraw Amount: " + withdraw);
			System.out.println("Updated Balance Account: " + MyBalanceAccount);
			}else{
			System.out.println("Insufficient Funds!");
			
			}
			System.out.println("Do you want to Withdraw Again?");
			retry = sc.next();
		}while (retry.equalsIgnoreCase("Yes"));
		System.out.println("ThankYou");
	}
}