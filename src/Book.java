//Создайте класс Book (название, автор). Создайте ArrayList. Добавьте туда несколько объектов.
// Напишите метод ArrayList<Book> getBook (ArrayList<Book> list, String author)
// который возвращает список книг, заданного автора.


import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Book {
    String name;
    String author;

    public Book (String name, String author) {
        this.name = name;
        this.author = author;
    }

    public static <T extends Book> @NotNull ArrayList<T> getBooksByAuthor(@NotNull ArrayList<T> books, String author) {
        ArrayList<T> booksByAuthor = new ArrayList<>();
        for (T book : books) {
            if (book.author.equalsIgnoreCase(author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }

}

