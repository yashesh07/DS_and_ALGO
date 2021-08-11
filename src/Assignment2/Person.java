package Assignment2;

class Person {
    String Name;
    int Age;
    String Address;
    String PersonalEmail;

    public String toString() {
        return "\n" + "Person{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                '}' + "\n";
    }

    public String getName() {
        return this.Name;
    }

    public int getAge() {
        return this.Age;
    }

    public void changeAge(int Age) {
        this.Age = Age;
    }

    public String getAddress() {
        return this.Address;
    }

    public String getPersonalEmail() {
        return this.PersonalEmail;
    }

    public void changeAddress(String Address) {
        this.Address = Address;
    }

    public void changePersonalEmail(String PersonalEmail) {
        this.PersonalEmail = PersonalEmail;
    }

    public Person(String Name, int Age, String Address, String PersonalEmail) {
        this.Name = Name;
        this.Age = Age;
        this.Address = Address;
        this.PersonalEmail = PersonalEmail;
    }

    //constructor overloading
    public Person() {
        this.Name = "Yashesh";                                          //Default name
        this.Age = 18;                                                  //Default age
        this.Address = "Shiv darshan society, surat, Gujarat.";         //Default address
        this.PersonalEmail = "yasheshbhavsar07@gmail.com";              //Default email
    }
}
