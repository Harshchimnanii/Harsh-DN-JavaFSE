package in.HarshChimnani.Service;

public class OrderService {
    private notificationService Notification;

    public OrderService(notificationService Notification){
        this.Notification = Notification;
    }

    public void PlaceOrder(){
        System.out.println("orderPlaced");
        Notification.sendNotification();
    }
}
