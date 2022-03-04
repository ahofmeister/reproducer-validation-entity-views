package org.acme;

import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("foods")
public class FoodResource {

  @POST
  @Transactional
  @Consumes(MediaType.APPLICATION_JSON)
  public Response add(@Valid FoodCreateView food) {
    return Response.ok().entity(food).build();
  }


}
