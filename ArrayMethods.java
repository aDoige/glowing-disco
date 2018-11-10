import java.util.*; 

public class ArrayMethods { 

   public static int arrayMax(int [] origArray) {
   
      int max = 0;
   
      for (int i = 0; i < origArray.length; i++) 
      {
         if (origArray[i] > max) {
            max = origArray[i]; 
         } // END IF
      } // END FOR Loop
      return max; 
   } // END METHOD arrayMax

   public static int arrayMin(int [] origArray) {
   
      int min = origArray[0];
    
      for (int i = 0; i < origArray.length; i++) 
      {
         if (origArray[i] < min) {
            min = origArray[i]; 
         } // END IF
      } // END FOR Loop
      return min;
   
   } // END METHOD arrayMin 

   public static void arraySquared(int [] origArray) {
    
      for (int i = 0; i < origArray.length; i++) {
         int temp = (int) Math.pow(origArray[i], 2); 
      } // END FOR Loop
   
   } // END METHOD arraySquared
   
   public static void arrayReversed(int [] origArray) {
   
      for (int i = 0; i < origArray.length; i++) {
         int temp = origArray[i]; 
         
         if (i < origArray.length - (i+1)) {
            origArray[i] = origArray[origArray.length - (1 + i)]; 
            origArray[origArray.length - (1 + i)] = temp;
         }
         else
         {
            break;
         }
      
      } // END FOR Loop
   
   } // END METHOD arrayReversed

   public static void main(String[] args) {
   
      int [] origArray = new int [5];
      
      Random rand = new Random();
      System.out.print("Original Array: ");  
      
      for (int i = 0; i < origArray.length; i++) {
         origArray[i] = rand.nextInt(100);
         System.out.print(origArray[i] + ", ");
         
      }
      
      System.out.println();
      System.out.println("Max value: " + arrayMax(origArray));
      System.out.println("Min value: " + arrayMin(origArray));
      System.out.print("Squared array: ");
      arraySquared(origArray);
      System.out.print(Arrays.toString(origArray));
      System.out.println();
      System.out.print("Reversed array: ");
      arrayReversed(origArray);
      System.out.print(Arrays.toString(origArray));
   
   } // END METHOD Main
      
} // END ArrayMethods class