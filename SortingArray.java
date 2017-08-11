import java.util.Scanner;  //to use Scanner class import is required

public class SortingArray {

	//bubble sort technique is used to sort the array in descending order
	//i.e. in every pass larger element is placed at index location equal to (pass-1), if pass number starts at 1
	// in Pass 1 -->> largest element will be at arr[0]
	// in Pass 2 -->> other largest element will be at arr[1] and so on
	//so total number of passes will be equal to size of array
	
	static void sortArray(int [] arr){     //declaration and definition of sortArray() method
		int len = arr.length;        //here, arr.length returns length of array
		
		
		for(int i=0;i<len-1;i++){       
		
			for(int j=i+1;j<len;j++){
				int temp;
				if(arr[i]<arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				else
					continue;
			}
			
		}
		
		System.out.println("<<<<<<---- Sorted array is as follows ----->>>>>");
		for(int i=0;i<len;i++){
			System.out.print(arr[i]+"\t");
		}
		
	}
	
	//definition of static main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);     //declaration of Scanner class object
		System.out.println("Enter the length of array :");
		int l = sc.nextInt();     //prompts user for integer input
		int arr[]= new int[l];     //declaration of array of type int with size l
		System.out.println("Enter "+l+" elements");
		for(int i=0;i<l;i++){
			arr[i] = sc.nextInt();    //array is initialized with some values provided by user at run time
		}
		
		sortArray(arr);  
		//call to sortArray() static method with one argument i.e. array of int (here arr) is generated
				
		sc.close();      //closes Scanner
		
	}
}
