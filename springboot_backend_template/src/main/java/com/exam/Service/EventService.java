package com.exam.Service;

import java.util.List;

import com.exam.DTO.ApiResponse;
import com.exam.DTO.EventDTO;
import com.exam.Entity.Event;

public interface EventService {
	
	ApiResponse addEvent (EventDTO eventDto);
	
	ApiResponse deleteEventById(long eventId);
	
	List<Event> getAllEvent();

	List<Event> getEventsByLocation(String location);
	
	Event getEventById(long eventId);
}