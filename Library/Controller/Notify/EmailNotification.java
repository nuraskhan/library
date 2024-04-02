package Library.Controller.Notify;

public class EmailNotification implements NotificationService{
    public EmailNotification(){}
    @Override
    public void sendMessage(String message) {
        //write email
        //use JavaMailSenderAPI
    }
}
