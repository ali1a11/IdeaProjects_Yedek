package FlightControl.domain;
public class Flight {

    private Airplane airplane;
    private Place departureAirport;
    private Place targetAirport;

    public Flight(Airplane airplane, Place departureAirport, Place targetAirport) {
        this.airplane = airplane;
        this.departureAirport = departureAirport;
        this.targetAirport = targetAirport;
    }

    public Airplane getAirplane() {
        return this.airplane;
    }

    public Place getDeparturePlace() {
        return this.departureAirport;
    }

    public Place getTargetPlace() {
        return this.targetAirport;
    }

    @Override
    public String toString() {
        return this.airplane.toString() + " (" + this.departureAirport + "-" + this.targetAirport + ")";
    }
}

/* from mooc
package FlightControl;

public class Flight {

    private Airplane airplane;
    private String departureAirportID;
    private String targetAirportID;

    public Flight(Airplane airplane, String departureAirportID, String targetAirportID) {
        this.airplane = airplane;
        this.departureAirportID = departureAirportID;
        this.targetAirportID = targetAirportID;
    }

    public Airplane getAirplane() {
        return this.airplane;
    }

    public String getDepartureAirportID() {
        return this.departureAirportID;
    }

    public String getTargetAirportID() {
        return this.targetAirportID;
    }

    @Override
    public String toString() {
        return this.airplane.toString() + " (" + this.departureAirportID + "-" + this.targetAirportID + ")";
    }
}

 */