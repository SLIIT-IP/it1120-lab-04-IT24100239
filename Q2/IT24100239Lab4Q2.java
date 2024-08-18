import java.util.Scanner;

public class IT24100239Lab4Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int exammarks, labmarks, exampercentage, labpercentage;

        System.out.print("Please enter exam marks (out of 100): ");
        exammarks = input.nextInt();
        if (exammarks >= 0 && exammarks <= 100) {
            System.out.print("Please enter lab submission marks (out of 100): ");
            labmarks = input.nextInt();
            if (labmarks >= 0 && labmarks <= 100) {
                System.out.print("Please enter percentage given for the exam: ");
                exampercentage = input.nextInt();
                System.out.print("Please enter percentage given for the lab submission: ");
                labpercentage = input.nextInt();
                if (exampercentage + labpercentage == 100) {
                    double finalMark = (exammarks * exampercentage / 100.0) + (labmarks * labpercentage / 100.0);
                    System.out.println("Final Exam Mark is: " + finalMark);
                } else {
                    System.out.println("The percentages must add up to 100. Terminating program.");
                }
            } else {
                System.out.println("Invalid input for lab submission marks. Terminating program.");
            }
        } else {
            System.out.println("Invalid input for exam marks. Terminating program.");
        }
    }
}
