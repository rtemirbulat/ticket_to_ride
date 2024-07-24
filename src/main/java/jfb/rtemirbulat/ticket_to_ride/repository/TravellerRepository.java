package jfb.rtemirbulat.ticket_to_ride.repository;

import jfb.rtemirbulat.ticket_to_ride.entity.Traveller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TravellerRepository extends JpaRepository<Traveller, Long> {
    Traveller findByName(String name);
}
