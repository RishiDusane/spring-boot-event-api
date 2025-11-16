package com.exam.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exam.DTO.EventDTO;
import com.exam.Service.EventService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class EventController {

	EventService event;
	
	@PostMapping("/addEvent")
	ResponseEntity<?> addEvent(@Valid @RequestBody EventDTO eventDto){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(event.addEvent(eventDto));
	}
	
	@GetMapping("/getAllEvents")
	ResponseEntity<?> getAllEvents(){
		return ResponseEntity.status(HttpStatus.OK)
		.body(event.getAllEvent());
	}

	@GetMapping("/events/{eventId}")
	ResponseEntity<?> getEventById(@PathVariable long eventId) {
		return ResponseEntity.status(HttpStatus.OK)
				.body(event.getEventById(eventId));
	}

	@GetMapping("/events/location/{location}")
	ResponseEntity<?> getEventsByLocation(@PathVariable String location) {
		return ResponseEntity.status(HttpStatus.OK)
				.body(event.getEventsByLocation(location));
	}

	@DeleteMapping("/deleteEvent/{eventId}")
	ResponseEntity<?> deleteEvent(@PathVariable long eventId) {
		return ResponseEntity.status(HttpStatus.OK)
				.body(event.deleteEventById(eventId));
	}
}