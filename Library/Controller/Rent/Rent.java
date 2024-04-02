package Library.Controller.Rent;

public interface Rent {
     boolean getItem(String name);
     boolean getItem(long id);
     boolean rent(String name);
     boolean rent(long id);

}
