package jfb.rtemirbulat.ticket_to_ride.controller;

import jfb.rtemirbulat.ticket_to_ride.dto.TicketRequest;
import jfb.rtemirbulat.ticket_to_ride.entity.Route;
import jfb.rtemirbulat.ticket_to_ride.entity.Ticket;
import jfb.rtemirbulat.ticket_to_ride.repository.RouteRepository;
import jfb.rtemirbulat.ticket_to_ride.service.TicketService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RouteController {

    private TicketService ticketService;
    private RouteRepository routeRepository;

    @PostMapping("/get-price")
    public Ticket findTicket(@RequestBody TicketRequest ticketRequest) {
        Route route = routeRepository.findRouteByCities(ticketRequest.getDeparture(), ticketRequest.getArrival());
        int segments = route.getSegments();
        Ticket ticket = new Ticket();
        ticket.setRoute(route);
        ticket.setPrice(ticketService.calculatePrice(segments));
        return ticket;
    }
}