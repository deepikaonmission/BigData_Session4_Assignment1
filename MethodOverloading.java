
public class MethodOverloading {
	
	//Method Overloading means methods having same name, but having:
	//-> Different number of arguments
	//-> Different types of arguments
	//-> compiler binds call of method to code of method depending on above two conditions
	//-> if number of arguments are same, and no method is defined for the type of arguments
	//   provided as parameter in method call, then compiler tries to do implicit casting of 
	//   data types, so that atleast a method definition is found for the call, but if compiler
	//   could not type cast successfully then error is returned, i.e. method definition does not exist.
	//NOTE:
	//1.compiler does not look for return type of overloaded method while matching call of method to one of the code definitions 
    //   so return type of overloaded methods can be any like void, int, float etc.
	//2. return type of overloaded methods can be same also
	
	
	static int multiply(int n1,int n2){   //method with one argument of type int
		int mul = n1*n2;
		return mul;        //returns variable of type int
	}
	
	static int multiply(float n1,float n2){   //method with two arguments of type int
		int mul = (int)(n1*n2);       //if type casting i.e. (int) is not done, then error is returned
		                              //because n1 and n2 are of type float and return type of function is int,so sum is declared as int
		                              //if return type of function is int, and float is returned from function, then error is returned
		return mul;      //returns variable of type int
	}
	static double multiply(double n1,double n2){     //return type does not have any concern with method overloading
		double mul = n1*n2;
		return mul;        //returns variable of type double
	}
	
	public static void main(String[] args) {
		int n1=2,n2=3;
		System.out.println("Product of "+n1+" and "+n2+" is : "+multiply(n1,n2));
		//call to two arguments multiply method() of type int is made
		
        float n3=3.2f,n4=4.2f;
        System.out.println("Product of "+n3+" and "+n4+" is : "+multiply(n3,n4));      
        //call to two arguments multiply method() of type float is made
		
        float n5=7.5f;
        int n6=3;
        System.out.println("Product of "+n5+" and "+n6+" is : "+multiply(n5,n6));   
		//As there is no method available which has first argument as float and second as int
		//so complier, type casts second parameter to float, as int is smaller data type than float
		// and call to two arguments multiply method() of type float is made
        
		double n7=5.6,n8=7.2;
        System.out.println("Product of "+n7+" and "+n8+" is : "+multiply(n7,n8));
        //call to two arguments multiply method() of type double is made
		
         
		               
	}

}
