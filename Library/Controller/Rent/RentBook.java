package Library.Controller.Rent;

import Library.Controller.Common.SearchBook;
import Library.Models.Items.Book;
import Library.Models.User;

public class RentBook implements Rent{
    public User user;
    public RentBook(User user){
        this.user=user;
    }
    // Database RentNo | User | Book | ownDate | dueDate
    @Override
    public boolean getItem(String name){
        SearchBook sb = new SearchBook();
        return sb.searchByName(name);
    }
    @Override
    public boolean getItem(long id){
        SearchBook sb = new SearchBook();
        return sb.searchById(id);
    }
    @Override
    public boolean rent(String name){
        if(getItem(name) /* check for ban */){
            SearchBook sb = new SearchBook();
            Book book = sb.findBook(name);
            // generate rentNo
            // ownDate = date.now
            // dueDate = ownDate+14day
            // db.push ( this.user , book , ownDate, dueDate )
            return true;
        }
        return false;
    }
    @Override
    public boolean rent(long id){
        if(getItem(id) /* check for ban */){
            SearchBook sb = new SearchBook();
            Book book = sb.findBook(id);
            // generate rentNo
            // ownDate = date.now
            // dueDate = ownDate+14day
            // db.push ( this.user , book , ownDate, dueDate )
            return true;
        }
        return false;
    }
}
