import java.util.Scanner;
public class IT25103041Lab3Q1A{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of rice: ");
		double price = sc.nextDouble();
		
		System.out.print("Enter the number of kilograms: ");
		double kilograms = sc.nextDouble();
		
		double amount = price * kilograms;
		
		
		System.out.println("The total amount is: "+amount);
	}
}