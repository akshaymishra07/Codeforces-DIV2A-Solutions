import java.util.Scanner;

public class LuckyNumbers {
	public static boolean checkForLucky(int n) {
		int rem;
		//System.out.println("Function 2 got called");
		
		
		while(n>0) {
			rem = n%10;
			
			if(rem!= 4 && rem!=7) {
				return false;
			}
			
			n=n/10;
			
		}
		
		
		
		return true;
	}

	public static void isLucky(int n) {
		//System.out.println("Function 1 got called");
		
		if(checkForLucky(n)== true) {
			
			System.out.print("YES");
		}
		
		else if(n%4 == 0 || n% 7==0 || n% 44==0||n% 47==0||n% 74==0||n% 77==0||n% 444==0||n% 447==0||n% 474==0||n% 477==0) {
			
			System.out.print("YES");
		}
		else
			 System.out.print("NO");
		
		
	}
	 
	 
	public static void main(String[] args) {
	   Scanner kb = new Scanner(System.in);
      // System.out.println("Enter a numbr ");
	   int n = kb.nextInt();
	   
	   isLucky(n);
	}

}
