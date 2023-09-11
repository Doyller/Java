public class Instructor {
    private String lastName;
    private String firstName;
    private String officeNumber;

    public Instructor(String ln, String fn, String on)
    {
        this.lastName = ln;
        this.firstName = fn;
        this.officeNumber = on;
    }
    public Instructor(Instructor ins)
    {
        this.lastName = ins.lastName;
        this.firstName = ins.firstName;
        this.officeNumber = ins.officeNumber;
    }
    public void set(String ln, String fn, String on)
    {
        this.lastName = ln;
        this.firstName = fn;
        this.officeNumber = on;
    }
    public String toString()
    {
        return (this.firstName + " " + this.lastName + " Office number: " + this.officeNumber);
    }

}
