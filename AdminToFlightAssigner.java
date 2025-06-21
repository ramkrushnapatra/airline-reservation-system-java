import constants.FlightStatus;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class AdminToFlightAssigner {

    private HashMap<String, List<Flight>>flightHashMap;

    public AdminToFlightAssigner() {
        this.flightHashMap = new HashMap<>();
    }

    public void adminAssignFlights(String source, String destination,List<Flight>flightList){
        String sourceDestinationKey = source +"_" + destination;
        flightHashMap.put(sourceDestinationKey,flightList);
    }


    public void updateFlightStatus(String source, String destination,String flightId,FlightStatus flightStatus){
        String sourceDestinationKey = source +"_" + destination;
        if(!flightHashMap.containsKey(sourceDestinationKey)){
            throw new RuntimeException("no flight available");
        }
        List<Flight>flightList = flightHashMap.get(sourceDestinationKey);
        if(flightList.isEmpty()){
            throw new RuntimeException("there is no flight available");
        }
        for(Flight flight:flightList){
            if(Objects.equals(flight.getFlightId(),flightId)){
                flight.setFlightStatus(flightStatus);
                break;
            }
        }
        flightHashMap.put(sourceDestinationKey, flightList);
    }

    public HashMap<String, List<Flight>> getFlightHashMap() {
        return flightHashMap;
    }
}
