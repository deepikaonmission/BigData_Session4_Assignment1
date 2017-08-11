
import java.util.Scanner;      //to Use Scanner class, this import is required

public class OddEven {   

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);    //sc object of Scanner Class is created by passing "System.in" i.e. "in" object of "System" class
		System.out.println("Enter two numbers ");
		int num1 = sc.nextInt();          //sc.nextInt() prompts user for integer input 
		int num2 = sc.nextInt();
	
		System.out.println("<<<<<---- Even numbers are ---->>>>>");
		for(int i = num1; i<=num2;i++)
		{
			if(i%2==0)     //checks whether number is divisible by 2 (even no), if yes, prints that number
				System.out.println(i);
			else
				continue;
		}
	
		System.out.println("<<<<<---- odd numbers are ---->>>>>");
		for(int i = num1; i<=num2;i++)
		{
			if(i%2!=0)  //checks whether number is not divisible by 2 (odd no), if yes, prints that number
				System.out.println(i);
			else
				continue;
		}
		sc.close(); //closes Scanner

	}

}

