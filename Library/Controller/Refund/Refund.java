package Library.Controller.Refund;

import Library.Models.Items.Book;
import Library.Models.Items.Publication;
import Library.Models.User;

public interface Refund <E extends Publication> {
    void refund(E publication , User user);

}
