
public class Person {
    private String lastName;
    private String firstName;

    public Person(String ln, String fn)
    {
        this.lastName = ln;
        this.firstName = fn;
    }

    public String toString()
    {
        return (this.firstName + " " + this.lastName);
    }

    
}
