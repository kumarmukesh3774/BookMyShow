import service.impl.BookMyShowApplicationServiceImpl;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BookMyShowApplication {

    public static void main(String[] args) {
        BookMyShowApplicationServiceImpl bookMyShowApplicationServiceImpl = BookMyShowApplicationServiceImpl.getInstance();
        bookMyShowApplicationServiceImpl.initiallize();
        bookMyShowApplicationServiceImpl.startBooking();

    }
}