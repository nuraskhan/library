package Library.Controller.AddItems;

import Library.Models.Author;
import Library.Models.Items.Book;
import Library.Models.Publisher;

import java.math.BigInteger;

public class BookShare extends ID {
    public BookShare(String ISBN, String Author, String Publisher ){
        int id = generateId();
        // Author = > return by name
        // if doesn't exist, manually create author class' element
        // Publisher = > return by name
        // if doesn't exist, manually create publisher class' element
        Book book  = new Book(new BigInteger(ISBN), "title", id, new Author("name","surname",1900,false,2000),new Publisher("name",10000000l,2000),1000);
        // book add to DB
    }
    @Override
    public int generateId(){
        // return last available id
        return 100000;
    }

}
