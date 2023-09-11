package week3;

public class JavaExample {
    static int i = 100;
    static String s = "IntroJava";
    static void display()

  {
    System.out.println("i:"+i);
    System.out.println("i:"+s);
  }


  void funcn()

  {//Static method called in non-static method​
    display();
    }
  public static void main(String args[])

  {
    JavaExample obj = new JavaExample();
    obj.funcn();
    display();
}}