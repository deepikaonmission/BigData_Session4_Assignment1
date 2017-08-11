
public class acad3 {

	//static sum() method definition, which receives two integer parameters
	static void sum(int n1, int n2){
		System.out.println("Sum is : "+(n1+n2));    //sum of two numbers is displayed
	}
	
	//static main() method definition
	public static void main(String[] args) {
		int num1 =Integer.parseInt(args[0]);     
		int num2 =Integer.parseInt(args[1]);
		//Since command line arguments are received as String,
		//so Integer.parseInt converts the String to int
		
		System.out.println("First number is : "+num1);
		System.out.println("Second number is : "+num2);
		sum(num1,num2);       //call to static method sum() is made with two arguments

	}

}
