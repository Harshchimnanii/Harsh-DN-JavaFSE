package in.HarshChimnani;

import in.HarshChimnani.Service.OrderService;
import in.HarshChimnani.Service.PopupNotificationService;
import in.HarshChimnani.Service.notificationService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        notificationService notification = new PopupNotificationService();
        OrderService order = new OrderService(notification);
        order.PlaceOrder();
    }

}