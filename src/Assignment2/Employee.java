package Assignment2;

public class Employee extends Person {
    String EmployeeID;
    String InstituteID;
    String Post;

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeID='" + EmployeeID + '\'' +
                ", InstituteID='" + InstituteID + '\'' +
                ", Post='" + Post + '\'' +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Address='" + Address + '\'' +
                ", PersonalEmail='" + PersonalEmail + '\'' +
                '}';
    }

    public String getEmployeeID() {
        return this.EmployeeID;
    }

    public String getInstituteID() {
        return this.InstituteID;
    }

    public String getPost() {
        return this.Post;
    }

    public Employee(String Name, int Age, String Address, String PersonalEmail, String EmployeeID, String InstituteID, String Post) {
        super(Name, Age, Address, PersonalEmail);
        this.EmployeeID = EmployeeID;
        this.InstituteID = InstituteID;
        this.Post = Post;
    }

    //    constructor overloading
    public Employee() {
        super();
        this.EmployeeID = "000000000";                          //Default employee id
        this.InstituteID = "*********@iiitvadodara.ac.in";      //Default institute id
        this.Post = "Professor";                                //Default post
    }
}
