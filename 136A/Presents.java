import java.util.Scanner;

public class Presents {
	

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		
		int arr[] = new int[n+1];
		
		for(int i = 1 ; i <= n ; i++) {
			 
			arr[i] = kb.nextInt();
		  
		}
		
		//printArray(arr);
		int index = 1;

		while(index <= arr.length) {
		for(int i = 1 ; i <= n ; i++) {
			 
		
			if(arr[i] == index) {
			
				System.out.print(i + " ");
			}
		  
		}
		
		index++;
		}
		
		
		
	}

}
