//Создайте класс Book (название, автор). Создайте ArrayList. Добавьте туда несколько объектов.
// Напишите метод ArrayList<Book> getBook (ArrayList<Book> list, String author)
// который возвращает список книг, заданного автора.


import java.util.ArrayList;

public class Book {
    String name;
    String author;

    public Book (String name, String author) {
        this.name = name;
        this.author = author;
    }

    public static ArrayList<Book> getBooksByAuthor(ArrayList<Book> books, String author) {
        ArrayList<Book> booksByAuthor = new ArrayList<>();
        for (Book book : books) {
            if (book.author.equalsIgnoreCase(author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }
}
