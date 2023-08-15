package com.app.dto;


	import java.time.LocalDateTime;

	import lombok.Getter;
	import lombok.NoArgsConstructor;
	import lombok.Setter;

	@NoArgsConstructor
	@Getter 
	@Setter 
	//For Frontend Response
	public class ApiResponse {
		private String message;
		private LocalDateTime timeStamp;
		private boolean status = false;
		public ApiResponse(String message) {
			super();
			this.message = message;
			this.timeStamp=LocalDateTime.now();
			this.status = true;
			
		}
		
	}


