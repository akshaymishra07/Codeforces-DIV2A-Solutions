import java.util.*;

public class StringTask {
  static int arrayOfVowels[] = {65, 69 , 73 , 79 , 85  , 89 , 65+32 , 69+32 , 73+32 , 79+32 , 85+32 , 89+32};
  
  
  static boolean search(int n){
    
     for(int i = 0 ; i < arrayOfVowels.length ; i++  ){
       
       if(arrayOfVowels[i] == n){
         return true;
       }
       
       
       
     }
    
    return false;
    
  }
  
  public static void main(String[] args) {
    
    Scanner kb = new Scanner(System.in);
    
    String input = kb.nextLine();
    String output = "";
     
    
    
    for(int  i = 0 ; i < input.length() ; i++){
      
         if(!search((int)input.charAt(i))){
           
           output = output+".";
           
           
           if((int)input.charAt(i) <= 90 && (int)input.charAt(i) >= 65){
             
             output = output + (char)(input.charAt(i) + 32);
           }
           else
              output = output + input.charAt(i);
           
         }
      
      
    }
    
    System.out.print(output);
  }
}
