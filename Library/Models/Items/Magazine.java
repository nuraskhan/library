package Library.Models.Items;

import Library.Models.Items.Publication;
import Library.Models.Publisher;

import java.math.BigInteger;

public class Magazine extends Publication implements Item {
    private BigInteger ISBN;
    private String title;
    private long id;
    private Publisher publisher;
    private int size;
    private int year;
    private int edition;
    public Magazine(){}
    public Magazine(BigInteger ISBN, String title, long id, Publisher publisher, int size){
        super.ISBN=ISBN;
        this.title = title;
        this.id = id;
        super.publisher = publisher;
        super.size=size;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "ISBN=" + ISBN +
                ", title='" + title + '\'' +
                ", id=" + id +
                ", publisher=" + publisher +
                ", size=" + size +
                '}';
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public long getId() {
        return this.id;
    }

    @Override
    public int getYear() {
        return this.year;
    }

    @Override
    public int getEdition() {
        return this.edition;
    }
}
