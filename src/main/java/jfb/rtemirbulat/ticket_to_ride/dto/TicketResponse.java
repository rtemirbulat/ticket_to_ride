package jfb.rtemirbulat.ticket_to_ride.dto;


import lombok.Data;

@Data
public class TicketResponse {
    private String result;
    private double change;
    private double lackOf;
    private String currency;
}