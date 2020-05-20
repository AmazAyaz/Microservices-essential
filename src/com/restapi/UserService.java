package com.restapi;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/users")
public class UserService {

	@Path("listUser")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getUser() {

		return "getting user list";
	}

	@Path("/CreateUsers")
	@POST
	public String createUser() {

		return "user created";
	}

	public void updateUser() {

	}

	public void deleteUser() {

	}

}
