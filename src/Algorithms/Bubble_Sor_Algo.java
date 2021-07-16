
package Algorithms;


class BobbleSort{
	
	
	public void bSort(int arr[]) {
		
		int n = arr.length;
		
		boolean isSorted;
		
		for(int i = 0; i < n-1; i++) {    // This Loop is Define Pass Of Bubble Sort
			
	//	 System.out.println(i+1);
			
			isSorted = false;
			
			for(int j = 0; j < n-1-i; j++ ) {
				
				
				if(arr[j] > arr[j + 1]) {
					
					int	temp = arr[j];
					
					arr[j] = arr[j+1];
					
					arr[j+1] = temp;
					
					isSorted = true;
			}	
	
		}	
			if(isSorted == false) {
				break;
		}
	}
		
}
	
	
public void print(int arr1[], int size) {
	
	for(int i = 0; i < size; i++) {
		
		System.out.print(arr1[i]+", ");
	}
	
	System.out.println();
}
	
}


public class Bubble_Sor_Algo {

	public static void main(String[] args) {

		BobbleSort bs = new BobbleSort();
		

		int arr[] = {1334, 233, 333, 6, 7, 8, 9, 11, 22, 33};
		
	    int n = arr.length;
	    
	    System.out.println("Bubble Sort After");
	    
	    bs.print(arr, n);
		
	    bs.bSort(arr);
	    
	    System.out.println("Bubble Sort Befor");
	    
	    bs.print(arr, n);
	    
	    
	    
	}

}
