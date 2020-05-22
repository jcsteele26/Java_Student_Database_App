import java.util.Scanner;

public class Students {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = " ";
    private int tuitionBalance = 0;;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // Constructor to enter student name and year
    public Students(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = input.nextLine();

        System.out.println(("Enter student last name: "));
        this.lastName = input.nextLine();

        System.out.println("1 - Freshmen \n2 - Sophomore \n3 - Junior \n4 - Senior \nEnter student grade level: ");
        this.gradeYear = input.nextInt();

        setStudentID();

        //System.out.println(firstName + " " + lastName + " " + gradeYear + " " + ////studentID);
        
    }


    // Generate student id
    private void setStudentID(){
        // Grade level + id
        id++;
        this.studentID = gradeYear + "" + id;

    }


    // Enroll student in courses
    public void enroll(){ // Get inside loop until user hits 0
        do{
            System.out.print("Enter course to enroll (Q to Quit): ");
            Scanner input = new Scanner(System.in);
            String course = input.nextLine();
            if (!course.equals("Q")){
                courses = courses + "\n  " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        } while (1 != 0);

        //System.out.println("Enrolled in: " + courses);
        //System.out.println("Tuition balance : " + tuitionBalance);

    }

    // View student balance
    public void viewBalance(){
        System.out.println("Your tuition balance is: " + "$" + tuitionBalance);
    }

    // Pay student tuition
    public void payTuition(){
        viewBalance();
        System.out.print("How much would you like to pay?: ");
        Scanner input = new Scanner(System.in);
        int payment = input.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thanks for your payment of: " + "$" + payment);
        viewBalance();

    }

    // Show student status
    public String toString(){
        return "Name: " + firstName + " " + lastName + 
               "\nStudent ID: " + studentID +
               "\nGrade Level: " + gradeYear +
               "\nCourses Enrolled: " + courses + 
               "\nTuition Balance: $ " + tuitionBalance;

    }
    
}