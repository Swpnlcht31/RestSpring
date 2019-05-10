package test;

//import java.awt.PageAttributes.MediaType;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@Path("/hello")
public class Hello {

//	@GET
//	@Produces(javax.ws.rs.core.MediaType.TEXT_XML)
//	public String sayHello() {
//		String resource = "<? xml version = '1.0' ?>" + "<hello> Hello Team This First XML </hello>";
//		return resource;
//	}
//
//	@GET
//	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
//	public String sayHelloJASON() {
//
//		String resource = null;
//		return resource;
//
//	}

	@GET
	@Produces(javax.ws.rs.core.MediaType.TEXT_HTML) // QueryParam is used to access key/value pairs in the query string
													// of the URL (the part after the ?).
	public String sayHelloHTML(@QueryParam("name") String name, @QueryParam("Card No") String card_no,
			@QueryParam("Ammount") int amount) {
		System.out.println("Name is " + name);
		System.out.println("Card No" + card_no);
		String resource;

		if (amount>100000) {

			System.out.println("Amount the greater than 1LAKH");
			resource = "Credit Card is not approved";
		} 
		
	else {

		System.out.println("Amount the Less than 1LAKH");
		resource = "Credit Card is approved";

		}
		return "<html>" + "<title>" + "Credi Card Authorization" + name + "</title>" + "<body><h1>" + resource
				+ "</body></h1>" + "</html>";
////		String resource = "<h1> Hello This HTML Hello</h1>";
//		return resource;

	}

}
