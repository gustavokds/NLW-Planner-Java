package com.nlw.planner.planner.participant;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ParticipantsRepository extends JpaRepository<Participant, UUID> {

    List<Participant> findByTripId(UUID tripId);
}
