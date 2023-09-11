package qap3idjava;

public class CollegeStudent extends Student {
    protected String major;
    protected int year;

    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa);
        this.year = year;
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public String getMajor() {
        return major;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String toString() {
        return super.toString() + ", year: " + year + ", major: " + major;
    }
}
