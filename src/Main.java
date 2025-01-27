//Создайте пустой ArrayList т.е. список из строк. Ваша программа должна просить пользователя вводить строки
// (используем Scanner) и записывать строки в созданный ArrayList,
// пока пользователь не введет пустую строку. Затем распечатать все введенные строки
// из получившегося ArrayList (используем цикл и метод get(), не toString)

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите строки:");
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String stroka = sc.nextLine();
        while (!stroka.isEmpty()) {
            list.add(stroka);
            stroka = sc.nextLine();
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        
        ArrayList<Book> books = new ArrayList<>(){{
        add(new Book("Муму", "Тургенев"));
        add(new Book("Война и мир", "Толстой"));
        add(new Book("Отцы и дети", "Тургенев"));
        add(new Book("Братья Карамазовы", "Достоевский"));
        add(new Book("Каштанка", "Чехов"));
        add(new Book("Мастер и Маргарита", "Булгаков"));
        }};
//        books.add(new Book("Муму", "Тургенев"));
//        books.add(new Book("Война и мир", "Толстой"));
//        books.add(new Book("Отцы и дети", "Тургенев"));
//        books.add(new Book("Братья Карамазовы", "Достоевский"));
//        books.add(new Book("Каштанка", "Чехов"));
//        books.add(new Book("Мастер и Маргарита", "Булгаков"));


        System.out.println("Введите автора:");
        String author = sc.nextLine();
        ArrayList<Book> booksByAuthor = Book.getBooksByAuthor(books, author);

        if (booksByAuthor.isEmpty()) {
            System.out.println("Нету таких книг " + author);
        } else {
            System.out.println("книги автора " + author + ":");
            for (Book book : booksByAuthor) {
                System.out.println("- " + book.name);
            }
        }

        sc.close();

    }
}