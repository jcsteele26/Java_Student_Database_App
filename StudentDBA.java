import java.util.Scanner;

public class StudentDBA {

    public static void main(String[] args) {

        // Ask how many new users to add
        System.out.println("Enter number of students to enroll: ");
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();

        Students[] student = new Students[count];

        // Create n new students
        for(int i = 0; i < count; i++){ 
            student[i] = new Students();
            student[i].enroll();
            System.out.println("");
            student[i].payTuition();
            System.out.println(student[i].toString());

        }

    }
}