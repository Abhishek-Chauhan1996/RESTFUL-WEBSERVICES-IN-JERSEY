package com.DEMO.Restful_WebServices;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("callalien")
public class AlienResource {
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Alien getData()
	{
		System.out.println("called");
		Alien a= new Alien();
		a.setId(5);
		a.setName("Abhishek");
		
		return a;
	}

}
