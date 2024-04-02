package Library.Models;

import java.math.BigInteger;

public class User {
    private long id;
    private String Name;
    private String email;
    private BigInteger phone;
    private boolean status;
    private int penalty;

    public void setStatus(boolean status){
        this.status=status;
    }
}
