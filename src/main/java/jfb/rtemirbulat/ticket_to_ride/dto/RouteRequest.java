package jfb.rtemirbulat.ticket_to_ride.dto;

import lombok.Data;

@Data
public class RouteRequest {
    private String departure;
    private String arrival;
}