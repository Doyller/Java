public class insDemo {
    public static void main(String[] args) {

        Instructor Qmalik = new Instructor("Malik", "Qurrat", "G105") ;

        Textbook JavaBook = new Textbook("Intro to Java", "Dietel n Deitel", "Pearson");


        Course JavaProg = new Course("Advanced Programming using Java", Qmalik, JavaBook);

        System.out.println(JavaProg);


        
    }
}
