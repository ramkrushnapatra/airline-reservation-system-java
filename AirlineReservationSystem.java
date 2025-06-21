import constants.FlightStatus;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class AirlineReservationSystem {
    private AdminToFlightAssigner adminToFlightAssigner;
    private UserToBooking userToBooking;

    public AirlineReservationSystem(AdminToFlightAssigner adminToFlightAssigner,UserToBooking userToBooking) {
        this.adminToFlightAssigner = adminToFlightAssigner;
        this.userToBooking= userToBooking;
    }

    public void adminAssignFlights(List<Flight>flights, String source, String destination, Admin admin){
        if(!Objects.equals(admin.getAdminId(),"admin123")){
            throw new RuntimeException("only admin allow to assign flights");
        }
        adminToFlightAssigner.adminAssignFlights(source, destination,flights);
    }



    public void updateFlightStatus(String source, String destination, String flightId, Admin admin, FlightStatus flightStatus){
        if(!Objects.equals(admin.getAdminId(),"admin123")){
            throw new RuntimeException("only admin allow to assign flights");
        }

        adminToFlightAssigner.updateFlightStatus(source, destination, flightId, flightStatus);
    }


    public void searchFlights(String source, String destination){
        HashMap<String, List<Flight>>stringListHashMap = adminToFlightAssigner.getFlightHashMap();
        String key = source +"_" + destination;
        if(!stringListHashMap.containsKey(key)){
            throw new RuntimeException("there is no flight available now");
        }
        List<Flight>flightList = stringListHashMap.get(key);

        for(Flight flight:flightList){
            System.out.println(flight);

        }
    }


    public void userBookTicket(Tickets tickets, String userId){
        userToBooking.booked(userId,tickets);
    }

    public void userCancelledBooking(String ticketId, String userId){
        userToBooking.cancelledFlight(ticketId,userId);
    }

    public void checkBooking(String userId){
        userToBooking.checkBookings(userId);
    }


}
