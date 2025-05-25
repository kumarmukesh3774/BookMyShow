package service;

import model.Order;
import model.User;

public interface NotificationSevice {
    public void notifyUser(User user, Order order);
}
