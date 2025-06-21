import constants.FlightStatus;

public class Flight {
    private String flightId;
    private String flightName;
    private String flightColour;
    private String flightHeight;
    private FlightStatus flightStatus;

    public Flight(String flightId, String flightName, String flightColour, String flightHeight, FlightStatus flightStatus) {
        this.flightId = flightId;
        this.flightName = flightName;
        this.flightColour = flightColour;
        this.flightHeight = flightHeight;
        this.flightStatus = flightStatus;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getFlightColour() {
        return flightColour;
    }

    public void setFlightColour(String flightColour) {
        this.flightColour = flightColour;
    }

    public String getFlightHeight() {
        return flightHeight;
    }

    public void setFlightHeight(String flightHeight) {
        this.flightHeight = flightHeight;
    }

    public FlightStatus getFlightStatus() {
        return flightStatus;
    }

    public void setFlightStatus(FlightStatus flightStatus) {
        this.flightStatus = flightStatus;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightId='" + flightId + '\'' +
                ", flightName='" + flightName + '\'' +
                ", flightColour='" + flightColour + '\'' +
                ", flightHeight='" + flightHeight + '\'' +
                ", flightStatus=" + flightStatus +
                '}';
    }
}
