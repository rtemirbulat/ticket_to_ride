package jfb.rtemirbulat.ticket_to_ride.repository;

import jfb.rtemirbulat.ticket_to_ride.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,Long> {
}
