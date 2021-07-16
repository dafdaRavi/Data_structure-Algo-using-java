package MY_Stack;



class Two_stack{
	
	int[] arr;
	int size;
	int top1, top2;

     Two_stack(int n){
		
		size = n;
		
		arr = new int[n];
		
		top1 = n / 2 + 1;
		top2 = n /2;
	}
	
void push1(int x) {
	
	if(top1 > 0) {
		
		top1 --;
		
		arr[top1] = x;
	}else {
		
		System.out.println("Stack Overflow form push-1"+ " By element :" +  x +"\n");
		return;
	}
	
}

void push2(int x) {
		
		if(top2 < size -1) {
			
			top2++;
			
			arr[top2] = x;			
		}else {
			System.out.printf("Stack Overflow form push-2 By element : %d\n",x);
		    return;
		}
		
}

public int pop1() {
	
	int x = 0;
	if(top1 <= size / 2) {
		
		 x = arr[top1];
		
		top1++;
		
		return x;
	}else {
		
		System.out.printf("Stack UnderFlow Form Pop-1 with %d value",x);

		System.exit(1);
	}
	
	return 1;
}


public int pop2() {
	
	int x = 0;
		
	if(top2 >= size / 2 +1) {
		
		 x = arr[top2];
		 
		 
		 arr[top2] = 0;
		
		 top2--;
		
		return x;
	}
	
	else {
          System.out.printf("Stack UnderFlow Form Pop-2 with %d value",x);
	      System.exit(1);
	}
	
	return 1;
}


public void show() {
	
	for(int x : arr) {
		System.out.print(x+" ");
	}
	System.out.println();
}




}


public class two_stacks_in_an_array {

	public static void main(String[] args) {

		
		Two_stack  s = new Two_stack(8);		
		
		s.push1(33);
		s.push1(55);
		s.push1(44);
		s.push1(66);
	
		s.push2(03);
		s.push2(05);
		s.push2(-4);
		s.push2(06);
	
		
	//	System.out.print("Popped element from stack1 is "
     //           + " : " +  s.pop1() +"\n");

       System.out.print("Popped element from stack2 is "
                + ": " +  s.pop2() +"\n");
        
		
		s.show();
		
		
		
		
		
	}

}
