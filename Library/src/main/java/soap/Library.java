package soap;

import java.util.ArrayList;

public class Library {
    private static final ArrayList<Book> books = new ArrayList<>();

    public Library() {
        for (int i = 0; i < 3; i++) {
            books.add(new Book());
        }
    }

    public boolean newBook(final String _ISBN, final String _authors, final String _year, final String _publisher, final String _title) {
        books.add(new Book(_ISBN, _authors, _year, _publisher, _title, 0));
        return true;
    }

    public boolean addBook(String _ISBN, int amount) {
        for (Book book : books) {
            if (book.getISBN().equals(_ISBN)) {
                book.addCopy(amount);
                return true;
            }
        }
        return false;
    }

    public void returnBook(String _ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(_ISBN))
                book.addCopy(1);
        }
    }

    public boolean borrowBook(String _ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(_ISBN)) {
                return book.removeCopy();
            }
        }
        return false;
    }

    public String[] getLibInfo() {
        String[] output = new String[books.size()];
        for (int i = 0; i < books.size(); i++) {
            output[i] = i + 1 + ") " + books.get(i).getBookInfo();
        }
        return output;
    }

    private ArrayList<Book> getBooks() {
        return books;
    }

//    public static void main(String[] args)
//    {
//        Library lib = new Library();
//        System.out.println("hello");
//        System.out.println(lib.getBooks());
//    }
}
