package edu.epam.service.rs;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("xml")
public class ServiceXml {
	
	@GET
//	@Path("check-out-xml")
	@Produces("application/xml")
	public Ticket checkOutXml(){
		Ticket ticket = new Ticket();
		ticket.setId(1);
		ticket.setInitial("initial");
		ticket.setDestination("destination");
		ticket.setName("n");
		ticket.setSurname("surn");
		return ticket;
	}
	
	@POST
//	@Path("book-ticket-xml")
	@Produces("application/xml")
	public Ticket bookTicketXml(){
		Ticket ticket = new Ticket();
		ticket.setId(1);
		ticket.setInitial("initial");
		ticket.setDestination("destination");
		ticket.setName("n");
		ticket.setSurname("surn");
		return ticket;
	}
	
	@PUT
//	@Path("buy-ticket")
	@Produces("text/plain")
	public String buyTicket(){
		return "xml";
	}
	
	@DELETE
//	@Path("return-ticket")
	@Produces("text/plain")
	public String returnTicket(){
		return "xml";
	}

}
