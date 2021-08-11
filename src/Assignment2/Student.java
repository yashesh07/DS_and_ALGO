package Assignment2;

import java.util.Arrays;

public class Student extends Person {
    String RollNumber;
    String InstituteEmail;
    static int Semester;
    String Batch;
    double[] SPI = new double[8];
    double CPI;

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Address='" + Address + '\'' +
                ", PersonalEmail='" + PersonalEmail + '\'' +
                ", RollNumber='" + RollNumber + '\'' +
                ", InstituteEmail='" + InstituteEmail + '\'' +
                ", Batch='" + Batch + '\'' +
                ", SPI=" + Arrays.toString(SPI) +
                ", CPI=" + CPI +
                '}';
    }

    public String getRollNUmber() {
        return this.RollNumber;
    }

    public int getSemester() {
        return Semester;
    }

    public String getSPI() {
        return Arrays.toString(SPI);
    }

    public void changeSemester(int Semester) {
        Student.Semester = Semester;
    }

    public void addSPI(double SPI) {
        this.SPI[Semester - 1] = SPI;
    }

    public String getInstituteEmail() {
        return this.InstituteEmail;
    }

    public String getBatch() {
        return this.Batch;
    }

    public double getCPI() {
        changeCPI();
        return this.CPI;
    }

    private void changeCPI() {
        this.CPI = 0;
        int count=0;
        for (int i = 0; i < 8; i++) {
            if(this.SPI[i]>0) {
                this.CPI += this.SPI[i];
                count++;
            }
        }
        this.CPI=this.CPI/count;
    }

    public Student(String Name, int Age, String Address, String PersonalEmail, String RollNumber, String InstituteEmail, int Semester, String Batch, double SPI, double CPI) {
        super(Name, Age, Address, PersonalEmail);
        this.RollNumber = RollNumber;
        this.InstituteEmail = InstituteEmail;
        Student.Semester = Semester;
        this.Batch = Batch;
        this.SPI[Semester - 1] = SPI;
        this.CPI = CPI;
    }

    //    constructor overloading
    public Student() {
        super();
        this.RollNumber = "202011017";                                  //Default Roll number
        this.InstituteEmail = "202011017@diu.iiitvadodara.ac.in";       //Default email
        Student.Semester = 1;                                           //Default semester
        this.Batch = "A-CS";                                            //Default batch
        this.SPI[Semester - 1] = 0.0;                                   //Default SPI
        this.CPI = 0.0;                                                 //Default CPI
    }
}
