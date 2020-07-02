package com.rest.webservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersionController {

	// URI versioning

	@GetMapping("v1/person")
	public Personv1 getPersonv1() {
		return new Personv1(new Name("Bob", "charlie"));
	}

	@GetMapping("v2/person")
	public Personv2 getPersonv2() {
		return new Personv2("Bob Charlie");

	}

	// request param versioning

	@GetMapping(value="/person/param",params = "version=1")
	public Personv1 getPersonv1ByReqParam() {
		return new Personv1(new Name("Bob1", "charlie"));
	}
	
	@GetMapping(value="/person/param",params = "version=2")
	public Personv2 getPersonv2ByReqParam() {
		return new Personv2("Bob1 Charlie");

	}
	
	//header versioning
	
	@GetMapping(value="/person/header",headers = "X-API-VERSION=1")
	public Personv1 getPersonv1ByHeader() {
		return new Personv1(new Name("Bobh", "charlie"));
	}
	
	@GetMapping(value="/person/header",headers = "X-API-VERSION=2")
	public Personv2 getPersonv2ByHeader() {
		return new Personv2("Bobh Charlie");

	}
	
	//MimeType Versioning
	
	@GetMapping(value="/person/produces",produces = "application/vnd.company.app-v1+json")
	public Personv1 getPersonv1ByMimeType() {
		return new Personv1(new Name("Bobm", "charlie"));
	}
	
	@GetMapping(value="/person/produces",produces = "application/vnd.company.app-v2+json")
	public Personv2 getPersonv2ByMimeType() {
		return new Personv2("Bobm Charlie");

	}
	
}
