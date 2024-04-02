package Library.Controller.AddItems;

import Library.Controller.AddItems.ID;

public class MagazineShare extends ID {

    // same as BookShare

    @Override
    public int generateId(){
        // return last available id
        return 100000;
    }

}
