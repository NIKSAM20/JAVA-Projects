import java.util.*;

public class First {
    public static void main(String[] args) throws Exception {

        System.out.println("Welcome to Student Database!");
        Scanner sc= new Scanner (System.in);

        System.out.println("1. Add new student in the records");
        System.out.println("2. Update existing records");
        System.out.println("3. Delete student records");
        System.out.println("4. View details of students");
        System.out.println("5. To exit the application");

        while(true){
            System.out.println("Enter a choice: ");
            int choice=sc.nextInt();

            switch(choice){
                case 1:
                    //Add new student
                    break;

                case 2:
                    //Update Records
                    break;

                case 3:
                    //Delete Records
                    break;

                case 4:
                    //View Details
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Wrong Choice");
                    break;
            }
        }
    }
}