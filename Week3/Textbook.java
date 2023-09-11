public class Textbook {
    private String title;
    private String author;
    private String publisher;

    public Textbook(String title, String author, String publisher)
    {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }
    
    public Textbook(Textbook tb)
    {
        this.title = tb.title;
        this.author = tb.author;
        this.publisher = tb.publisher;
    }

    public void set(String title, String author, String publisher)
    {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }
    public String toString()
    {
        return (this.title + " written by "+ this.author+" published by " + this.publisher);
    }
}
