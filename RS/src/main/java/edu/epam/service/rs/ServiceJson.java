package edu.epam.service.rs;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import edu.epam.service.spring.SprBean;

@Path("json")
@Service
public class ServiceJson{
	
	//@Autowired
	//public SprBean sprB;
	
//	public void setSprB(SprBean sprB){
//		this.sprB = sprB;
//	}
	
	@GET
	@Path("{id}")
	@Produces("application/json")
	public Ticket checkOutJson(@PathParam("id") String id){
		Ticket ticket = new Ticket();
		ticket.setId(Integer.valueOf(id));
		ticket.setInitial("json");
		ticket.setDestination("destination");
		ticket.setName("n");
		ticket.setSurname("surn");
		return ticket;
	}
	
	@POST
	//@Path("book-ticket-json")
	@Produces("application/json")
	public Ticket bookTicketJson(){
		Ticket ticket = new Ticket();
		ticket.setId(1);
		ticket.setInitial("json");
		ticket.setDestination("destination");
		ticket.setName("n");
		ticket.setSurname("surn");
		return ticket;
	}
	
	@PUT
//	@Path("buy-ticket")
	@Produces("text/plain")
	public String buyTicket(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/spring-ws-servlet.xml");
		SprBean sprB = (SprBean)applicationContext.getBean("bean");
		
		try{	
			return sprB.getTestBean().getStr();
		}catch(NullPointerException e){
			return "0";
		}
		
	}
	
	@DELETE
//	@Path("return-ticket")
	@Produces("text/plain")
	public String returnTicket(){
		return "json";
	}

}
