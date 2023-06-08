package soap;

import java.util.Random;

public class Book {
    private final String ISBN;
    private final String authors;
    private final String year;
    private final String publisher;
    private final String title;
    private int amount_available;

    public Book() {
        ISBN = generateISBN();
        authors = String.valueOf(randInt(0, (long) Math.pow(10, 13)));
        year = String.valueOf(randInt(0, 2022));
        publisher = String.valueOf(randInt(0, (long) Math.pow(10, 13)));
        title = String.valueOf(randInt(0, (long) Math.pow(10, 13)));
        amount_available = (int) randInt(0, 100);
    }

    public Book(final String _ISBN, final String _authors, final String _year, final String _publisher, final String _title,
                int _amount_available) {
        ISBN = _ISBN;
        authors = _authors;
        year = _year;
        publisher = _publisher;
        title = _title;
        amount_available = _amount_available;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getAvailable() {
        return amount_available;
    }

    public String getBookInfo() {
        String s_available = Integer.toString(amount_available);

        String info = "ISBN = " + ISBN + "\n" +
                "Authors = " + authors + "\n" +
                "Year = " + year + "\n" +
                "Publisher " + publisher + "\n" +
                "Title = " + title + "\n" +
                "Available = " + s_available;

        return info;
    }

    public boolean addCopy(int amount) {
        amount_available += amount;
        return true;
    }

    public boolean removeCopy() {
        if (--amount_available < 0) {
            amount_available++;
            return false;
        }
        return true;
    }

    private String generateISBN() {
        StringBuilder code = new StringBuilder();
        long rand = randInt((long) Math.pow(10, 12), (long) Math.pow(10, 13));
        code.append(rand);
        code.setCharAt(1, '-');
        code.setCharAt(6, '-');
        code.setCharAt(11, '-');

        return code.toString();
    }

    private long randInt(long min, long max) {
        Random random = new Random();
        return random.nextLong(min, max);
    }
}
