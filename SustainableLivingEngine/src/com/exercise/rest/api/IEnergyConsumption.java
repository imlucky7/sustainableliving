package com.exercise.rest.api;

import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.exercise.rest.api.vo.ConsumptionVO;

/**
 * This rest api will store the consumption records.
 * It will receive the consumption data in ConsumptionVO
 * class.
 * 
 * @author pranabd
 *
 */
@Path("/consumption")
@WebService(name = "ConsumptionData")
public interface IEnergyConsumption {
	@POST
	@Path("/store/{userId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
    public Response storeRecord(@PathParam("userId") String userId, ConsumptionVO vo) throws Exception;
}
