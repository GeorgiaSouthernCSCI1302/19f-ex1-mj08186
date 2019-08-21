package assignment;
import java.util.Scanner;

public class FirstClassInGit {
	

	public static void main(String[] args) {
		//Create a scanner
		Scanner input = new Scanner(System.in);
		
		//add a statement to display your name in the console
		System.out.println("Hello my name is Michael");
		
		//Request the user's name
		System.out.print("Please enter your last name: ");
		String userName = input.next();
		
		//Display the user's name
		System.out.print("Hello " + userName);
	}

}
