import java.util.Scanner; //to use Scanner class, this import is required

public class First10MultiplesOfNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);     //declaration of Scanner class object
		System.out.println("Enter a number : ");
		int num = sc.nextInt();   //prompts user for integer input
		System.out.println("<<<<<----- First 10 multiples of "+num+" are as follows : ");
		for(int i=1;i<=10;i++){
			System.out.println(num+" * "+i+" = "+(num*i));   //num*i e.g. num=3 then 3*1,3*2 etc.
		}
		
		sc.close(); //closes Scanner

	}

}
