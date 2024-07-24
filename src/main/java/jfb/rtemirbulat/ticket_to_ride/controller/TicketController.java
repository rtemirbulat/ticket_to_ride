package jfb.rtemirbulat.ticket_to_ride.controller;
import jfb.rtemirbulat.ticket_to_ride.dto.TicketRequest;
import jfb.rtemirbulat.ticket_to_ride.dto.TicketResponse;
import jfb.rtemirbulat.ticket_to_ride.service.TicketService;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api")
public class TicketController {
    private TicketService ticketService;
    @PostMapping("/persist-ticket")
    public TicketResponse persistTicket(@RequestBody TicketRequest request){
        boolean result = ticketService.approveTicket(
                request.getDeparture(),
                request.getArrival(),
                request.getPrice(),
                request.getTravellerAmount(),
                request.getTraveller());
        TicketResponse response = new TicketResponse();
        if(result) {
            response.setResult("success");
            response.setChange(request.getTravellerAmount()-request.getPrice());
        }
        else{
            response.setResult("failure");
        }
        response.setCurrency("GBP");
        return response;
    }
}
