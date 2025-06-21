import constants.BookingStatus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class UserToBooking {
    private HashMap<String,List<Tickets>> userToTickets;

    public UserToBooking() {
        this.userToTickets = new HashMap<>();
    }

    public void booked(String userId,Tickets tickets){
        if(userToTickets.containsKey(userId)){
            List<Tickets> ticketsLits = userToTickets.get(userId);
            ticketsLits.add(tickets);

        }
        List<Tickets>ticketsList = new ArrayList<>();
        ticketsList.add(tickets);
        userToTickets.put(userId,ticketsList);

    }

    public void checkBookings(String userId){
        List<Tickets> ticketsList = userToTickets.get(userId);
        for(Tickets tickets:ticketsList){
            System.out.println(tickets);
        }

    }

    public void cancelledFlight(String bookingId,String UserId){
        List<Tickets>tickets = userToTickets.get(UserId);
        if(tickets.isEmpty()){
            throw new RuntimeException("to tickets avaialable");
        }
        for(Tickets ticket : tickets){
            if(Objects.equals(bookingId, ticket.getBookingId())){
                ticket.setBookingStatus(BookingStatus.CANCELLED);
                break;
            }
        }
    }
}
