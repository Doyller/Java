package Week2;

public class Student {
    //attributes
    private String name;
    private int age;
    private char Grade;
    private char Gender;
    private String RegNo;
    private char Section;
    private static int count = 0;
    private static final float g = 10.00f;
    Student()
    {
    this.name = "Noname";
    this.age = 0;
    this.Gender = ' ';
    this.Grade = ' ';
    this.Section = ' ';
    this.RegNo = null;
    this.count ++;
    }
    Student(String n, int a, char g, char s, String rn, char Sec)
    {
    this.name = n;
    this.age = a;
    this.Gender = g;
    this.Grade = s;
    this.Section = Sec;
    this.RegNo = rn;
    this.count ++;
    }
    //copuy constructor 
    Student(Student st)
    {
    this.name = st.name;
    this.Gender = st.Gender;
    this.Grade = st.Grade;
    this.RegNo = st.RegNo;
    this.age = st.age;
    this.Section = st.Section;
    this.count++;
    
    }
    //methods
    public boolean isTired()
    {
    System.out.println(this.name + " is tired");
    return true;
    }
    public boolean isStressed()
    {
    return false;
    }
    public void GPA()
    {
    System.out.println("TBD"); 
    }
    
    public String getName()
    {
    return this.name;
    }
    public void setName(String s)
    {
    this.name = s;
    }
    public int getAge() {
    return age;
    }
    public char getGender() {
    return Gender;
    }
    public char getGrade() {
    return Grade;
    }
    public String getRegNo() {
    return RegNo;
    }
    public char getSection() {
    return Section;
    }
    public void setAge(int age) {
    this.age = age;
    }
    public void setGender(char gender) {
    Gender = gender;
    }
    public void setGrade(char grade) {
    Grade = grade;
    }
    public void setRegNo(String regNo) {
    RegNo = regNo;
    }
    public void setSection(char section) {
    Section = section;
    }
    public void PrintCount() {
    System.out.println("number of students = " + this.count);
    }
    
    public String toString(){
    
    return (this.name + " age = "+ this.age + " grade = "+ this.Grade + " gender = "+ this.Gender + " regno = "+ this.RegNo+ " section = "+ this.Section);
    }
    }
     