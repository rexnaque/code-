import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String h;
		do{
			System.out.println("Do you have a fever?: (yes/no)");
			String a = sc.nextLine();
			System.out.println("Do you have cough?: (yes/no");
			String b = sc.nextLine();
			System.out.println("Do you have difficulty in breathing?: (yes/no");
			String c = sc.nextLine();
			if (a.equals("yes")){
				System.out.println("You may have COVID 19 symptoms. Please consult a healthcare");	
				}else if (b.equals("yes")){
					System.out.println("You may have COVID 19 symptoms. Please consult a healthcare" );
					}else if (c.equals("yes")){
						System.out.println("You may have COVID 19 symptoms. Please consult a healthcare");
						}else {
						System.out.println("You do not exhibit significant COVID-19 symptoms. Stay safe!");
						
						}
						System.out.println("Do you want to check symptoms again");
						h = sc.nextLine();
		}while (h.equalsIgnoreCase ("yes"));
		
		
	}
}