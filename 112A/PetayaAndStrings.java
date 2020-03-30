import java.util.*;

 public class PetayaAndStrings {
  public static void main(String[] args) {
   
    Scanner kb  = new Scanner(System.in);
    String str1 = kb.nextLine();
    String str2 = kb.nextLine();
    
    str1= str1.toLowerCase();
    str2= str2.toLowerCase();   
    int count1 = 0 ; 
    int count2 = 0 ;
    
    for(int i = 0 ; i < str1.length() ; i++ ){
 
       count1 += (int)str1.charAt(i);
       count2 += (int)str2.charAt(i);
      
    }
    
   /* if(count1>count2){
      System.out.print(1);
    }
    else if(count2 > count1){
      System.out.print(-1);
      
    }
    else if(count1 == count2)
      System.out.print(0);
    */
    
    
    if(str1.compareTo(str2) ==0){
            System.out.println("0");
        }
        if(str1.compareTo(str2) > 0){
            System.out.println("1");
        }
        if(str1.compareTo(str2) < 0){
            System.out.println("-1");           
        }
   
    
  }
}
