package Assignment2;

public class Professor extends Employee {
    static String[] CourseAssigned = new String[100];
    static int NumberOfCourseAssigned = 0;

    public String[] getCourseAssigned() {
        String[] Course_Assigned = new String[Professor.NumberOfCourseAssigned];
        for (int i = 0; i < Professor.NumberOfCourseAssigned; i++) {
            Course_Assigned[i] = CourseAssigned[i];
        }
        return Course_Assigned;
    }

    public int addCourse(int CourseNumber) {
        Professor.CourseAssigned[Professor.NumberOfCourseAssigned] = Course.CourseName[CourseNumber - 1] + Course.CourseID[CourseNumber - 1];
        Professor.NumberOfCourseAssigned++;
        return -1;
    }

    public int removeCourse(int CourseNumber) {
        Professor.NumberOfCourseAssigned--;
        for (int i = CourseNumber - 1; i < Professor.NumberOfCourseAssigned; i++) {
            Professor.CourseAssigned[i] = Professor.CourseAssigned[i + 1];
        }
        return -1;
    }

    public int swapCourse(int courseNumber, int CourseNumber) {
        Professor.CourseAssigned[CourseNumber - 1] = Course.CourseName[courseNumber - 1] + Course.CourseID[courseNumber - 1];
        return -1;
    }

    public Professor(String Name, int Age, String Address, String PersonalEmail, String EmployeeID, String InstituteID, String Post) {
        super(Name, Age, Address, PersonalEmail, EmployeeID, InstituteID, Post);
    }

    //    constructor overloading
    public Professor() {
        super();
    }
}
