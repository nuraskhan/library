package Library.Models.Items;

import Library.Models.Author;
import Library.Models.Publisher;

import java.math.BigInteger;

public class Book extends Publication implements Item {
    private BigInteger ISBN;
    private String title;
    private long id;
    private Author author;
    private Publisher publisher;
    private int size;

    public Book(){}
    public Book(BigInteger ISBN, String title, long id, Author author, Publisher publisher, int size){
        super.ISBN=ISBN;
        this.title = title;
        this.id = id;
        this.author=author;
        super.publisher = publisher;
        super.size=size;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN=" + ISBN +
                ", title='" + title + '\'' +
                ", id=" + id +
                ", author=" + author +
                ", edition=" + publisher +
                ", size=" + size +
                '}';
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public long getId() {
        return 0;
    }

    @Override
    public int getYear() {
        return 0;
    }

    @Override
    public int getEdition() {
        return 0;
    }
}
