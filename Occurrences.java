import java.util.*; 

public class Occurrences {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
   
      int [] numbers = new int [10];
      
      System.out.println("Enter 10 integers: ");
         
      for (int i = 0; i < numbers.length; i++) {
         numbers[i] = input.nextInt();
         
      }
      
      Count();
       
            
   } // END METHOD Main
   
   public static void Count() {
   
      int [] numbers = new int [10];
      int [] integers = new int [10];
      int [] occurrences = new int [10];
      int value = 0;  
   
      for (int i = 0; i < integers.length; i++) {
         value++; 
         boolean unique = true; 
      
         for (int k : numbers) {
            if (k == numbers[i]) {
               unique = false;
               break;
            } // END IF
         } // END FOR EACH
         
         if (unique == true) {
            for (int j = i + 1; j < numbers.length; j++) {
               if (integers[i] == numbers[i]) {
                  value++;
               } // END IF
            
               integers[i] = numbers[i];
               occurrences[i] = value; 
            } // END FOR
         
         } // END IF 
      
      } // END OUTER FOR Loop 
   
      for (int i = 0; i < numbers.length; i++) {
         System.out.println(integers[i] + " occurred " + occurrences[i] + " time(s)");
      
      } // END FOR
   
   } // END METHOD Count
   
} // END class Occurrences