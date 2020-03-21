package com.sachin.microservice.moveinfo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/moveinfo")
public class MoveInfoController {

	@GetMapping("/{moveId}")
	public Move getMovesById(@PathVariable String moveId){
		return new Move("123","Titanic");
	}
	
	/*@GetMapping("/{userId}")
	public List<Move> getMovesByUserId(@PathVariable String userId){
		return new Move("123","Titanic");
	}*/
}
