package Algorithms;


class count_Sort{
	
	
	    int funMax(int arr[]) {
		
		int n = arr.length;
		
		int max = Math.min(n, n);
		
		for(int i = 0; i < n; i++) {
			
			if(max < arr[i]) {
				
				max = arr[i];
			}
		}
		return max;
	}
	
	void countSort(int arr[], int n) {
	
		
	/*	int max = Arrays.stream(arr).max().getAsInt();
	    int min = Arrays.stream(arr).min().getAsInt();	
    */
		
		int max = funMax(arr);
		 
	
	    int count[] = new int[max + 1];
		
		for(int i = 0; i < max+1; i++) {
			
			count[i] = 0;
		}
		
		for(int i = 0; i < n; i++) {
			
			count[arr[i]] = count[arr[i]] + 1;	
		}
		
		
		
//  This Logic Is Using For Copy Element from count[] Array To arr[] Array
		
// Counter For Count Array 
		int i = 0;
// Counter For given arr Array		
		int j = 0;
		
		while(i <= max) {
			
			if(count[i] > 0) {
				
				arr[j] = i;
				count[i] = count[i] -1;
				j++;
				
			}
	    	 else {
			   i++;
			}
		}
		
		
	}
  
// Array Print Print	
	 void print(int arr[]) {
		 
		  int size = arr.length;
		for(int i = 0; i < size; i++) {
			
			System.out.print(arr[i]+", ");
			
		}System.out.println();
	}
	
	 
	
}


public class Count_Sort_Algo {

	public static void main(String[] args) {

		
		count_Sort cs = new count_Sort();
		
        int arr[] = {33, 55, 1, 6, 5, 3};
		
        int n = arr.length;
        
		System.out.println("Given Array........");
		cs.print(arr);
		
		//System.out.println(cs.funMax(arr));
		
		 System.out.println("\nCount Sort array...");
		cs.countSort(arr, n);
		
		
		cs.print(arr);
		
		
	}

}
