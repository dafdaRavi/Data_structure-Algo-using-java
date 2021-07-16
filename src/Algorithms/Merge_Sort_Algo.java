package Algorithms;


class mergeSort{
	
	
	
public void mSort(int arr[], int left, int mid, int right) {
	
	int a1 = mid - left + 1;
	int a2 = right - mid;
	
	int L[] = new int[a1];
	int R[] = new int [a2];
	
	
	for(int i = 0; i < a1; i++)
		
		L[i] = arr[left + i];
	
	for(int j = 0; j < a2; j++)
		
		R[j] = arr[mid + 1 + j];
	
	
	int i = 0;
	int j = 0;
	
	int k = left;
	
	while(i < a1 && j < a2) {
		
		if(L[i] <= R[j]) {
			
			arr[k] = L[i];
			i++;
			
		}else {
			
			arr[k] = R[j];
			j++;
			
		}
		k++;
	}
	
	
	/* Copy remaining elements of L[] if any */
	while(i < a1) {
		
		arr[k] = L[i];
		i++;
		k++;
		
	}
	while(j < a2) {
		
		arr[k] = R[j];
		
		j++;
		k++;
	}
	
}
	

public void margeSort(int arr[], int left, int right) {
	
	if(left < right) {
		
	//	int mid = left + (right - left) / 2;
		
		int mid = (left + right) /2;
		
		margeSort(arr, left, mid);
		
		margeSort(arr, mid + 1, right);
		
		
		mSort(arr, left, mid, right);
		
		
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



public class Merge_Sort_Algo {

	public static void main(String[] args) {
		
		
		mergeSort ms = new mergeSort();
		
		
		int arr[] = {33, 55, 1, 6, 5, 3};
		
		
		System.out.println("Given Array...");
     
		ms.print(arr);
		 System.out.println("\nMerge Sorted array...");
		
		ms.margeSort(arr, 0, arr.length -1);
		
		ms.print(arr);
		
		
		
	}

}
