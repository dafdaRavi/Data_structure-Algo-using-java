package Algorithms;



class selectionSort{
	
	
	public void sSort(int arr[]) {
		
		int n = arr.length;
		
		int indexOfmid;
		
		for(int i = 0; i < n - 1; i++) {
			
			indexOfmid = i;
			
			
			for(int j = i + 1; j < n; j++)
				
				if(arr[j] < arr[indexOfmid])
					
					indexOfmid = j;
			
			
			int temp = arr[indexOfmid];
			
			arr[indexOfmid] = arr[i];
			
			arr[i] = temp;
			
		}

	}
	
	
	public void print(int arr[]) {
		
		int n = arr.length;
		
		for(int i = 0; i < n; i++) {
			
			System.out.print(arr[i]+", ");
			
		}
		System.out.println();
	}
	
	
	
	
	
	
}


public class Selection_Sort_Algo {

	public static void main(String[] args) {


		selectionSort sS = new selectionSort();
		
	int arr[] = {3, 6, 2, 7, 4, 5};	
	
	
		sS.print(arr);
		
		System.out.println("\nSelection Sort...... \n");
		
		sS.sSort(arr);
		
		sS.print(arr);
		
		
	}

}
