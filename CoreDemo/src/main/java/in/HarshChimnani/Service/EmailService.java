package in.HarshChimnani.Service;

public class EmailService implements notificationService {
    @Override
    public void sendNotification(){
        System.out.println("Notification sent to email ");
    }

}
