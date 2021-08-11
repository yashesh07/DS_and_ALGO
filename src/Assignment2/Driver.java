package Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int Case;
            System.out.println("-----------------------------------------");
            System.out.println("*****************************************");
            System.out.println("-----------------------------------------");
            System.out.println("1. Student");
            System.out.println("2. Employee");
            System.out.println("3. Course");
            System.out.println("4. Exit");
            System.out.println("-----------------------------------------");
            System.out.println("*****************************************");
            System.out.println("-----------------------------------------");
            System.out.print("Select the option given above : ");
            switch (Case = scan.nextInt()) {
                case 1 -> CaseStudent();
                case 2 -> CaseEmployee();
                case 3 -> CaseCourse();
                case 4 -> System.exit(1);
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public static void CaseStudent() {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        int check;
        do {
            System.out.println("\n\nFill the details of student " + i);
            System.out.println("-----------------------------\n\n");
            System.out.print("Enter your name : ");
            if (i > 1) scan.nextLine();
            String Name = scan.nextLine();
            System.out.print("Enter your age : ");
            int Age = scan.nextInt();
            System.out.print("Enter your address : ");
            scan.nextLine();
            String Address = scan.nextLine();
            System.out.print("Enter your personal email : ");
            String PersonalEmail = scan.nextLine();
            System.out.print("Enter your roll number : ");
            String RollNumber = scan.nextLine();
            System.out.print("Enter your institute email : ");
            String InstituteEmail = scan.nextLine();
            System.out.print("Enter your Semester : ");
            int Semester = scan.nextInt();
            System.out.print("Enter your batch : ");
            scan.nextLine();
            String Batch = scan.nextLine();
            System.out.print("Enter your SPI : ");
            double SPI = scan.nextDouble();
            System.out.print("Enter your CPI : ");
            double CPI = scan.nextDouble();
            Student StudentObj = new Student(Name, Age, Address, PersonalEmail, RollNumber, InstituteEmail, Semester, Batch, SPI, CPI);
            while (true) {
                System.out.println("-----------------------------------------");
                System.out.println("*****************************************");
                System.out.println("-----------------------------------------");
                System.out.println("1. Print details");
                System.out.println("2. Print name");
                System.out.println("3. Print age");
                System.out.println("4. Print address");
                System.out.println("5. Print personal email");
                System.out.println("6. Print roll number");
                System.out.println("7. Print semester");
                System.out.println("8. Print institute email");
                System.out.println("9. Print batch");
                System.out.println("10. Print SPI");
                System.out.println("11. Print CPI");
                System.out.println("12. Change semester");
                System.out.println("13. Add SPI");
                System.out.println("14. Exit to main menu.");
                System.out.println("-----------------------------------------");
                System.out.println("*****************************************");
                System.out.println("-----------------------------------------");
                System.out.print("Select the option given above : ");
                int CASE = scan.nextInt();
                if (CASE == 14) break;
                switch (CASE) {
                    case 1 -> System.out.println(StudentObj);
                    case 2 -> System.out.println(StudentObj.getName());
                    case 3 -> System.out.println(StudentObj.getAge());
                    case 4 -> System.out.println(StudentObj.getAddress());
                    case 5 -> System.out.println(StudentObj.getPersonalEmail());
                    case 6 -> System.out.println(StudentObj.getRollNUmber());
                    case 7 -> System.out.println(StudentObj.getSemester());
                    case 8 -> System.out.println(StudentObj.getInstituteEmail());
                    case 9 -> System.out.println(StudentObj.getBatch());
                    case 10 -> System.out.println(StudentObj.getSPI());
                    case 11 -> System.out.println(StudentObj.getCPI());
                    case 12 -> {
                        System.out.print("Enter a new semester : ");
                        Semester = scan.nextInt();
                        StudentObj.changeSemester(Semester);
                    }
                    case 13 -> {
                        System.out.print("Enter the SPI of semester " + StudentObj.getSemester() + " : ");
                        SPI = scan.nextDouble();
                        StudentObj.addSPI(SPI);
                    }
                    default -> System.out.println("Invalid choice. Try again.");
                }
            }
            System.out.println("\n\nWant to fill details for student " + (++i) + " ? Enter 1 to fill details or enter any number to go to main menu : ");
            check = scan.nextInt();
        } while (check == 1);
    }

    public static void CaseEmployee() {
        Scanner scan = new Scanner(System.in);
        int Case;
        do {
            System.out.println("-----------------------------------------");
            System.out.println("*****************************************");
            System.out.println("-----------------------------------------");
            System.out.println("1. Professor");
            System.out.println("2. Staff");
            System.out.println("3. Service");
            System.out.println("4. Exit to main menu");
            System.out.println("-----------------------------------------");
            System.out.println("*****************************************");
            System.out.println("-----------------------------------------");
            System.out.print("Select the option given above : ");
            switch (Case = scan.nextInt()) {
                case 1 -> CaseProfessor();
                case 2 -> {
                    int i = 1;
                    int check;
                    do {
                        System.out.println("\n\nFill the details of staff " + i);
                        System.out.println("-----------------------------\n\n");
                        System.out.print("Enter your name : ");
                        scan.nextLine();
                        String Name = scan.nextLine();
                        System.out.print("Enter your age : ");
                        int Age = scan.nextInt();
                        System.out.print("Enter your address : ");
                        scan.nextLine();
                        String Address = scan.nextLine();
                        System.out.print("Enter your personal email : ");
                        String PersonalEmail = scan.nextLine();
                        System.out.print("Enter your employee id : ");
                        String EmployeeID = scan.nextLine();
                        System.out.print("Enter your institute id : ");
                        String InstituteID = scan.nextLine();
                        Employee StaffEmployeeObj = new Employee(Name, Age, Address, PersonalEmail, EmployeeID, InstituteID, "Staff");
                        while (true) {
                            System.out.println("-----------------------------------------");
                            System.out.println("*****************************************");
                            System.out.println("-----------------------------------------");
                            System.out.println("1. Print details");
                            System.out.println("2. Print name");
                            System.out.println("3. Print age");
                            System.out.println("4. Print address");
                            System.out.println("5. Print personal email");
                            System.out.println("6. Print employee id");
                            System.out.println("7. Print institute id");
                            System.out.println("8. Print post");
                            System.out.println("9. Exit to main menu.");
                            System.out.println("-----------------------------------------");
                            System.out.println("*****************************************");
                            System.out.println("-----------------------------------------");
                            System.out.print("Select the option given above : ");
                            int CASE = scan.nextInt();
                            if (CASE == 9) break;
                            switch (CASE) {
                                case 1 -> System.out.println(StaffEmployeeObj);
                                case 2 -> System.out.println(StaffEmployeeObj.getName());
                                case 3 -> System.out.println(StaffEmployeeObj.getAge());
                                case 4 -> System.out.println(StaffEmployeeObj.getAddress());
                                case 5 -> System.out.println(StaffEmployeeObj.getPersonalEmail());
                                case 6 -> System.out.println(StaffEmployeeObj.getEmployeeID());
                                case 7 -> System.out.println(StaffEmployeeObj.getInstituteID());
                                case 8 -> System.out.println(StaffEmployeeObj.getPost());
                                default -> System.out.println("Invalid choice. Try again.");
                            }
                        }
                        System.out.println("\n\nWant to fill details for staff " + (++i) + " ? Enter 1 to fill details or enter any number to go to main menu : ");
                        check = scan.nextInt();
                    } while (check == 1);
                }
                case 3 -> {
                    int i = 1;
                    int check;
                    do {
                        System.out.println("\n\nFill the details of Service " + i);
                        System.out.println("-----------------------------\n\n");
                        System.out.print("Enter your name : ");
                        scan.nextLine();
                        String Name = scan.nextLine();
                        System.out.print("Enter your age : ");
                        int Age = scan.nextInt();
                        System.out.print("Enter your address : ");
                        scan.nextLine();
                        String Address = scan.nextLine();
                        System.out.print("Enter your personal email : ");
                        String PersonalEmail = scan.nextLine();
                        System.out.print("Enter your employee id : ");
                        String EmployeeID = scan.nextLine();
                        System.out.print("Enter your institute id : ");
                        String InstituteID = scan.nextLine();
                        Employee ServiceEmployeeObj = new Employee(Name, Age, Address, PersonalEmail, EmployeeID, InstituteID, "Service");
                        while (true) {
                            System.out.println("-----------------------------------------");
                            System.out.println("*****************************************");
                            System.out.println("-----------------------------------------");
                            System.out.println("1. Print details");
                            System.out.println("2. Print name");
                            System.out.println("3. Print age");
                            System.out.println("4. Print address");
                            System.out.println("5. Print personal email");
                            System.out.println("6. Print employee id");
                            System.out.println("7. Print institute id");
                            System.out.println("8. Print post");
                            System.out.println("9. Exit to main menu.");
                            System.out.println("-----------------------------------------");
                            System.out.println("*****************************************");
                            System.out.println("-----------------------------------------");
                            System.out.print("Select the option given above : ");
                            int CASE = scan.nextInt();
                            if (CASE == 9) break;
                            switch (CASE) {
                                case 1 -> System.out.println(ServiceEmployeeObj);
                                case 2 -> System.out.println(ServiceEmployeeObj.getName());
                                case 3 -> System.out.println(ServiceEmployeeObj.getAge());
                                case 4 -> System.out.println(ServiceEmployeeObj.getAddress());
                                case 5 -> System.out.println(ServiceEmployeeObj.getPersonalEmail());
                                case 6 -> System.out.println(ServiceEmployeeObj.getEmployeeID());
                                case 7 -> System.out.println(ServiceEmployeeObj.getInstituteID());
                                case 8 -> System.out.println(ServiceEmployeeObj.getPost());
                                default -> System.out.println("Invalid choice. Try again.");
                            }
                        }
                        System.out.println("\n\nWant to fill details for service " + (++i) + " ? Enter 1 to fill details or enter any number to go to main menu : ");
                        check = scan.nextInt();
                    } while (check == 1);
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (Case != 4);
    }

    public static void CaseCourse() {
        Course CourseObj = new Course();
        Scanner scan = new Scanner(System.in);
        int Case;
        do {
            System.out.println("-----------------------------------------");
            System.out.println("*****************************************");
            System.out.println("-----------------------------------------");
            System.out.println("1. Add course");
            System.out.println("2. Print course details");
            System.out.println("3. Print course name");
            System.out.println("4. Print course id");
            System.out.println("5. Print course content");
            System.out.println("6. Print course semester");
            System.out.println("7. Change course semester");
            System.out.println("8. Exit to main menu");
            System.out.println("-----------------------------------------");
            System.out.println("*****************************************");
            System.out.println("-----------------------------------------");
            System.out.print("Select the option given above : ");
            switch (Case = scan.nextInt()) {
                case 1 -> {
                    System.out.print("Enter the course name : ");
                    scan.nextLine();
                    Course.CourseName[Course.NumberOfCourse] = scan.nextLine();
                    System.out.print("Enter the course id : ");
                    Course.CourseID[Course.NumberOfCourse] = scan.nextLine();
                    System.out.print("Enter the course content : ");
                    Course.CourseContent[Course.NumberOfCourse] = scan.nextLine();
                    System.out.print("Enter the course semester : ");
                    Course.CourseSemester[Course.NumberOfCourse] = scan.nextInt();
                    Course.NumberOfCourse += 1;
                }
                case 2 -> {
                    System.out.println(CourseObj);
                }
                case 3 -> {
                    System.out.println(Arrays.toString(CourseObj.getCourseName()));
                }
                case 4 -> {
                    System.out.println(Arrays.toString(CourseObj.getCourseID()));
                }
                case 5 -> {
                    System.out.println(Arrays.toString(CourseObj.getCourseContent()));
                }
                case 6 -> {
                    System.out.println(Arrays.toString(CourseObj.getCourseSemester()));
                }
                case 7 -> {
                    if (Course.NumberOfCourse == 0) System.out.println("No course available. Please add the course.");
                    else {
                        for (int i = 0; i < Course.NumberOfCourse; i++) {
                            if (i == 0) System.out.println("  \tName\tID\t\tSemester\tContent");
                            System.out.println((i + 1) + ".\t" + Course.CourseName[i] + "\t\t" + Course.CourseID[i] + "\t\t" + Course.CourseSemester[i] + "\t\t\t" + Course.CourseContent[i]);
                        }
                        System.out.print("Enter the number of course for which you want to change the semester : ");
                        int CourseNumber = scan.nextInt();
                        System.out.print("Enter the new semester : ");
                        int NewSemester = scan.nextInt();
                        CourseObj.changeCourseSemester(NewSemester, --CourseNumber);
                    }
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (Case != 8);
    }

    public static void CaseProfessor() {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        int check;
        do {
            System.out.println("\n\nFill the details of professor " + i);
            System.out.println("-----------------------------\n\n");
            System.out.print("Enter your name : ");
            if (i > 1) scan.nextLine();
            String Name = scan.nextLine();
            System.out.print("Enter your age : ");
            int Age = scan.nextInt();
            System.out.print("Enter your address : ");
            scan.nextLine();
            String Address = scan.nextLine();
            System.out.print("Enter your personal email : ");
            String PersonalEmail = scan.nextLine();
            System.out.print("Enter your employee id : ");
            String EmployeeID = scan.nextLine();
            System.out.print("Enter your institute id : ");
            String InstituteID = scan.nextLine();
            Professor ProfessorObj = new Professor(Name, Age, Address, PersonalEmail, EmployeeID, InstituteID, "Professor");
            while (true) {
                System.out.println("-----------------------------------------");
                System.out.println("*****************************************");
                System.out.println("-----------------------------------------");
                System.out.println("1. Print details");
                System.out.println("2. Print name");
                System.out.println("3. Print age");
                System.out.println("4. Print address");
                System.out.println("5. Print personal email");
                System.out.println("6. Print employee id");
                System.out.println("7. Print institute id");
                System.out.println("8. Print post");
                System.out.println("9. Print course assigned");
                System.out.println("10. Add course");
                System.out.println("11. Remove course");
                System.out.println("12. Swap course");
                System.out.println("13. Exit to main menu.");
                System.out.println("-----------------------------------------");
                System.out.println("*****************************************");
                System.out.println("-----------------------------------------");
                System.out.print("Select the option given above : ");
                int CASE = scan.nextInt();
                if (CASE == 13) break;
                switch (CASE) {
                    case 1 -> System.out.println(ProfessorObj);
                    case 2 -> System.out.println(ProfessorObj.getName());
                    case 3 -> System.out.println(ProfessorObj.getAge());
                    case 4 -> System.out.println(ProfessorObj.getAddress());
                    case 5 -> System.out.println(ProfessorObj.getPersonalEmail());
                    case 6 -> System.out.println(ProfessorObj.getEmployeeID());
                    case 7 -> System.out.println(ProfessorObj.getInstituteID());
                    case 8 -> System.out.println(ProfessorObj.getPost());
                    case 9 -> System.out.println(Arrays.toString(ProfessorObj.getCourseAssigned()));
                    case 10 -> {
                        if (Professor.NumberOfCourseAssigned > 2) System.out.println("You can't assigned more courses");
                        else{
                            if (Course.NumberOfCourse == 0)
                                System.out.println("No course available. Please add the course.");
                            else {
                                for (int k = 0; k < Course.NumberOfCourse; k++) {
                                    if (k == 0) System.out.println("  \tName\tID\t\tSemester\tContent");
                                    System.out.println((k + 1) + ".\t" + Course.CourseName[k] + "\t\t" + Course.CourseID[k] + "\t\t" + Course.CourseSemester[k] + "\t\t\t" + Course.CourseContent[k]);
                                }
                                System.out.println("Enter the Course number that you want to add : ");
                                int CourseNumber = scan.nextInt();
                                System.out.println(ProfessorObj.addCourse(CourseNumber));
                            }
                        }
                    }
                    case 11 -> {
                        if (Professor.NumberOfCourseAssigned == 0) System.out.println("No course is assigned to you");
                        else {
                            for (int k = 0; k < Professor.NumberOfCourseAssigned; k++) {
                                System.out.println((k + 1) + ".\t" + Professor.CourseAssigned[k]);
                            }
                            System.out.println("Enter the Course number that you want to remove : ");
                            int CourseNumber = scan.nextInt();
                            System.out.println(ProfessorObj.removeCourse(CourseNumber));
                        }
                    }
                    case 12 -> {
                        if (Professor.NumberOfCourseAssigned == 0) System.out.println("No course is assigned to you");
                        else {
                            for (int k = 0; k < Professor.NumberOfCourseAssigned; k++) {
                                System.out.println((k + 1) + ".\t" + Professor.CourseAssigned[k]);
                            }
                            System.out.println("Enter the Course number that you want to swap with : ");
                            int CourseNumber = scan.nextInt();
                            if (Course.NumberOfCourse == 0)
                                System.out.println("No course available. Please add the course.");
                            else {
                                for (int k = 0; k < Course.NumberOfCourse; k++) {
                                    if (k == 0) System.out.println("  \tName\tID\t\tSemester\tContent");
                                    System.out.println((k + 1) + ".\t" + Course.CourseName[k] + "\t\t" + Course.CourseID[k] + "\t\t" + Course.CourseSemester[k] + "\t\t\t" + Course.CourseContent[k]);
                                }
                            }
                            System.out.println("Enter the Course number that you want to add : ");
                            int courseNumber = scan.nextInt();
                            System.out.println(ProfessorObj.swapCourse(courseNumber, CourseNumber));
                        }
                    }
                    default -> System.out.println("Invalid choice. Try again.");
                }
            }
            System.out.println("\n\nWant to fill details for professor " + (++i) + " ? Enter 1 to fill details or enter any number to go to main menu : ");
            check = scan.nextInt();
        } while (check == 1);
    }

}
