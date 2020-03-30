import java.util.*;

public  class HelpfulMaths {
  public static void main(String[] args) {
    
    Scanner kb = new Scanner(System.in);
    
    String input = kb.next();
    String output = "";
    for(int i = 0 ; i < 3 ; i++){
      
      for(int j = 0 ; j < input.length() ; j++){
        if(j % 2 == 0){
        
        if(i==0 &&  input.charAt(j) == '1'){
          
          output = output + "1+";
          
          
        }
          if(i==1 &&input.charAt(j) == '2'){
          output = output + "2+";
            
          
        }
         if(i==2 && input.charAt(j) == '3'){
          output = output + "3+";
          
        }
        
        
        
      }
      
      }    
      
      
      
    }
    
    for(int i = 0 ; i < output.length()-1;i++){
      System.out.print(output.charAt(i));
    }
    
    
  }
}
