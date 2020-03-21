package com.sachin.microservice.movecatalog;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.xml.ws.ResponseWrapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.sachin.microservice.movecatalog.service.MoveInfo;
import com.sachin.microservice.movecatalog.service.UserRattingService;


@RestController
@RequestMapping("/catalog")
public class moveCatalogController {
	
	Logger log = LoggerFactory.getLogger(moveCatalogController.class);
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	MoveInfo moveinfo;
	
	@Autowired
	UserRattingService userRatting;
	
	@GetMapping("/{userId}")
	//@HystrixCommand(fallbackMethod="getMoveCatalogFallBack")
	public List<CatalogItem> getMoveCatalog(@PathVariable String userId){
		log.info("Started getMoveCatalog");
		/*return Collections.singletonList(
			new CatalogItem("Titanic", "test", "5"));*/
		
		UserRatting result = userRatting.getUserRatting(userId);
		List<CatalogItem> catalog = new ArrayList<>();
		for(Rating rating:result.getUserRatting()) {
			Move move =moveinfo.getMove(rating);
			catalog.add(new CatalogItem(rating.getMoveId(), move.getName(), rating.getRating()));
		}
		
		return catalog;
		/*return result.stream()
				.map(rating ->{ 
					restTemplate.getForObject("http://localhost:8090/moveinfo/" + rating.getMoveId(), Move.class);
					new CatalogItem("Titanic", "test", "5");}
				)
				.collect(Collectors.toList());*/
	}
	
	
	/*public List<CatalogItem> getMoveCatalogFallBack(@PathVariable String userId){
		return Arrays.asList(new CatalogItem("No Move", "Hystrix fallback method", "0"));
	}*/
}
