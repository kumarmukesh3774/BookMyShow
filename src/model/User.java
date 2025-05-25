package model;

import java.util.List;

public record User(String name, String mobileNumber , String username, String password, List<Order> orderList) {
}
