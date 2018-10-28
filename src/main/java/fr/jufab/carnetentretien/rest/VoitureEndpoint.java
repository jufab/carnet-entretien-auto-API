package fr.jufab.carnetentretien.rest;


import fr.jufab.carnetentretien.domain.dto.MaVoiture;
import fr.jufab.carnetentretien.service.MaVoitureService;
import org.jboss.logging.Logger;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;


@Path("/voiture")
@RequestScoped
public class VoitureEndpoint {

    @Inject
    private MaVoitureService maVoitureService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<MaVoiture> getAll() {
        return maVoitureService.findAll();
    }

    @GET
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public MaVoiture getOne(@PathParam("id") int id) {
        return maVoitureService.find(id);
    }


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public MaVoiture createMaVoiture(MaVoiture uneVoiture) {
        return maVoitureService.persist(uneVoiture);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateMaVoiture(MaVoiture uneVoiture) {
        maVoitureService.merge(uneVoiture);
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    public Response DeleteMaVoitureById(@PathParam("id") int id) {
        maVoitureService.delete(id);
        return Response.ok().build();
    }
}
