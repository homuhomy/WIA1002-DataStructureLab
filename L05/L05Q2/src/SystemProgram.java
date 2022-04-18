import java.util.Scanner;

public class SystemProgram {
    public static void main(String[] args) {
        StudentSystem<String> studentList = new StudentSystem<>();

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your student name list. Enter 'n' to end: ");

        while(true){
            String studentName = userInput.nextLine();
            if(!studentName.equalsIgnoreCase("n"))
                studentList.add(studentName);
            else{
                break;
            }
        }

        //display student names
        studentList.printList();

        //calculate number of students in the list
        System.out.println("The number of students entered is: " + studentList.getSize());

//        System.out.println("All the names entered are correct? Enter 'r' to rename, 'n' to proceed. ");
//        char nameCorrection = userInput.next().charAt(0);
//        if(nameCorrection == 'r'){
//            System.out.println("Enter the existing student name you want to rename: ");
//            String currentname = userInput.nextLine();
//
//            System.out.println("Enter the new name: ");
//            String newName = userInput.nextLine();
//            studentList.replace(currentname,newName);
//            System.out.println();
//
//            System.out.println("The new student list is: ");
//            studentList.printList();
//            System.out.println();
//        }

        //studentList.removeElement("homu");
        studentList.printList();
    }
}
