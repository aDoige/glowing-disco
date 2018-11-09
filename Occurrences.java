import java.util.*; 

public class Occurrences {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
   
      int [] numbers = new int [10];
      
      System.out.println("Enter 10 integers: ");
         
      for (int i = 0; i < numbers.length; i++) {
         numbers[i] = input.nextInt();
         
      }
      
      Count(numbers);
       
            
   } // END METHOD Main
   
   public static void Count(int [] numbers) {
      
      int [] occurrences = new int [10];
      int count = 0;
      int k = 0;
   
      for (int i = 0; i < occurrences.length; i++) {
         occurrences [i] = - 1;
      }
   
      for (int i = 0; i < numbers.length; i++) {
         count = 1;
            for (int j = i+1; j < numbers.length; j++) {
               if (numbers[i] == numbers[j]) { 
                  count++;
                  occurrences[j] = 0; }
            }
         if (occurrences[i] != 0) {
            occurrences[i] = count; 
         }
      }
      for (int i = 0; i < occurrences.length; i++) {
         if (occurrences[i] != 0) {
            System.out.println(numbers[i] + " occurred " + occurrences[i] + " time(s)");
         }
         
      } // END FOR
   
   } // END METHOD Count
   
} // END class Occurrences
