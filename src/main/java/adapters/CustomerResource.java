package adapters;

import application.CustomerService;
import core.entity.Customer;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/customers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CustomerResource {

    @Inject
    CustomerService customerService;

    @GET
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @POST
    public Response createCustomer(Customer customer) {
        customerService.createCustomer(customer);
        return Response.status(Response.Status.CREATED).build();
    }
}
