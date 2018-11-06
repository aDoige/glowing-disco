import java.util.*; 

public class AssignGrades {

   public static void printGrades(int[] grade) {
      
      for (int i = 0; i < grade.length; i++) {
      
         if (grade[i] >= 90 && grade[i] <= 100) {
            System.out.println("Student " + i + " score is " + grade[i] + " is A");
         }
         else if (grade[i] >= 80 && grade[i] <= 89) {
            System.out.println("Student " + i + " score is " + grade[i] + " is B"); 
         }
         else if (grade[i] >= 70 && grade[i] <= 79) {
            System.out.println("Student " + i + " score is " + grade[i] + " is C"); 
         }
         else if (grade[i] >= 60 && grade[i] <= 69) {
            System.out.println("Student " + i + " score is " + grade[i] + " is D"); 
         }
         else if (grade[i] <= 59) {
            System.out.println("Student " + i + " score is  " + grade[i] + " is F");  
         }
         else
            System.out.println("Invalid Grade");
      
      } // END FOR Loop
       
   } // END METHOD printGrades
    
   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      
      System.out.print("How many students are in the class: ");
      int testScore [] = new int [input.nextInt()];   
      
      for (int i = 0; i < testScore.length; i++) { 
         
         System.out.print("Enter grade for each student: ");
         int grade = input.nextInt(); 
         
         while (grade < 0 || grade > 100) {
            System.out.print("Invalid. Please re-enter valid test score: ");
            grade = input.nextInt();  
         }
         testScore [i] = grade; 
      
      } // END FOR Loop
      
      System.out.println();
      System.out.print("Entered grades: ");
      
      
      for (int i = 0; i < testScore.length; i++) {
         
         System.out.print(testScore[i]);
         if (i != testScore.length - 1) {
            System.out.print(", ");
         }
         
      } // END FOR Loop
      
      System.out.println();
      printGrades(testScore);
      
      
   } // END METHOD Main

} // END Program