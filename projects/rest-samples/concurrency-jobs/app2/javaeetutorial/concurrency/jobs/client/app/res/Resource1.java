package javaeetutorial.concurrency.jobs.client.app.res;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/JobService/process")
public class Resource1 {

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response getResource(@QueryParam("jobID") int arg1) {
		return Response.status(100).build();
	}
}
