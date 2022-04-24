package com.vsnp.test;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainCal {

	@GetMapping("/get")
	public ResponseEntity<?> getCal(){
		return ResponseEntity.ok("Test 1");
	}
}
