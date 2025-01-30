 public class PercentageEligibility {
public static void main(String[] args) {
    int subject1 = 75;
    int subject2 = 80;
    int subject3 = 85;
    int totalMarks = subject1 + subject2 + subject3;
    int maximumMarks = 300;
    double percentage = (double) totalMarks / maximumMarks * 100;
    System.out.println("Total Marks: " + totalMarks);
    System.out.println("Percentage: " + percentage + "%");

    if (percentage >= 80) {
        System.out.println("The student is eligible.");
    } else {
        System.out.println("The student is not eligible."); 
   }
 } 
} 