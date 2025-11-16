package com.exam.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.Entity.Event;
import com.exam.Type.EventType;

public interface EventRepository extends JpaRepository <Event, Long>{

	List<Event> findByEventName (String eventName);

	List<Event> findByCategoryName (EventType category); 
	
	List<Event> findByLocation(String location);
}