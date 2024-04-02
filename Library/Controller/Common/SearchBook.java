package Library.Controller.Common;

import Library.Models.Items.Book;

public class SearchBook {
    public SearchBook(){}
    public boolean searchByName(String name){
        return true;
    }
    public boolean searchById(long id){
        return true;
    }
    public Book findBook(String name){
        if(searchByName(name)){
            return new Book();
        }else{
            return null;
        }
    }
    public Book findBook(long id){
        if(searchById(id)){
            return new Book();
        }else{
            return null;
        }
    }
}
