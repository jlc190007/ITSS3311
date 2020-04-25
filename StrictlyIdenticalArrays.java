import java.util.Scanner;

public class StrictlyIdenticalArrays {

	public static boolean equals(int[] array1, int[] array2){
    
		for(int i = 0;i<array1.length;i++){
        
			//If the arrays are not identical, then it will return false 
			if(array1[i]!=array2[i]){
            
				return false;
            
			}
        }
        	//If the arrays are identical, then it will return true 
				return true;
    
	}

    public static void main(String[] args) {
        
    	Scanner scanner = new Scanner(System.in);
        
    	//This is the number of elements in the first array
    	int array1[] = new int[5];
        
    	//This is the number of elements in the second array
    	int array2[] = new int[5];

        
    	System.out.print("Enter 5 elements of list1: ");
        
    	for(int i = 0;i<5;i++){
        
    		array1[i] = scanner.nextInt();
        
    	}

        
    	System.out.print("Enter 5 elements of list2: ");
        
    	for(int i = 0;i<5;i++){
        
    		array2[i] = scanner.nextInt();
        
    	}

        
    	//If the arrays are identical the system will print out the following 
    	if(equals(array1,array2)){
        
    		//This is what the system will print if the arrays are identical 
    		System.out.println("Two lists are strictly identical.");
        
    	}
        
    	//If the arrays are not identical the system will print out the following
    	else{
        
    		//This is what the system will print if the arrays are not identical 
    		System.out.println("Two lists are not strictly identical.");
        
    	}//End of Class 
    }//End of Method 
}
