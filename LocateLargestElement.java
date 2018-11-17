import java.util.*; 

public class LocateLargestElement {

   public static void main(String[] args) {
     
      Scanner input = new Scanner(System.in);
      int [][] matrix = new int [3][4];
      
      System.out.println("Enter 12 integers: ");
      
      for (int row = 0; row < matrix.length; row++) {
         for (int column = 0; column < matrix[row].length; column++) {
            matrix[row][column] = input.nextInt();
         }
      }
      
      System.out.println("The entered matrix: ");
      for (int row = 0; row < matrix.length; row++) {
         for (int column = 0; column < matrix[row].length; column++) {
            System.out.print(" " + matrix[row][column]);
         } // END
         System.out.println();    
      } // END
      
      int[] result = locateLargest(matrix);
     
      System.out.println("First largest value is at row " + result[0] + " and column " + result[1] + ".");
   } // END main METHOD
         
   public static int [] locateLargest(int [][] matrix) {
   
      int [] largestValue = new int [2];
      int max = matrix[0][0];
      
      for (int i = 0; i < matrix.length; i++) {
         for (int j = 0; j < matrix[i].length; j++) {
            if (matrix[i][j] > max) {
               max = matrix[i][j];
               largestValue[0] = i; 
               largestValue[1] = j;  
            }  
         }
      }
      return largestValue;
   }

} // END class LocateLargestElement