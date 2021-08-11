package Assignment2;

import java.util.Arrays;

public class Course {
    static int NumberOfCourse = 0;
    static String[] CourseName = new String[100];
    static String[] CourseID = new String[100];
    static String[] CourseContent = new String[100];
    static int[] CourseSemester = new int[100];

    public String[] getCourseName() {
        String[] Course_Name = new String[Course.NumberOfCourse];
        for (int i = 0; i < Course.NumberOfCourse; i++) {
            Course_Name[i] = CourseName[i];
        }
        return Course_Name;
    }

    public String[] getCourseID() {
        String[] Course_ID = new String[Course.NumberOfCourse];
        for (int i = 0; i < Course.NumberOfCourse; i++) {
            Course_ID[i] = CourseID[i];
        }
        return Course_ID;
    }

    public String[] getCourseContent() {
        String[] Course_Content = new String[Course.NumberOfCourse];
        for (int i = 0; i < Course.NumberOfCourse; i++) {
            Course_Content[i] = CourseContent[i];
        }
        return Course_Content;
    }

    public int[] getCourseSemester() {
        int[] Course_Semester = new int[Course.NumberOfCourse];
        for (int i = 0; i < Course.NumberOfCourse; i++) {
            Course_Semester[i] = CourseSemester[i];
        }
        return Course_Semester;
    }

    public void changeCourseSemester(int CourseSemester, int index) {
        Course.CourseSemester[index] = CourseSemester;
    }

    @Override
    public String toString() {
        return "Course{" +
                "CourseName=" + Arrays.toString(getCourseName()) +
                ", CourseID=" + Arrays.toString(getCourseID()) +
                ", CourseContent=" + Arrays.toString(getCourseContent()) +
                ", CourseSemester=" + Arrays.toString(getCourseSemester()) +
                '}';
    }
}
