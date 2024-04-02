package Library.Models;

public class Author {
    private String name;
    private String surname;
    private int wasBorn;
    private int dead;
    private boolean alive;

    public Author(String name, String surname, int wasBorn, boolean alive, int dead) {
        this.name = name;
        this.surname = surname;
        this.wasBorn = wasBorn;
        this.alive= alive;
        this.dead = dead;
    }
    // if alive = true;
    public Author(String name, String surname, int wasBorn) {
        this.name = name;
        this.surname = surname;
        this.wasBorn = wasBorn;
        this.alive = true;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

    public int getDead() {
        return dead;
    }

    public void setDead(int dead) {
        this.dead = dead;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", wasBorn=" + wasBorn +
                ", dead=" + dead +
                ", alive=" + alive +
                '}';
    }
}
