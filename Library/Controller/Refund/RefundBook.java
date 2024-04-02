package Library.Controller.Refund;

import Library.Models.Items.Book;
import Library.Models.User;

public class RefundBook implements Refund<Book>{
    @Override
    public void refund(Book publication, User user) {
        // check dueDate if it's expires ban user, by BlcokUser class
        // logic
    }
}
