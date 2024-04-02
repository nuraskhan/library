package Library.Models.Items;

import Library.Models.Publisher;

import java.math.BigInteger;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Publication {
    protected BigInteger ISBN;
    protected Publisher publisher;
    protected int size;

    public Publication(){}
    public Publication(BigInteger ISBN, Publisher publisher, int size) {
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.size=size;
    }

}
