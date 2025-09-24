class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name + " (" + gender + "), Email: " + email;
    }
}

class Book {
    private String title;
    private double price;
    private Author author;

    public Book(String title, double price, Author author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book: " + title + "\n" +
                "Price: " + price + "\n" +
                "Author: " + author;
    }
}

public class F_LibraryBookAuthor {
    public static void main(String[] args) {
        Author author = new Author("Joshua Bloch", "jbloch@abc.com", 'M');
        Book book = new Book("Effective Java", 550, author);

        System.out.println(book);
    }
}
