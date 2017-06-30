package com.company.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.company.pojo.POJO;

@Path("/test")
public class Test {

	@GET
	@Produces("application/json")
	public POJO testThis(){
		POJO p = new POJO();
		p.setName("test name");
		p.setRollNum("test rollNum");
		return p;
	}
}
