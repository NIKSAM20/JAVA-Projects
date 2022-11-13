import java.util.Scanner;

public class First {
    public static void main(String[] args) throws Exception {

        System.out.println("Welcome to Student Database!");
        Scanner sc= new Scanner (System.in);

        System.out.println("1. Add new student in the records");
        System.out.println("2. Update existing records");
        System.out.println("3. Delete student records");
        System.out.println("View details of students");
        System.out.println("5. To exit the application");

        while(true){
            System.out.println("Enter a choice: ");
            int choice=sc.nextInt();

            if(choice==1){
                //Add new Student

            }

            else if(choice==2){
                //Update records

            }

            else if(choice==3){
                //Delete student
            }

            else if(choice==4){
                //View Details
            }

            else if(choice==5){
                break;
            }

            else{
                System.out.println("Wrong choice");
            }
        }
    }
}