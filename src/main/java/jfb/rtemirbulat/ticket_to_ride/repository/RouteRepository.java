package jfb.rtemirbulat.ticket_to_ride.repository;

import jfb.rtemirbulat.ticket_to_ride.entity.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RouteRepository extends JpaRepository<Route,Long> {
    @Query("SELECT r FROM Route r WHERE (r.cityA = :city1 AND r.cityB = :city2) OR (r.cityA = :city2 AND r.cityB = :city1)")
    Route findRouteByCities(@Param("city1") String city1, @Param("city2") String city2);
}