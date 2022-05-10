import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {

        methods<String> nameList = new methods<>();
        System.out.println("Enter your student name list. Enter 'n' to end....");
        Scanner userInput = new Scanner(System.in);

        while(true){
            String studentName = userInput.nextLine();
            if(!studentName.equalsIgnoreCase("n")){
                nameList.add(studentName);
            }
            else{
                break;
            }
        }

        //Display the list of the entered student’s names.
        System.out.println("You have displayed the following students' name: ");
        nameList.printList();
        System.out.println("\nThe number of students entered is: " + nameList.getSize());

        //rename students
        while(true){
            System.out.println("\nAll the names entered correct? Enter 'r' to rename the students name, 'n' to proceed. ");
            String choice = userInput.nextLine();

            if(choice.equalsIgnoreCase("r")){
                System.out.println("Enter the existing student name that you want to rename: ");
                String oldName = userInput.nextLine();

                System.out.println("\nEnter the new name: ");
                String newName = userInput.nextLine();

                nameList.replace(oldName,newName);

                System.out.println("\nThe new student list is: ");
                nameList.printList();

                //break;

            } else if (choice.equalsIgnoreCase("n")){
                break;
            }
            else if(!choice.equalsIgnoreCase("r") && !choice.equalsIgnoreCase("n")){
                System.out.println("Invalid input!");
            }
        }

        //remove student from list
        while(true){
            System.out.println("\nDo you want to remove any of your students name? Enter 'y' for YES and 'n' to proceed: ");
            String choice2 = userInput.nextLine();

            if(choice2.equalsIgnoreCase("y")){
                System.out.println("Enter the student name that you want to remove: ");
                String removeName = userInput.nextLine();

                nameList.removeElement(removeName);

                System.out.println("The number of updated student is: " + nameList.getSize());
                System.out.println("\nThe new student list is: ");
                nameList.printList();

                //break;

            } else if (choice2.equalsIgnoreCase("n")){
                break;
            }
            else if(!choice2.equalsIgnoreCase("y") && !choice2.equalsIgnoreCase("n")){
                System.out.println("Invalid input!");
            }
        }


        System.out.println("All students data capture complete. Thank you!");
    }
}