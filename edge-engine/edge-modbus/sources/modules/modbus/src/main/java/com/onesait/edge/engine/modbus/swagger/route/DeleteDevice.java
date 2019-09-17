package com.onesait.edge.engine.modbus.swagger.route;

import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.onesait.edge.engine.modbus.util.ErrorResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import spark.Request;
import spark.Response;
import spark.Route;

@Api
@Path("/modbus/api/devices/{id}")
@Produces("application/json")
public class DeleteDevice implements Route {

	@DELETE
	@ApiOperation(value = "Delete device", nickname = "DeleteDevice", tags = "Devices")
	@ApiImplicitParams({
			@ApiImplicitParam(required = true, dataType = "string", name = "Authorization", paramType = "header"),
			@ApiImplicitParam(required = true, dataType = "string", name = "id", paramType = "path")
			})
	@ApiResponses(value = {
			@ApiResponse(code = 204, message = "No Content"),
			@ApiResponse(code = 400, message = "Bad Request", response = ErrorResponse.class)
			})
	
	public Object handle(@ApiParam(hidden = true) Request request, @ApiParam(hidden = true) Response response)
			throws Exception {
		return null;
	}
}