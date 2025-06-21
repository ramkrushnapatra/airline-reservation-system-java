import constants.BookingStatus;

public class Tickets {
    private String bookingId;
    private String userId;
    private String flightId;
    private String source;
    private String destination;
    private BookingStatus bookingStatus;
    private float amount;


    public Tickets(String bookingId, String userId, String flightId, String source, String destination, BookingStatus bookingStatus, float amount) {
        this.bookingId = bookingId;
        this.userId = userId;
        this.flightId = flightId;
        this.source = source;
        this.destination = destination;
        this.bookingStatus = bookingStatus;
        this.amount = amount;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Tickets{" +
                "bookingId='" + bookingId + '\'' +
                ", userId='" + userId + '\'' +
                ", flightId='" + flightId + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", bookingStatus=" + bookingStatus +
                ", amount=" + amount +
                '}';
    }
}
