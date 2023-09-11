package idqap2java;

public class Address {
    private String street;
private String city;
private String state;
private String zip;

//Constructor

public Address(String street, String city, String state, String zip) {
this.street = street;
this.city = city;
this.state = state;
this.zip = zip;
}
public Address(Address other)
{
this.street = other.street;
this.state = other.state;
this.zip = other .zip;
this.city = other.city;
}
//Default Constructor
public Address()
{
state ="";
city ="";
zip ="";
street ="";
}
//Getters and Setters

public String getStreet() {
return street;
}

public void setStreet(String street) {
this.street = street;
}

public String getCity() {
return city;
}

public void setCity(String city) {
this.city = city;
}

public String getState() {
return state;
}

public void setState(String state) {
this.state = state;
}

public String getZip() {
return zip;
}

public void setZip(String zip) {
this.zip = zip;
}

@Override
public String toString() {
return street+", "+city+", "+state+" "+zip;
}
}
