package com.exam.Service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exam.DTO.ApiResponse;
import com.exam.DTO.EventDTO;
import com.exam.Entity.Event;
import com.exam.Exception.ResourceNotFoundException;
import com.exam.Repository.EventRepository;

import lombok.AllArgsConstructor;
@Service
@Transactional
@AllArgsConstructor
@RequestMapping("/api")
public class EventServiceImpl implements EventService {

	private EventRepository eventRepository;
	private ModelMapper modelMapper;
	
	@Override
	public ApiResponse addEvent(EventDTO eventDto) {
		Event event=modelMapper.map(eventDto, Event.class);
		Event perEvent=eventRepository.save(event);
		return new ApiResponse("Success","Event created Successfully" +perEvent.getEventId());
	}

	@Override
	public ApiResponse deleteEventById(long eventId) {
	    eventRepository.deleteById(eventId);
	    return new ApiResponse("Success", "Event deleted successfully with ID: " + eventId);
	}

	@Override
	public List<Event> getAllEvent() {
		return eventRepository.findAll(); 
	}

	@Override
	public List<Event> getEventsByLocation(String location) {
		return eventRepository.findByLocation(location);
	}

	@Override
	public Event getEventById(long eventId) {
		return eventRepository.findById(eventId)
	.orElseThrow(() -> new ResourceNotFoundException("Event not found with ID: " + eventId));
	}
}