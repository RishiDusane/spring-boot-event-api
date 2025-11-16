package com.exam.DTO;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiResponse {
		private String status;
		private String message;
		private LocalDateTime time;
		
		public ApiResponse(String status, String message) {
			
			this.status = status;
			this.message = message;
			this.time = LocalDateTime.now();
		}
		
		
}
