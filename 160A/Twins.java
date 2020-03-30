

import java.util.Scanner;

public class Twins {
  
 static int countCoins(int array[] , int sum1){
    int coinCount = 0 ;
    int mySum = 0 ;
    int i = array.length-1;
    
    
      while(sum1 >= mySum) {
    	  
    	  mySum = mySum +  array[i];
    	  coinCount++;
    	  sum1 = sum1 - array[i];
    	  i--;
    	 
    	 
    	  
    	  
    	  
    	  
      }
    
	 
	 return coinCount;
 }
  
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    
    int n = kb.nextInt();
    int sum = 0 ;
    int imin;
    
    int array[] = new int[n];
    
    for(int i = 0 ; i < array.length ; i++ ){
      
      array[i] = kb.nextInt();
      sum+=array[i];
      
      
    }
    kb.close();
    
   // System.out.print("the sum of elements :" + count);
    
    for(int i = 0 ; i < array.length -1 ; i++){
      imin = i;
      for(int j = i+1 ; j < array.length ; j++){
         if(array[j] < array[imin]){
           
           imin = j;
         }
        
        
      }
      
      if(imin != i){
        int temp = array[i];
        array[i] = array[imin];
        array[imin] = temp;
        
      }
      
      
    }
    
    int result = countCoins(array , sum);
    
   System.out.print(result);
    
    
  }
}
