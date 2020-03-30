import java.util.Scanner;

public class BeautifulMatrix {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int arr [][] = new int[5][5];
		int row = 0 ;
		int column = 0;
 		
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				
				arr[i][j] = kb.nextInt();
				
				if(arr[i][j] == 1) {
					
					row = i+1;
					column = j+1;
					
				}
				
			}
			
		}
		
		
		
	   int result = Math.abs(row - 3) + Math.abs(column - 3); 
		
	   System.out.println(result);
		
		
	}
	
}
