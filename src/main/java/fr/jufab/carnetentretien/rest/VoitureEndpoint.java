package fr.jufab.carnetentretien.rest;


import fr.jufab.carnetentretien.domain.dto.Voiture;
import fr.jufab.carnetentretien.service.VoitureService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;


@Path("/voiture")
@RequestScoped
public class VoitureEndpoint {

    private VoitureService voitureService;

    public VoitureEndpoint() {
    }

    @Inject
    public VoitureEndpoint(VoitureService voitureService) {
        this.voitureService = voitureService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Voiture> getAll() {
        return voitureService.findAll();
    }

    @GET
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Voiture getOne(@PathParam("id") int id) {
        return voitureService.find(id);
    }


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Voiture createMaVoiture(Voiture uneVoiture) {
        return voitureService.persist(uneVoiture);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateMaVoiture(Voiture uneVoiture) {
        voitureService.merge(uneVoiture);
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    public Response DeleteMaVoitureById(@PathParam("id") int id) {
        voitureService.delete(id);
        return Response.ok().build();
    }
}
