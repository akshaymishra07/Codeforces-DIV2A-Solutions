import java.util.Scanner;
public class NineSixA {

	public static int countSubsequence(String stringPassed) {
		
		int temp=1 ;
		int ans =1 ;
		
		for(int i = 1 ; i < stringPassed.length() ; i++) {
			
			if(stringPassed.charAt(i) == stringPassed.charAt(i-1)) {
				temp++;
			}else {
				ans = Math.max(ans, temp);
				temp = 1 ;
			}
			
			
		}
		
		ans = Math.max(ans,temp);
	
		return ans;
	}
	
	
	public static void main(String[] args) {
		Scanner kb  = new Scanner(System.in);
		
		String stringInput = kb.next();
		
		int result = countSubsequence(stringInput);
		
		if(result>= 7){
			
			System.out.println("YES");
			
		}else
			System.out.println("NO");
		
		
		
	}
	
}
