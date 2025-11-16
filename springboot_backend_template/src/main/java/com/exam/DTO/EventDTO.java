package com.exam.DTO;

//java.time.LocalDate

import java.time.LocalDate;

import com.exam.Type.EventType;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EventDTO {
		
	@NotBlank(message="Event Name cannot be Blank")
	private String eventName;
	
	@NotBlank(message="organizer Name cannot be Blank")
	private String organizerName;
	
	@NotNull(message="Event cannot be Null!!!!!")
	private EventType categoryName;
	
	@NotBlank(message="Location cannot be Blank")
	private String location;
	
	@NotBlank(message="City cannot be Blank")
	private String city;
	
	@NotNull(message="Date cannot be Blank")
	private LocalDate date;
	
	@NotNull(message="Ticket_Price cannot be Blank")
	private Double ticketPrice;
}
