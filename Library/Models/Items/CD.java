package Library.Models.Items;

public class CD implements Item {
    private String title;
    private long id;
    private int year;
    private int edition;

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
