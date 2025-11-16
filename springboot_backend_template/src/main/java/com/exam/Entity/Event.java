package com.exam.Entity;

import java.time.LocalDate;

import com.exam.Type.EventType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Event")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Event {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long eventId;
	
	@Column(nullable=false)
	@NotBlank(message="Event Name cannot be blank")
	private String eventName;
	
	@Column(nullable=false)
	@NotBlank(message="Event Name cannot be blank")
	private String organizerName;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable=false)
	@NotNull(message="Event Name cannot be blank")
	private EventType categoryName; // FIX THIS

	
	@Column(nullable=false)
	@NotBlank(message="Location cannot be blank")
	private String location;
	
	@Column(nullable=false)
	@NotBlank(message="City cannot be blank")
	private String city;
	
	@Column(nullable=false)
	@NotNull(message="Date cannot be blank")
	private LocalDate date;
	
	@Column(nullable=false)
	@DecimalMin(value="10", message="Ticket Price cannot be less than 10")
	private Double ticketPrice;
}
