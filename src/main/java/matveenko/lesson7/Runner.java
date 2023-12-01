package matveenko.lesson7;

public class Runner {
    public static void main(String[] args) {
        Author authorA = new Author();
        authorA.age = 25;
        authorA.name = "Author A";
        authorA.genre = "Detective";
        Author authorB = new Author("Author B", "Fantacy", 35 );
        System.out.println(authorA);
        System.out.println(authorB);
        Book bookA = new Book(authorA, 2022, "Book A", "Publisher_NAME");
        Book bookB = new Book(authorB, 2020, "Book B", "Publisher_2_NAME");
        Book bookC = new Book(authorB, 2023, "Book C", "Publisher_NAME");
        authorA.books = new Book[] {bookA};
        authorB.books = new  Book[] {bookB,bookC};
        System.out.println(authorA);
        System.out.println(authorB);
        System.out.println(bookA);
        System.out.println(bookB);
        System.out.println(bookC);
    }
}
