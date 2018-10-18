package fr.jufab.carnetentretien.rest;


import fr.jufab.carnetentretien.service.MaVoitureService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/ma-voiture")
public class MaVoitureEndpoint {

    @Inject
    private MaVoitureService maVoitureService;

    @GET
    @Produces("text/plain")
    public Response doGet() {
        return Response.ok(maVoitureService.findAll()).build();
    }
}
