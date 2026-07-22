package in.HarshChimnani.Service;

public class SmsService implements notificationService{
    @Override
    public void sendNotification(){
        System.out.println("Sms Notification sent");
    }
}
