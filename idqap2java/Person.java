package idqap2java;

public class Person {
    private String lastName;
    private String firstName;
    private Address home;
    
    public Person(String lastName, String firstName, Address home) {
    this.lastName = lastName;
    this.firstName = firstName;
    this.home = home;
    }
    //Getters and setters
    
    public String getLastName() {
    return lastName;
    }
    
    public void setLastName(String lastName) {
    this.lastName = lastName;
    }
    
    public String getFirstName() {
    return firstName;
    }
    
    public void setFirstName(String firstName) {
    this.firstName = firstName;
    }
    
    public Address getHome() {
    return home;
    }
    
    public void setHome(Address home) {
    this.home = home;
    }
    
    @Override
    public String toString() {
    return lastName+" "+firstName+", "+home;
    }
    } 