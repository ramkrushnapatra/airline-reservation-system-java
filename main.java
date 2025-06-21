import constants.BookingStatus;
import constants.FlightStatus;

import java.util.List;

public class main {
    public static void main(String[]args){
        User user = new User("user123","kaka","email@gmail.com","=9173763783738");
        Admin admin = new Admin("admin123","admin","admin@email.com");
        Flight flight1 = new Flight("flight123","flightName1","flightColour1","6.2", FlightStatus.ACTIVE);
        Flight flight2 = new Flight("flight321","flightName2","flightColour2","6.2", FlightStatus.ACTIVE);

        AdminToFlightAssigner adminToFlightAssigner = new AdminToFlightAssigner();
        UserToBooking userToBooking = new UserToBooking();
        AirlineReservationSystem airlineReservationSystem = new AirlineReservationSystem(adminToFlightAssigner,userToBooking);
        airlineReservationSystem.adminAssignFlights(List.of(flight1,flight2),"banglore","odisha",admin);
        airlineReservationSystem.searchFlights("banglore","odisha");
        airlineReservationSystem.updateFlightStatus("banglore","odisha","flight123",admin,FlightStatus.CANCELLED);
        airlineReservationSystem.searchFlights("banglore","odisha");

        Tickets ticket1 = new Tickets("booking123","user123","flight321","banglore","odisha", BookingStatus.BOOKED,34567);
        airlineReservationSystem.userBookTicket(ticket1, user.getUserId());
        airlineReservationSystem.checkBooking(user.getUserId());
        airlineReservationSystem.userCancelledBooking(ticket1.getBookingId(), user.getUserId());
        airlineReservationSystem.checkBooking(user.getUserId());

    }
}
