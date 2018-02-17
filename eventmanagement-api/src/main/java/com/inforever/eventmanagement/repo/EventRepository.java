package com.inforever.eventmanagement.repo;

import org.springframework.data.repository.CrudRepository;

import com.inforever.eventmanagement.entity.Event;

public interface EventRepository extends CrudRepository<Event, Long> {

}
