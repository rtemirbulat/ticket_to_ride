package jfb.rtemirbulat.ticket_to_ride.service;

import jfb.rtemirbulat.ticket_to_ride.entity.Route;
import jfb.rtemirbulat.ticket_to_ride.entity.Ticket;
import jfb.rtemirbulat.ticket_to_ride.entity.Traveller;
import jfb.rtemirbulat.ticket_to_ride.repository.RouteRepository;
import jfb.rtemirbulat.ticket_to_ride.repository.TicketRepository;
import jfb.rtemirbulat.ticket_to_ride.repository.TravellerRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TicketService {
    private RouteRepository routeRepository;
    private TicketRepository ticketRepository;
    private TravellerRepository travellerRepository;

    public double calculatePrice(int segmentCount) {
        int price = 0;
        while (segmentCount > 0) {
            if (segmentCount >= 3) {
                price += 10;
                segmentCount -= 3;
            } else if (segmentCount == 2) {
                price += 7;
                segmentCount -= 2;
            } else {
                price += 5;
                segmentCount--;
            }
        }
        return price;
    }

    public boolean approveTicket(String departure, String arrival, double price, double travellerAmount, String travellerName) {
        Traveller traveller = travellerRepository.findByName(travellerName);
        if (traveller.getBalance() == 0 || traveller.getName() == null || traveller.getBalance() < price) {
            return false;
        }
        Route route = routeRepository.findRouteByCities(departure, arrival);
        if (route != null) {

            Ticket ticket = new Ticket();
            ticket.setRoute(route);
            ticket.setPrice(price);
            ticket.setTraveller(travellerName);
            ticket.setTravellerAmount(travellerAmount);
            ticketRepository.save(ticket);
            traveller.setBalance(traveller.getBalance() - price);
            travellerRepository.save(traveller);

            return true;
        }
        return false;
    }

}
