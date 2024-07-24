package jfb.rtemirbulat.ticket_to_ride.dto;

import lombok.Data;

@Data
public class TicketRequest {
    private String departure;
    private String arrival;
    private double price;
    private double travellerAmount;
    private String traveller;
}