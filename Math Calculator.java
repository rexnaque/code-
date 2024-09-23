import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
		
	String username = "Rex";
	int password = 1430;
		
	System.out.print("Enter Username: ");
	String typeUsername = scan.nextLine();
		
	if (typeUsername.equals(username)){
	System.out.print("Enter Password: ");
	int typePassword = scan.nextInt();
			
	switch (typePassword){
	case 1430:
				
	System.out.println("---MATH CALCULATOR---");
	System.out.println("Enter a number for Computation ");
	System.out.println("1 for ADDITION");
	System.out.println("2 for SUBTRACTION ");
	System.out.println("3 for MULTIPLICATION ");
	System.out.println("4 for DIVISION ");
	System.out.println("5 for EXIT");
	
	int choice = scan.nextInt();
	
	if(choice == 1){
	System.out.print("Add Number: ");
	System.out.print("Enter 1st Number: ");
	int num1 = scan.nextInt();
	System.out.print("Enter 2nd Number: ");
	int num2 = scan.nextInt();
	int sum = num1 + num2;
	System.out.println(sum);
	
    }else if(choice ==2){
    System.out.print("Subtract Number: ");
    System.out.print("Enter 1st Number: ");
    int num1 = scan.nextInt();
    System.out.print("Enter 2nd Number: ");
    int num2 = scan.nextInt();
    int sum = num1 - num2;
    System.out.println(sum);
    	
	}else if(choice == 3) {
    System.out.print("Multiply Number: ");
    System.out.print("Enter 1st Number: ");
    int num1 = scan.nextInt();
    System.out.print("Enter 2nd Number: ");
    int num2 = scan.nextInt();
    int sum = num1 * num2;
    System.out.println(sum);
   				
    }else if(choice == 4){
    System.out.print("Divide Number: ");
    System.out.print("Enter 1st Number: ");
    double num1 = scan.nextInt();
    System.out.print("Enter 2nd Number: ");
    double num2 = scan.nextInt();
    double sum = num1 / num2;
    System.out.println(sum);
    
    
    }else{
    System.out.println("THANK YOUU!!");
    		
    		
    
    }
	break; 
			
	default:
	System.out.println("Wrong Password!");
				
				
				}
			
	}else{
    System.out.println("Username not Found!");
				
						
								
			}
		
	}
}