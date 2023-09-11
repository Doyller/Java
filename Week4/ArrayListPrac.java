import java.util.*;
public class ArrayListPrac {
    public static void main(String[] args) {

        ArrayList<String> obj = new ArrayList<String>();
        ArrayList<Person> obj2 = new ArrayList<Person>();

        Person p1 = new Person("Smith", "john");
        Person p2 = new Person("Sturge", "Glen");
        Person p3 = new Person("Ivany", "jonathan");
        Person p4 = new Person("Cole", "Hickey");
       
        obj2.add(p1);
        obj2.add(p2);
        obj2.add(p3);
        obj2.add(p4);
        obj2.add(p1);

        System.out.println("\nFirst Check " + obj2.contains(p1));


        for(int i=0 ;i<obj2.size();i++)
        {
            System.out.println(obj2.get(i));
        }
    obj2.remove(4);
    obj2.remove(p1);
    System.out.println("\nSecond Check " + obj2.contains(p1));
    obj2.add(2,p1);
    System.out.println();
    System.out.println("After removing an element");
    System.out.println();
    for(int i=0 ;i<obj2.size();i++)
    {
        System.out.println(obj2.get(i));
    }

        obj.add("Alex");
        obj.add("Ainee");
        obj.add("Glen");

     //   System.out.println(obj.size());
       // System.out.println(obj);
    }
}
