package Algorithms;


class insertionSort{
	
	public void isort(int arr[]) {
		
		int n = arr.length;
		
		int key;
		
		for(int i = 0; i < n; i++) {
			
			key = arr[i];
			
			int j = i - 1;
			
			while(j >= 0 && arr[j] > key) {
				
				arr[j+1] = arr[j];
				
				j = j - 1;
			}
			
			arr[j + 1] = key;			
		}
		
	}
	
	
	void print(int arr[] ) {
		
		int n = arr.length;
		
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();	
	}


	
}



public class Insertion_Sort_Algo {

	public static void main(String[] args) {


		insertionSort is = new insertionSort(); 
		
		int arr[] = {6, 3, 77, 3, 9, 66};
		
		
		System.out.println("Before Array ");
		is.print(arr);
		
		is.isort(arr);
		
		System.out.println("After Insertion sort Array  ");
		is.print(arr);

	}

}
