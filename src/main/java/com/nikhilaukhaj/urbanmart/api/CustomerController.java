package com.nikhilaukhaj.urbanmart.api;

import com.nikhilaukhaj.mongo.model.Customer;
import com.nikhilaukhaj.urbanmart.repository.CustomerRespository;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/customer")
public class CustomerController {
    @Inject
    CustomerRespository customerRepository;

    @GET
    public Response getCustomerList(){
        List<Customer> customers = customerRepository.listAll();
        return Response.ok().entity(customers).build();
    }

    @POST
    public Response createCustomer(Customer customer){
        customerRepository.persist(customer);
        return Response.ok().entity(customer.id).build();
    }
}
