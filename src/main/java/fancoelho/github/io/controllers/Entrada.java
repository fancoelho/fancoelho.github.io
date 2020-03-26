package fancoelho.github.io.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Entrada {
	
	@GetMapping("/test")
	public String get() {
		return "OK";
	}
	

}
