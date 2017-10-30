package com.exercise.rest.api;

import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.exercise.rest.api.vo.ConsumptionVO;
import com.exercise.rest.api.vo.LoginVO;
import com.exercise.template.ITemplate;

/**
 * This Rest api will deal with all the user related
 * interaction with the systems. Users may get all the
 * data regarding energy consumption, energy savings
 * and achievements. 
 * 
 * @author pranabd
 *
 */
@Path("/user")
@WebService(name = "User")
public interface IUserActivity {
	
	@GET
	@Path("/getUser/{userId}")
	@Produces(MediaType.APPLICATION_JSON)
    public Response getUser(@PathParam("userId") String userId) throws Exception;
	
	@POST
	@Path("/register")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
    public Response register(LoginVO login) throws Exception;
	
	@POST
	@Path("/login")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
    public Response login(LoginVO login) throws Exception;
	
	@POST
	@Path("/{userId}/getconsumptionrecordByDate")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
    public Response getCosumptionRecordByDate(@PathParam("userId") String userId, ConsumptionVO vo) throws Exception;

	@POST
	@Path("/{userId}/setusustabilitygoals")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
    public Response setSustabilityGoals(@PathParam("userId") String userId, ITemplate template) throws Exception;
	
	@GET
	@Path("/{userId}/getbadges")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
    public Response getBadges(@PathParam("userId") String userId) throws Exception;
	
	@GET
	@Path("/{userId}/getsustainabilityscore")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
    public Response getSustainabilityScore(@PathParam("userId") String userId) throws Exception;
	
	@GET
	@Path("/{userId}/getincentives")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
    public Response getIncentives(@PathParam("userId") String userId) throws Exception;
}
