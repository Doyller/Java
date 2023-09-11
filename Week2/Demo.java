package Week2;

public class Demo {


        public static void main(String[] args) {
        
        Student Alex = new Student();
        Alex.PrintCount();
        Student Alex2 = new Student(Alex);
        Alex.PrintCount();
        Student Laura = new Student("Laura", 18, 'A','F',"F102",'C');
        // Student(String n, int a, char g, char s, String rn, char Sec)
        Alex.PrintCount();
        
        
        
        Alex.setName("Alex");
        System.out.println(Alex.getName());
        System.out.println(Alex2.getName());
        System.out.println(Laura.getName());
        
        System.out.println(Laura);
        }
        
        }
        