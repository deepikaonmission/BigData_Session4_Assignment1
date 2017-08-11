
public class SumMethodOverloading {
	
	//Method Overloading means methods having same name but having:
	//-> Different number of arguments
	//-> Different types of arguments
	//-> compiler binds call of method to code of method depending on above two conditions
	//-> if number of arguments are same, and no method is defined for the type of arguments
	//   provided as parameter in method call, then compiler tries to do implicit casting of 
	//   data types, so that atleast a method definition is found for the call, but if compiler
	//   could not type cast successfully then error is returned, i.e. method definition does not exist.
	
	static void sum(int n1){   //method with one argument of type int
		System.out.println("Sum of "+n1+" and "+n1+" is : "+(n1+n1));
	}
	static void sum(int n1,int n2){   //method with two arguments of type int
		System.out.println("Sum of "+n1+" and "+n2+" is : "+(n1+n2));
	}
	static void sum(float n1,float n2){   //method with two arguments of type float
		System.out.println("Sum of "+n1+" and "+n2+" is : "+(n1+n2));
	}
	static void sum(double n1,double n2){   //method with two arguments of type double
		System.out.println("Sum of "+n1+" and "+n2+" is : "+(n1+n2));
	}

	public static void main(String[] args) {
		sum(2);    //call to one argument sum method() of type int 
		
		sum(3,4);      //call to two argument sum method() of type int
		
		sum(5.6,7.2);  //call to two argument sum method() of type double, because default data
		               //type for decimal point numbers is double
		
		sum(8.5f,7.6f); //call to two argument sum method() of type float, as f is associated with numbers
		
		sum(7.5f,3);   //As there is no method available which has first argument as float and second as int
		               //so complier, type casts second parameter to float, as int is smaller data type than float
		               // and call to two arguments sum method() of type float is made 
		               
		sum(2,5.6);    //call to two double parameters method is made, because no method is
		               //available which contains first argument as int, and second as double,
		               //so compiler first looks for larger data type among two, since double is
		               //larger data type than int so first parameter of type int is type cast to 
		               //double

	}

}
