package com.rest.webservices.somebean;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SomebeanResource {
	
	@Autowired
	Filter filter;
	
	@GetMapping("/filtering")
	public MappingJacksonValue getBean() {
		
		
		Somebean bean = new Somebean("hey", "hi", "hello");
		List <Somebean> list = new ArrayList<Somebean>();
		list.add(bean);
		
		
		return filter.applyFilteronSomebean(list);
		
//		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("feild1","feild2");
//		FilterProvider filters = new SimpleFilterProvider().addFilter("somefilter", filter);
//		MappingJacksonValue mapping = new MappingJacksonValue(bean);
//		mapping.setFilters(filters);
//		return mapping;
		//donot forget to add @JsonFilter("somefilter") on the bean class somebean.
	}
	
	
	
	@GetMapping("/filtering-list")
	public MappingJacksonValue getBeanList() {
		
		
		Somebean bean1 = new Somebean("hey", "hi", "hello");
		Somebean bean2 = new Somebean("hola", "greetings", "yippi");
		List<Somebean> list =  new ArrayList<Somebean>();
		list.add(bean1);list.add(bean2);
		
		
		
		return filter.applyFilteronSomebean(list);
		
		
		
//		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("feild1","feild2");
//		FilterProvider filters = new SimpleFilterProvider().addFilter("somefilter", filter);
//		MappingJacksonValue mapping = new MappingJacksonValue(list);
//		mapping.setFilters(filters);
//		return mapping;
	}

}
