public class Course {
    private String courseName;
    private Instructor Ins;
    private Textbook Tb;

    public Course(String cn, Instructor ins, Textbook tb)
    {
        this.courseName = cn;
        this.Ins = ins;
        this.Tb = tb;

    }
    public String getCourseName() {
        return courseName;
    }
    public Instructor getIns() {
        return Ins;
    }
    public Textbook getTb() {
        return Tb;
    }
    public String toString()
    {
        return (this.courseName + "is taught by " + this.Ins + " has a textbook = " + this.Tb);
    }
    
}
