import java.util.*;

class Student{
    String name;
    int age;
    int roll_no;
    String course;

    Student(String name,int age,int roll_no,String course){
        this.name = name;
        this.age = age;
        this.roll_no = roll_no;
        this.course = course;
    }

    void display(){
        System.out.println("Student name : "+this.name);
        System.out.println("Age : "+this.age);
        System.out.println("Roll no :"+this.age);
        System.out.println("Course : "+this.course);
        System.out.println();
    }


}

public class First {

    //creating an arraylist for storing Objects of student class
    static ArrayList<Student> database = new ArrayList<Student>();

    public static void main(String[] args) throws Exception {

        System.out.println("Welcome to Student Database!");
        Scanner sc= new Scanner (System.in);

        System.out.println("1. Add new student in the records");
        System.out.println("2. Update existing records");
        System.out.println("3. Delete student records");
        System.out.println("4. View details of students");
        System.out.println("5. To Traverse the Entire Database ");
        System.out.println("6. To exit the application");

        while(true){
            System.out.println("Enter a choice: ");
            int choice=sc.nextInt();

            switch(choice){
                case 1:
                    // getting information about the new Student
                    System.out.println("Enter New Student's Credentials to store in Student Database !");
                    System.out.println("Enter student's name : ");
                    String name = sc.next();
                    System.out.println("Enter student's age : ");
                    int age = sc.nextInt();
                    System.out.println("Enter student's roll no : ");
                    int roll_no = sc.nextInt();
                    System.out.println("Enter student's course : ");
                    String course = sc.next();

                    // creating new Student Object and appending it to the arrayList
                    Student student = new Student(name,age,roll_no,course);
                    database.add(student);

                    System.out.println("New Student Sucessfully Added.");

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
                    //traversing the entire database (i.e the arraylist)
                    System.out.println();
                    System.out.println("X---**---STUDENT DATABASE--**--X");
                    for(int i =0;i<database.size();i++){
                        database.get(i).display();
                    }
                    break;

                case 6:
                    break;

                default:
                    System.out.println("Wrong Choice");
                    break;
            }
        }
    }
}
