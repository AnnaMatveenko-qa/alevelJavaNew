package matveenko.lesson7;

public class Book {
  public   Author author;
   public int year;
   public String title;
   public String publisher;

    public Book(Author author, int year, String title, String publisher) {
        this.author = author;
        this.year = year;
        this.title = title;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", year=" + year +
                ", title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';

    }
}
