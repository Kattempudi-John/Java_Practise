package Phase1.Projects;

import java.util.Scanner;

public class StudentManagement {


    public static void main(String[] args) {
        studentApplication();
    }

    public static void studentApplication(){
        Scanner input = new Scanner(System.in);
        showMenu();

        boolean running = true;

        while(running){

            System.out.println("Select choice from menu");
            int choice = input.nextInt();
            switch (choice){

                case 1:{

                    System.out.println("Enter Student ID");
                    int studentID = input.nextInt();
                    System.out.println("Enter Student Name");
                    String studentName = input.next();
                    System.out.println("Enter Student age");
                    int studentAge = input.nextInt();
                    System.out.println("Enter Student marks");
                    double marks = input.nextDouble();

                    addStudent(studentID,studentName,studentAge,marks);

                    int count = 0;
                    for(int i = 1; i > count; i++){
                        if(studentID == i){
                            count++;
                        }
                    }
                    int[] studentIds = new int[count];
                    for ( int i = 0; i < studentIds.length; i++){
                        studentIds[i] = studentID;
                        System.out.println(studentIds[i]);
                    }
                    String[] names = new String[count];
                    for ( int i = 0; i < names.length; i++){
                        names[i] = studentName;
                        System.out.println(names[i]);
                    }

                    int[] ages = new int[count];
                    for ( int i = 0; i < ages.length; i++){
                        ages[i] = studentAge;
                        System.out.println(ages[i]);
                    }
                    double[] stuMarks = new double[count];
                    for ( int i = 0; i < stuMarks.length; i++){
                        stuMarks[i] = marks;
                        System.out.println(stuMarks[i]);
                    }

//                    for(int j = 0; j < studentIds.length; j++){
//                        System.out.println(studentIds[j] + " " + studentName);
//                    }
                    break;
                }

                case 2:{
                    allStudents();
                    break;
                }

                case 3:{
                    searchStudent();
                    break;
                }

                case 4:{
                    updateStudentMarks();
                    break;
                }

                case 5:{
                    calculateStudentmarks();
                    break;
                }

                case 6:{
                    deleteStudent();
                    break;
                }

                case 7:{
                    running = false;
                    break;
                }

                default:{
                    System.out.println("Wrong choice");
                }


            }
        }
    }

    public static void showMenu(){
        System.out.println("1. Add Student");
        System.out.println("2. View All Students");
        System.out.println("3. Search Student");
        System.out.println("4. Update Student Marks");
        System.out.println("5. Calculate Student Marks");
        System.out.println("6. Delete Student");
        System.out.println("7. Exit");

    }
    public static void addStudent(int stuId, String name, int age, double marks){

    }

    public static void allStudents(){

        System.out.println("All Students");
    }

    public static void searchStudent(){
        System.out.println("Search Student");
    }

    public static void updateStudentMarks(){
        System.out.println("Update Student Marks");
    }

    public static void calculateStudentmarks(){
        System.out.println("Calculate Student Marks");
    }
    public static void deleteStudent(){
        System.out.println("Delete Student");
    }
}
