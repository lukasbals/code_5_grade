package at.bals.robot.services;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import at.bals.robot.dao.RobotDao;
import at.bals.robot.vo.Movie;

@Path("robot/")
public class RobotService {
	// Arraylist erstellen
	// private List<Movie> movielist = new ArrayList<Movie>();

	// POST
	@POST
	@Path("")
	// @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response insertData(Movie movie) {
		try {
			RobotDao dao = new RobotDao();
			dao.insertData(movie);
			return Response.status(201).build();
		} catch (SQLException e) {
			return Response.status(400).build();
		}
	}
}
