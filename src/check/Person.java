package check;
public class Person
{
    String Name, Address , PersonalEmail;
    int Age ;
    public Person( String Name ,String Address,String PersonalEmail,int Age)
    {
        this.Name = Name;
        this.Address = Address;
        this.PersonalEmail=PersonalEmail;
        this.Age=Age;
    }
    public Person()
    {
        this.Name= "Person";
        this.Address= "XYZ";
        this.PersonalEmail="abc@gmail.com";
        this.Age=18;
    }
    public String toString()
    {
        return Name+" "+Address+" "+PersonalEmail+" "+Age;
    }
    public String getName()
    {
        return Name;
    }
    public int getAge()
    {
        return Age;
    }
    public String getaddrss()
    {
        return Address;
    }
    public String getPersonalEmail()
    {
        return PersonalEmail;
    }
    public void changePersoanlEmail(String NPersonalEmail)
    {
        PersonalEmail=NPersonalEmail;
    }
    public void changeAddress(String NAddress)
    {
        Address=NAddress;
    }
    public void changeAge(int NAge)
    {
        Age=NAge;
    }

}