package matveenko.lesson7;

public class Author {
     public  Book[] books={};
   public String name;
    public String genre;
    public int age;

    public Author(String name, String genre, int age) {
        this.name = name;
        this.genre = genre;
        this.age = age;
    }
public Author(){

}
    @Override
    public String toString() {
        return "Author{" +
                "books=" + books.length +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", age=" + age +
                '}';
    }
}
