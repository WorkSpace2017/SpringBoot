package com.inforever.eventmanagement.repo;

import org.springframework.data.repository.CrudRepository;

import com.inforever.eventmanagement.entity.Event;
import com.inforever.eventmanagement.entity.Participant;

public interface ParticipantRepository extends CrudRepository<Participant, Long> {

}
