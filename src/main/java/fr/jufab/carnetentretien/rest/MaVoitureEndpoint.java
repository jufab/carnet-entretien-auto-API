package fr.jufab.carnetentretien.rest;


import fr.jufab.carnetentretien.domain.MaVoiture;
import fr.jufab.carnetentretien.domain.TypeCarburant;
import fr.jufab.carnetentretien.service.MaVoitureService;
import org.jboss.logging.Logger;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Path("/ma-voiture")
@RequestScoped
@Transactional
public class MaVoitureEndpoint {

    private static final Logger logger = Logger.getLogger(MaVoitureEndpoint.class);

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


}
