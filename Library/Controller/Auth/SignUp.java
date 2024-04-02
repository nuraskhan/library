package Library.Controller.Auth;

import Library.Controller.Notify.EmailNotification;
import Library.Controller.Notify.MobileNotification;

public class SignUp {
    private int code;
    private boolean access = false;
    SignUp(){}
    // send new User data
    // if email is chosen then
    public void generateCode(){
        code = 28;
    }
    public boolean validate(){
        access=true;
        return access;
    }
    public void viaEmail(){
        EmailNotification email =  new EmailNotification();
        if(access){
            email.sendMessage(code+"");
        }
    }
    public void viaPhone(){
        MobileNotification mobile = new MobileNotification();
        if(access){
            mobile.sendMessage(code+"");
        }
    }

}
