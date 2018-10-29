package fr.jufab.carnetentretien.rest;


import fr.jufab.carnetentretien.domain.dto.CarnetEntretien;
import fr.jufab.carnetentretien.service.CarnetEntretienService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/carnetentretien")
@RequestScoped
public class CarnetEntretienEndpoint {

    private CarnetEntretienService carnetEntretienService;

    public CarnetEntretienEndpoint() {
    }

    @Inject
    public CarnetEntretienEndpoint(CarnetEntretienService carnetEntretienService) {
        this.carnetEntretienService = carnetEntretienService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<CarnetEntretien> getAll() {
        return carnetEntretienService.findAll();
    }

    @GET
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public CarnetEntretien getOne(@PathParam("id") int id) {
        return carnetEntretienService.find(id);
    }


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public CarnetEntretien createCarnetEntretien(CarnetEntretien carnetEntretien) {
        return carnetEntretienService.persist(carnetEntretien);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateCarnetEntretien(CarnetEntretien carnetEntretien) {
        carnetEntretienService.merge(carnetEntretien);
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    public Response DeleteCarnetEntretienById(@PathParam("id") int id) {
        carnetEntretienService.delete(id);
        return Response.ok().build();
    }
}
