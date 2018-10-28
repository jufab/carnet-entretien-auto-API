package fr.jufab.carnetentretien.rest;

import fr.jufab.carnetentretien.domain.dto.Entretien;
import fr.jufab.carnetentretien.domain.dto.MaVoiture;
import fr.jufab.carnetentretien.service.EntretienService;
import org.jboss.logging.Logger;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/entretien")
@RequestScoped
public class EntretienEndpoint {

    private EntretienService entretienService;

    public EntretienEndpoint() {
    }

    @Inject
    public EntretienEndpoint(EntretienService entretienService) {
        this.entretienService = entretienService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Entretien> getAll() {
        return entretienService.findAll();
    }

    @GET
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Entretien getOne(@PathParam("id") int id) {
        return entretienService.find(id);
    }

}
