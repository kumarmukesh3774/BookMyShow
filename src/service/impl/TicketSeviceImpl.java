package service.impl;

import client.db.enums.BookingStatus;
import model.Seat;
import model.Show;
import model.Ticket;
import model.User;
import service.TicketSevice;

public class TicketSeviceImpl implements TicketSevice {
    @Override
    public boolean cancelTicket(String ticketId) {
        return false;
    }

    @Override
    public void bookTicket(Show show, Seat seat) {
        if(!seat.getStatus().equals(BookingStatus.BOOKED)){
            seat.setStatus (BookingStatus.BOOKED);
            System.out.println("=========Ticket Booked ==========");
            System.out.println("========= Movie: "+show.movie().name()+"==========");
            System.out.println("=========Seat Number "+seat.getId()+"==========");
            System.out.println("=========Amount paid "+seat.getRate()+"==========");
        }
        else{
            System.out.println("    Ticket already Booked   ");
        }
    }

    @Override
    public Ticket getTicketDetails(String id) {
        return null;
    }
}
