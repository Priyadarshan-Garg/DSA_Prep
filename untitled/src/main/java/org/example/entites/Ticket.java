package org.example.entites;

import java.util.Date;

public class Ticket {
    private String userId;
    private String TicketId;
    private String source;
    private String destination;
    private String DateOfJourney;
    private Train train;

    public Ticket(String userId, String ticketId, String source, String destination, String dateOfJourney, Train train) {
        this.userId = userId;
        TicketId = ticketId;
        this.source = source;
        this.destination = destination;
        DateOfJourney = dateOfJourney;
        this.train = train;
    }

    public String getUserId() {
        return userId;
    }

    public String getTicketId() {
        return TicketId;
    }

    public String getDestination() {
        return destination;
    }

    public Train getTrain() {
        return train;
    }

    public String getSource() {
        return source;
    }

    public String getDateOfJourney() {
        return DateOfJourney;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setDateOfJourney(String dateOfJourney) {
        DateOfJourney = dateOfJourney;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setTicketId(String ticketId) {
        TicketId = ticketId;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setTrain(Train train) {
        this.train = train;
    }
    public String getTicketInfo(){
        return String.format("Ticket ID : %s belong to user %s from %s to %s on %s",TicketId,userId,source,destination,DateOfJourney);
    }
}
