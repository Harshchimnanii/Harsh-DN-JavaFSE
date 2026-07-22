package in.HarshChimnani;

public class OrderService {
    EmailService notification = new EmailService();

    public void PlaceOrder(){
        System.out.println("orderPlaced");
        notification.PlacedNotification();
    }
    public void NotPlaceOrder(){
        System.out.println("orderPlaced");
        notification.NotPlacedNotification();
    }
}
