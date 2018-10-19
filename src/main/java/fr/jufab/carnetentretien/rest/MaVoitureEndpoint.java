package fr.jufab.carnetentretien.rest;


import fr.jufab.carnetentretien.domain.MaVoiture;
import fr.jufab.carnetentretien.service.MaVoitureService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/ma-voiture")
public class MaVoitureEndpoint {

    @Inject
    private MaVoitureService maVoitureService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<MaVoiture> getAll() {
        return maVoitureService.findAll();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public MaVoiture createMaVoiture(MaVoiture uneVoiture) {
        return maVoitureService.persist(uneVoiture);
    }


}
