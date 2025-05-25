package service;

import model.Seat;
import model.Show;
import model.Ticket;
import model.User;

public interface TicketSevice {

    public boolean cancelTicket(String ticketId);
    public void bookTicket(Show show, Seat seat);
    public Ticket getTicketDetails(String id);

}
